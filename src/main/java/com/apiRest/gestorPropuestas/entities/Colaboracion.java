package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.ETipoRetorno;

import java.time.LocalDateTime;

public class Colaboracion {

    int id;
    Integer monto;
    ETipoRetorno retorno;
    LocalDateTime fecha;

    Propuesta propuesta;
    Colaborador colaborador;

    public Colaboracion(int id, Integer monto, ETipoRetorno retorno, LocalDateTime fecha, Propuesta propuesta, Colaborador colaborador) {
        this.id = id;
        this.monto = monto;
        this.retorno = retorno;
        this.fecha = fecha;
        this.propuesta = propuesta;
        this.colaborador = colaborador;
    }

    public Colaboracion() {}

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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public ETipoRetorno getRetorno() {
        return retorno;
    }

    public void setRetorno(ETipoRetorno retorno) {
        this.retorno = retorno;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }
}
