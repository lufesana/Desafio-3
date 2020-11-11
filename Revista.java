package com.felipe.biblioteca;

public class Revista extends Recurso implements Prestable {


    public Revista(boolean prestado, String nombre, String ubicacion) {
        super(prestado, nombre, ubicacion);
    }

    @Override
    public boolean prestar() {
        this.prestado = true;
        return false;
    }

    @Override
    public boolean devolver() {
        this.prestado = true;
        return true;
    }
    @Override
    public String toString() {
        return "Revista : " + getNombre();
    }
}
