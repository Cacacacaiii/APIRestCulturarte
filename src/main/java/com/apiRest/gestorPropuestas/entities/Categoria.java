package com.apiRest.gestorPropuestas.entities;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    String nombre;
    Categoria catPadre;

    private List<Categoria> subCategorias = new ArrayList<>();

    public Categoria(){}

    public Categoria(String nombre, Categoria catPadre){
        this.nombre = nombre;
        this.catPadre = catPadre;
    }

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
