package com.apiRest.gestorPropuestas.controllers;

import com.apiRest.gestorPropuestas.entities.Colaboracion;
import com.apiRest.gestorPropuestas.entities.Propuesta;
import com.apiRest.gestorPropuestas.repositorios.ColabRepo;
import com.apiRest.gestorPropuestas.repositorios.PropuestaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1") //empiezan con esta base
public class ColaboracionController {

    @Autowired //instancia del repo jpa de las colaboraciones
    private ColabRepo colabRepo;

    @Autowired //repo de propuestasa
    private PropuestaRepo propuestaRepo;

    //GET /propuestas/{titulo}/colaboraciones lista las colaboraciones d una propuesta especifica
    @GetMapping("/propuestas/{titulo}/colaboraciones")
    public ResponseEntity<?> listarPorPropuesta(@PathVariable String titulo) {
        Propuesta prop = propuestaRepo.findById(titulo).orElse(null);
        if (prop == null) {
            return ResponseEntity.status(404).body("Propuesta no encontrada");
        }
        List<Colaboracion> colaboraciones = colabRepo.findAll().stream()
                .filter(c -> c.getPropuesta() != null &&
                        c.getPropuesta().getTitulo().equalsIgnoreCase(titulo))
                .toList();
        return ResponseEntity.ok(colaboraciones);
    }

    // POST /propuestas/{titulo}/colaboraciones registramos colaboracion a una prop
    @PostMapping("/propuestas/{titulo}/colaboraciones")
    public ResponseEntity<String> registrar(@PathVariable String titulo, @RequestBody Colaboracion colab) {
        Propuesta prop = propuestaRepo.findById(titulo).orElse(null);
        if (prop == null) {
            return ResponseEntity.status(404).body("Propuesta no encontrada");
        }
        colab.setPropuesta(prop);
        colabRepo.save(colab);
        return ResponseEntity.status(201).body("Colaboración registrada correctamente");
    }

    // GET /colaboraciones?colaboradorNick lista las colaboraciones de un colaborador
    @GetMapping("/colaboraciones")
    public ResponseEntity<?> listarPorColaborador(@RequestParam String colaboradorNick) {
        List<Colaboracion> colaboraciones = colabRepo.findAll().stream()
                .filter(c -> c.getColaborador() != null &&
                        c.getColaborador().getNickname().equalsIgnoreCase(colaboradorNick))
                .toList();
        return ResponseEntity.ok(colaboraciones);
    }

    // DELETE /colaboraciones/{id} borra una colaboracion por el id
    @DeleteMapping("/colaboraciones/{id}")
    public ResponseEntity<String> eliminar(@PathVariable int id) {
        if (!colabRepo.existsById(id)) {
            return ResponseEntity.status(404).body("Colaboración no encontrada");
        }
        colabRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // GET /colaboraciones/total?propuestaTitulo=...
    // trae el total recaudado por colaboraciones en una prop si le pasamos el titulo, sino trae
    // el total de TODAS las colab
    @GetMapping("/colaboraciones/total")
    public ResponseEntity<?> total(@RequestParam(required = false) String propuestaTitulo) {
        double total = colabRepo.findAll().stream()
                .filter(c -> propuestaTitulo == null ||
                        (c.getPropuesta() != null &&
                                c.getPropuesta().getTitulo().equalsIgnoreCase(propuestaTitulo)))
                .mapToDouble(Colaboracion::getMonto)
                .sum();

        return ResponseEntity.ok().body("{\"total\": " + total + "}");
    }
}
