package Clases;


public class Agenda {
    public int cantidad = 0;
    public String[][] listado = new String[cantidad][2];

    public String[][] add(String nombre, String telefono, String[][] listado, int cantidadP){
        
        listado[cantidadP][0] = nombre;
        listado[cantidadP][1] = telefono;

        return listado;
    }
}