package com.felipe.biblioteca;

public class Diccionario extends Recurso implements Prestable {


    public Diccionario(boolean prestado, String nombre, String ubicacion) {
        super(prestado, nombre, ubicacion);
    }


    @Override
    public boolean prestar() {
        this.prestado = true;
        return true;
    }

    @Override
    public boolean devolver() {
        this.prestado = true;
        return true;
    }
    @Override
    public String toString() {
        return "Diccinonario : " + getNombre();
    }
}
