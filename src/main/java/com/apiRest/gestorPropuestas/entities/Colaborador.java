package com.apiRest.gestorPropuestas.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Usuario{

    private List<Colaboracion> colaboraciones = new ArrayList<>();

    public Colaborador() {}

    public Colaborador(int id, String nickname, String nombre, String apellido, String contrasenia, String correo, LocalDate fechaNac, String dirImagen){
        super(id, nickname, nombre, apellido, contrasenia, correo, fechaNac, dirImagen);
    }

    public List<Colaboracion> getColaboraciones() { return colaboraciones;}

    public void setColaboraciones(List<Colaboracion> c){ this.colaboraciones = c;}

}
