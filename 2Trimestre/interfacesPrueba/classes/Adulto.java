package classes;

import interfaces.*;

public class Adulto implements Persona{
    String nombre;

    public Adulto() {
        this.nombre = "Desconocido";
    }

    public Adulto(String nombre) {
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