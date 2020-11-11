package com.felipe.biblioteca.AppBiblioteca;

import com.felipe.biblioteca.Prestable;
import com.felipe.biblioteca.Recurso;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List <Recurso> recursosEnBiblioteca;

    public Biblioteca(){
        this.recursosEnBiblioteca = new ArrayList<>();

    }
    public void addRecurso(Recurso recursoAIngresar){
       boolean presenteEnBiblioteca =  recursosEnBiblioteca.stream().filter(tituloRecurso -> tituloRecurso.getNombre() == recursoAIngresar.getNombre()).findAny().isPresent();
       if (!presenteEnBiblioteca){
       this.recursosEnBiblioteca.add(recursoAIngresar);
       }

    }
    public boolean prestarRecurso(Recurso recursoAPrestar){
        if (recursoAPrestar instanceof Prestable){
            ((Prestable) recursoAPrestar).prestar();
            this.recursosEnBiblioteca.add(recursoAPrestar);
            return true;
        }
        return false;

    }

    public boolean devolverRecurso(Recurso recursoADevolver){
        if (recursoADevolver instanceof Prestable){
            ((Prestable) recursoADevolver).devolver();
            this.recursosEnBiblioteca.remove(recursoADevolver);
            return true;
        }
        return false;

    }
    public List<Recurso> listarPrestados(){
     return this.recursosEnBiblioteca;

    }
}
