package com.felipe.biblioteca;

public class Libro extends Recurso implements Prestable {

    private String isbn;


    public Libro(boolean prestado, String nombre, String ubicacion, String isbn) {
        super(prestado, nombre, ubicacion);
        this.isbn = isbn;
    }

    @Override
    public boolean prestar() {
        this.prestado = false;
        return true;
    }

    @Override
    public boolean devolver() {
        this.prestado = true;
        return true;
    }
    @Override
    public String toString() {
        return "Libro : " + getNombre();
    }
}
