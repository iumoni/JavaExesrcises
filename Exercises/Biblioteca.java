package Exercises;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public boolean prestarLibro(Libro libro, Usuario usuario) {
        if (!libro.isPrestado()) {
            libro.setPrestado(true);
            return true;
        }
        return false;
    }

}