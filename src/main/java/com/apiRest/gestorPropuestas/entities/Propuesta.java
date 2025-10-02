package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.ETipoRetorno;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propuesta {

    String titulo;
    String descripcion;
    String imagen;
    String lugar;
    LocalDate fecha;
    Integer precioEntrada;
    Integer montoAReunir;
    LocalDate fechaPublicacion;

    Categoria categoria;
    Estado estadoActual;
    List<Estado> historialEstados = new ArrayList<>();
    Proponente proponente;

    List<ETipoRetorno> retornos;
    List<Colaboracion> colaboraciones;

    public Propuesta() {}

    public Propuesta(String titulo, String descripcion, String imagen, String lugar, LocalDate fecha, Integer precioEntrada, Integer montoAReunir, LocalDate fechaPublicacion,
                     Categoria categoria, List<Estado> historialEstados, Proponente proponente, List<ETipoRetorno> retornos) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.lugar = lugar;
        this.fecha = fecha;
        this.precioEntrada = precioEntrada;
        this.montoAReunir = montoAReunir;
        this.fechaPublicacion = fechaPublicacion;
        this.categoria = categoria;
        this.historialEstados = historialEstados;
        this.proponente = proponente;
        this.retornos = retornos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Integer getMontoAReunir() {
        return montoAReunir;
    }

    public void setMontoAReunir(Integer montoAReunir) {
        this.montoAReunir = montoAReunir;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public List<Estado> getHistorialEstados() {
        return historialEstados;
    }

    public void setHistorialEstados(List<Estado> historialEstados) {
        this.historialEstados = historialEstados;
    }

    public Proponente getProponente() {
        return proponente;
    }

    public void setProponente(Proponente proponente) {
        this.proponente = proponente;
    }

    public List<ETipoRetorno> getRetornos() {
        return retornos;
    }

    public void setRetornos(List<ETipoRetorno> retornos) {
        this.retornos = retornos;
    }

    public List<Colaboracion> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(List<Colaboracion> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }
}
