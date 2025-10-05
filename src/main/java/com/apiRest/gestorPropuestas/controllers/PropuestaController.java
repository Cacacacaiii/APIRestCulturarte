package com.apiRest.gestorPropuestas.controllers;

import com.apiRest.gestorPropuestas.entities.Propuesta;
import com.apiRest.gestorPropuestas.repositorios.PropuestaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/propuestas") //ruta base para todos los endpoints
public class PropuestaController {

    @Autowired // trae la instancia del repo que usa jpa para hablar con la base de datos
    private PropuestaRepo propuestaRepo;

    //GET /propuestas devuelve una lista con todas las prop
    @GetMapping
    public ResponseEntity<List<Propuesta>> listar() {
        List<Propuesta> propuestas = propuestaRepo.findAll();
        return ResponseEntity.ok(propuestas);
    }

    //POST /propuestas crea una propuesta con lo que le manda en el cuerpo del json
    @PostMapping
    public ResponseEntity<String> crear(@RequestBody Propuesta propuesta) {
        if (propuestaRepo.existsById(propuesta.getTitulo())) {
            return ResponseEntity.badRequest().body("Ya existe una propuesta con ese título");
        }
        propuestaRepo.save(propuesta);
        return ResponseEntity.status(201).body("Propuesta creada correctamente");
    }

    // GET /propuestas/{titulo} devuevle una prop por su titulo
    @GetMapping("/{titulo}")
    public ResponseEntity<?> obtener(@PathVariable String titulo) {
        return propuestaRepo.findById(titulo)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(404).body("Propuesta no encontrada"));
    }

    // PUT /propuestas/{titulo} actualiza una propuesta, pasandole el titulo y reemplaza los datos
    @PutMapping("/{titulo}")
    public ResponseEntity<String> actualizar(@PathVariable String titulo, @RequestBody Propuesta propuesta) {
        if (!propuestaRepo.existsById(titulo)) {
            return ResponseEntity.status(404).body("Propuesta no encontrada");
        }
        propuesta.setTitulo(titulo);
        propuestaRepo.save(propuesta);
        return ResponseEntity.ok("Propuesta actualizada");
    }

    // DELETE /propuestas/{titulo} elimina por su titulo
    @DeleteMapping("/{titulo}")
    public ResponseEntity<String> eliminar(@PathVariable String titulo) {
        if (!propuestaRepo.existsById(titulo)) {
            return ResponseEntity.status(404).body("Propuesta no encontrada");
        }
        propuestaRepo.deleteById(titulo);
        return ResponseEntity.noContent().build();
    }
}

