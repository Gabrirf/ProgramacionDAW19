package classes;

public class Personas {
    String nombre;

    public Personas() {
        this.nombre = "Desconocido";
    }

    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public void saluda(){
        System.out.println("Hola!");
    }
}