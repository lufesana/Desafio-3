package com.felipe.biblioteca;

public abstract class Recurso {

    private String nombre;
    private String ubicacion;
    protected boolean prestado;
    protected boolean devuelto;

    public Recurso(boolean prestado, String nombre, String ubicacion) {
        this.prestado = prestado;
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

}
