package com.apiRest.gestorPropuestas.controllers;

import com.apiRest.gestorPropuestas.entities.Usuario;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestUsuarioController {

    private static final List<Usuario> usuarios = new ArrayList<>();

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

}
