package com.apiRest.gestorPropuestas.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(unique = true, nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String apellido;

    @Column(nullable = false)
    private String contrasenia;

    @Column(nullable = false, length = 100)
    private String correo;

    @Column(name = "FECHANAC")
    private LocalDate fechaNac;

    @Column(name = "DIRIMAGEN")
    private String dirImagen;

    public Usuario() {}

    public Usuario (String nickname, String nombre, String apellido,
                   String contrasenia, String correo, LocalDate fechaNac, String dirImagen) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.fechaNac = fechaNac;
        this.dirImagen = dirImagen;
    }

    // Getters y Setters

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getContrasenia() { return contrasenia; }
    public void setContrasenia(String contrasenia) { this.contrasenia = contrasenia; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public LocalDate getFechaNac() { return fechaNac; }
    public void setFechaNac(LocalDate fechaNac) { this.fechaNac = fechaNac; }

    public String getDirImagen() { return dirImagen; }
    public void setDirImagen(String dirImagen) { this.dirImagen = dirImagen; }
}
