package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.EEstadoPropuesta;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ESTADO")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private EEstadoPropuesta nombre;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "PROPUESTA_TITULO")
    private Propuesta propuesta;

    public Estado() {}

    public Estado(EEstadoPropuesta nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    // Getters y Setters
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
