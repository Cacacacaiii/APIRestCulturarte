package com.apiRest.gestorPropuestas.entities;

public class Seguimiento {

    int id;

    Usuario usuarioSeguidor;
    String usuarioSeguido;

    public Seguimiento() {}

    public Seguimiento(int id, Usuario usuarioSeguidor, String usuarioSeguido) {
        this.id = id;
        this.usuarioSeguidor = usuarioSeguidor;
        this.usuarioSeguido = usuarioSeguido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuarioSeguidor() {
        return usuarioSeguidor;
    }

    public void setUsuarioSeguidor(Usuario usuarioSeguidor) {
        this.usuarioSeguidor = usuarioSeguidor;
    }

    public String getUsuarioSeguido() {
        return usuarioSeguido;
    }

    public void setUsuarioSeguido(String usuarioSeguido) {
        this.usuarioSeguido = usuarioSeguido;
    }
}
