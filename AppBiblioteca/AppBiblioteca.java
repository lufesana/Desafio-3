package com.felipe.biblioteca.AppBiblioteca;

import com.felipe.biblioteca.*;

public class AppBiblioteca {

    public static void main(String[] args) {

        Biblioteca bibliotecaPublica = new Biblioteca();

        Libro libro = new Libro (true, "El arte de la guerra", "A3", "356-56");
        Revista revista = new Revista (false, "La Red", "A1");
        Diccionario diccionario = new Diccionario(true, "Sinomos y Antonimos", "B7");
        Tesis tesis = new Tesis(true, "calentamientoGlobal2021", "M1");


        bibliotecaPublica.prestarRecurso(libro);
        bibliotecaPublica.prestarRecurso(revista);
        bibliotecaPublica.prestarRecurso(diccionario);
        bibliotecaPublica.prestarRecurso(tesis);




        System.out.println(" Por fuera de la blioteca están: "
                + bibliotecaPublica.listarPrestados());

    }
}
