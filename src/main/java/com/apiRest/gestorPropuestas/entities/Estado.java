package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.EEstadoPropuesta;

import java.time.LocalDate;

public class Estado {
    int id;
    EEstadoPropuesta nombre;
    LocalDate fecha;

    Propuesta propuesta;

    public Estado(){}

    public Estado(EEstadoPropuesta nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public EEstadoPropuesta getNombre() {
        return nombre;
    }

    public void setNombre(EEstadoPropuesta nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }
}
