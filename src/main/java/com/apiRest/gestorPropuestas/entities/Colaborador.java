package com.apiRest.gestorPropuestas.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COLABORADOR")
public class Colaborador extends Usuario {

    @OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Colaboracion> colaboraciones = new ArrayList<>();

    public Colaborador() {}

    public Colaborador(String nickname, String nombre, String apellido,
                       String contrasenia, String correo, LocalDate fechaNac, String dirImagen) {
        super(nickname, nombre, apellido, contrasenia, correo, fechaNac, dirImagen);
    }

    public List<Colaboracion> getColaboraciones() { return colaboraciones; }
    public void setColaboraciones(List<Colaboracion> colaboraciones) { this.colaboraciones = colaboraciones; }
}

