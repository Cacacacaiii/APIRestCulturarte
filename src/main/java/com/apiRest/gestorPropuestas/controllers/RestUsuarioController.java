package com.apiRest.gestorPropuestas.controllers;

import com.apiRest.gestorPropuestas.entities.Colaboracion;
import com.apiRest.gestorPropuestas.entities.Propuesta;
import com.apiRest.gestorPropuestas.entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestUsuarioController {

    private static final List<Usuario> usuarios = new ArrayList<>();

    List<Propuesta> propuestas = new ArrayList<>(); //Esto tendria que pedir la lista al servidor central
    List<Colaboracion> colaboraciones = new ArrayList<>(); //Esto tendria que pedir las col al servidor central

    static{
        usuarios.add(new Usuario(1, "Crepi", "Luca", "Crespi", "Ass", "LuquitaCrespi@gmail.com", LocalDate.of(2004, 10, 28), "asda"));
        usuarios.add(new Usuario(2, "Fede", "Federico", "Valdez", "Culo", "FedeValdez@gmail.com", LocalDate.of(2003, 07, 11), "aass"));
        usuarios.add(new Usuario(3, "Andre", "Andres", "Ferreira", "Retraguardia", "AndreFerreira@gmail.com", LocalDate.of(2005, 01, 07), "ass"));
    }

    @GetMapping("/")
    public String home(){
        return "ARRIBA EL CHIVITO CARAJOOO";
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst().orElse(null);
    }

    @DeleteMapping("/usuario/{id}")
    public String borrarUsuario(@PathVariable int id){
        Usuario usuario = usuarios.stream().filter(e  -> e.getId() == id).findFirst().orElse(null);

        if(usuario != null){
            usuarios.remove(usuario);
            return "Usuario eliminado correctamente";
        }else{
            return "Usuario no encontrado";
        }

    }

    @PostMapping("/usuario/")
    public String crearUsuario(@RequestBody Usuario usuario){

        int id = usuarios.stream().mapToInt(Usuario::getId).max().orElse(0) + 1;

        usuario.setId(id);
        usuarios.add(usuario);

        return "Usuario creado correctamente";

    }

    @PutMapping("/usuario/{id}")
    public String actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario){

        Usuario usuarioAct = usuarios.stream().filter(e  -> e.getId() == id).findFirst().orElse(null);

        if(usuarioAct != null){

            usuarioAct.setNickname(usuario.getNickname());
            usuarioAct.setNombre(usuario.getNombre());
            usuarioAct.setApellido(usuario.getApellido());
            usuarioAct.setContrasenia(usuario.getContrasenia());
            usuarioAct.setCorreo(usuario.getCorreo());
            usuarioAct.setFechaNac(usuario.getFechaNac());
            usuarioAct.setDirImagen(usuario.getDirImagen());

            return "Usuario actualizado correctamente";

        }else{

            return "Usuario no encontrado";

        }

    }

    @GetMapping("/colaboraciones")
    public List<Colaboracion> getColaboraciones(){
        return colaboraciones;
    }

    @DeleteMapping("/colaboracion/{id}")
    public String borrarColaboraciones(@PathVariable int id){
        List<Colaboracion> colaboraciones = getColaboraciones();

        Colaboracion colaboracion = colaboraciones.stream().filter(e  -> e.getId() == id).findFirst().orElse(null);

        if(colaboracion != null){
            colaboraciones.remove(colaboracion);
            return "Colaboracion eliminada correctamente";
        }else{
            return "Colaboracion no encontrada";
        }
    }

    @GetMapping("/colaboraciones/total")
    public List<Colaboracion> getColaboracionesTotal(){
        //No se si quiere el total de todas las colaboraciones
        //O el total de colaboraciones de cada propuesta
        List<Colaboracion> colaboraciones = new ArrayList<>(); //Esto llamaria a una funcion total en el servidor central

        return colaboraciones;
    }

    @GetMapping("/propuestas")
    public List<Propuesta> getPropuestas(){
        return propuestas;
    }

    @PostMapping("/propuesta/")
    public String crearPropuesta(@RequestBody Propuesta propuesta){

        propuestas.add(propuesta);

        return "Propuesta creada correctamente";
    }

    @GetMapping("/propuesta/{titulo}/colaboraciones")
    public List<Propuesta> getColaboracionesPropuesta(@PathVariable String titulo){ //Esto es 1 propuesta y 1 lista de colaboraciones
        return propuestas;
    }

    @PostMapping("/propuesta/{titulo}/colaboraciones")
    public String crearColaboracionPropuesta(@PathVariable String titulo, @RequestBody Propuesta propuesta){
        Propuesta prop = propuestas.stream().filter(e  -> e.getTitulo().equals(titulo)).findFirst().orElse(null);

        if(prop != null){
            //Aca deberia estar el codigo para linkear la colaboracion con la propuesta
            return "Colaboracion creada correctamente";
        }else{
            return "La propuesta no existe";
        }

    }

    @DeleteMapping("/propuesta/{titulo}")
    public String borrarPropuesta(@PathVariable String titulo){
        Propuesta prop = propuestas.stream().filter(e  -> e.getTitulo().equals(titulo)).findFirst().orElse(null);

        if(prop != null){
            propuestas.remove(prop);
            return "Propuesta eliminada correctamente";
        }else{
            return "Propuesta no encontrada";
        }
    }

    @GetMapping("/propuestas/{titulo}")
    public Propuesta getPropuesta(@PathVariable String titulo){
        return propuestas.stream().filter(e  -> e.getTitulo().equals(titulo)).findFirst().orElse(null);
    }

    @PutMapping("/propuesta/{titulo}")
    public String actualizarPropuesta(@PathVariable String titulo, @RequestBody Propuesta propuesta){
        Propuesta prop = getPropuesta(titulo);

        if(prop != null){
            prop.setTitulo(propuesta.getTitulo());
            prop.setDescripcion(propuesta.getDescripcion());
            prop.setImagen(propuesta.getImagen());
            prop.setLugar(propuesta.getLugar());
            prop.setFecha(propuesta.getFecha());
            prop.setPrecioEntrada(propuesta.getPrecioEntrada());
            prop.setMontoAReunir(propuesta.getMontoAReunir());
            prop.setFechaPublicacion(propuesta.getFechaPublicacion());

            prop.setCategoria(propuesta.getCategoria());
            prop.setEstadoActual(propuesta.getEstadoActual());
            prop.setProponente(propuesta.getProponente());

            prop.setRetornos(propuesta.getRetornos());
            prop.setColaboraciones(propuesta.getColaboraciones());

            return "Propuesta actualizada correctamente";
        }else{
            return "Propuesta no encontrada";
        }
    }

}
