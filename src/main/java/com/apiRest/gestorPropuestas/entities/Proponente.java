package com.apiRest.gestorPropuestas.entities;

import java.time.LocalDate;

public class Proponente extends Usuario {

    String direccion;
    String biografia;
    String link;

    public Proponente() {}

    public Proponente(int id, String nickname, String nombre, String apellido, String contrasenia, String correo, LocalDate fechaNac, String dirImagen, String direccion, String biografia, String link) {
        super(id, nickname, nombre, apellido, contrasenia, correo, fechaNac, dirImagen);
        this.direccion = direccion;
        this.biografia = biografia;
        this.link = link;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
