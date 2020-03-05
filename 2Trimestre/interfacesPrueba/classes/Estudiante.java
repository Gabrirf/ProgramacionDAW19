package classes;

import interfaces.*;

public class Estudiante implements Persona{
    String nombre;

    public Estudiante() {
        this.nombre = "Desconocido";
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public void saludar() {
        System.out.println("Hola!");
    }

}