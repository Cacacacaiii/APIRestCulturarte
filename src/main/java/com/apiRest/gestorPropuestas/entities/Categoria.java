package com.apiRest.gestorPropuestas.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "CATPADRE_NOMBRE")
    private Categoria catPadre;

    @OneToMany(mappedBy = "catPadre")
    private List<Categoria> subCategorias = new ArrayList<>();

    public Categoria() {}

    public Categoria(String nombre, Categoria catPadre) {
        this.nombre = nombre;
        this.catPadre = catPadre;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCatPadre() {
        return catPadre;
    }

    public void setCatPadre(Categoria catPadre) {
        this.catPadre = catPadre;
    }
}
