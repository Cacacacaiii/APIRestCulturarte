package com.apiRest.gestorPropuestas.entities;

import com.apiRest.gestorPropuestas.enums.ETipoRetorno;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PROPUESTA")
public class Propuesta {

    @Id
    @Column(length = 100)
    private String titulo;

    @Lob
    private String descripcion;

    private String imagen;
    private String lugar;
    private LocalDate fecha;
    @Column(name = "PRECIOENTRADA")
    private Integer precioEntrada;
    @Column (name = "MONTOAREUNIR")
    private Integer montoAReunir;

    @Column(name = "FECHAPUBLICACION")
    private LocalDate fechaPublicacion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "CATEGORIA_NOMBRE")
    private Categoria categoria;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ESTADOACTUAL_ID")
    private Estado estadoActual;

    @OneToMany(mappedBy = "propuesta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Colaboracion> colaboraciones = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "PROPONENTE_NICKNAME")
    private Proponente proponente;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "PROPUESTA_RET",
            joinColumns = @JoinColumn(name = "PROPUESTA_TITULO")
    )
    @Column(name = "RETORNO")
    @Enumerated(EnumType.STRING)
    private List<ETipoRetorno> retornos = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estado> historialEstados = new ArrayList<>();


    public Propuesta() {
    }

    public Propuesta(String titulo, String descripcion, String imagen, String lugar, LocalDate fecha,
                     Integer precioEntrada, Integer montoAReunir, LocalDate fechaPublicacion,
                     Categoria categoria, List<Estado> historialEstados, Proponente proponente,
                     List<ETipoRetorno> retornos) {
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



    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Integer getPrecioEntrada() { return precioEntrada; }
    public void setPrecioEntrada(Integer precioEntrada) { this.precioEntrada = precioEntrada; }

    public Integer getMontoAReunir() { return montoAReunir; }
    public void setMontoAReunir(Integer montoAReunir) { this.montoAReunir = montoAReunir; }

    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Estado getEstadoActual() { return estadoActual; }
    public void setEstadoActual(Estado estadoActual) { this.estadoActual = estadoActual; }

    public List<Estado> getHistorialEstados() { return historialEstados; }
    public void setHistorialEstados(List<Estado> historialEstados) { this.historialEstados = historialEstados; }

    public Proponente getProponente() { return proponente; }
    public void setProponente(Proponente proponente) { this.proponente = proponente; }

    public List<ETipoRetorno> getRetornos() { return retornos; }
    public void setRetornos(List<ETipoRetorno> retornos) { this.retornos = retornos; }

    public List<Colaboracion> getColaboraciones() { return colaboraciones; }
    public void setColaboraciones(List<Colaboracion> colaboraciones) { this.colaboraciones = colaboraciones; }
}
