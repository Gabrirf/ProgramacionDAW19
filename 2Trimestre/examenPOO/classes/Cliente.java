package classes;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    ArrayList<Libro> libros;
    double dinero;

    //-----------------------------------------------------------------

    public Cliente () {}
    public Cliente (String nombre, ArrayList<Libro> libros, double dinero){
        this.nombre = nombre;
        this.libros = libros;
        this.dinero = dinero;
    }

    //-------------------------------------------------------------------

    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }
    public double getDinero(){
        return this.dinero;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setLibros(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public void setDinero(double dinero){
        this.dinero = dinero;
    }

    //--------------------------------------------------------------------

    @Override
    public String toString(){
        return this.nombre+" - "+this.libros.size()+" - "+this.dinero;
    }

    //--------------------------------------------------------------------

    public void pagarLibro(double precio){
        this.dinero -= precio;
    }

    public void addLibro(Libro libro){
        this.libros.add(libro);
    }

    public int getNumeroLibros(){
        return this.libros.size();
    }
}