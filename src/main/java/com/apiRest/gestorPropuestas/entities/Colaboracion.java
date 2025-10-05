package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.ETipoRetorno;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "COLABORACION")
public class Colaboracion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Integer monto;

    @Enumerated(EnumType.STRING)
    private ETipoRetorno retorno;

    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "PROPUESTA_TITULO")
    private Propuesta propuesta;

    @ManyToOne
    @JoinColumn(name = "COLABORADOR_NICKNAME")
    private Colaborador colaborador;

    public Colaboracion() {
    }

    public Colaboracion(int id, Integer monto, ETipoRetorno retorno,
                        LocalDateTime fecha, Propuesta propuesta, Colaborador colaborador) {
        this.id = id;
        this.monto = monto;
        this.retorno = retorno;
        this.fecha = fecha;
        this.propuesta = propuesta;
        this.colaborador = colaborador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public ETipoRetorno getRetorno() {
        return retorno;
    }

    public void setRetorno(ETipoRetorno retorno) {
        this.retorno = retorno;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
}
