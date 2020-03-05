package classes;

import interfaces.*;

public class Anciano implements Persona{
    String nombre;

    public Anciano() {
        this.nombre = "Desconocido";
    }

    public Anciano(String nombre) {
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