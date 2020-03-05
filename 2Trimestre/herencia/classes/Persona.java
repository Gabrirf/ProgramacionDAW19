package classes;

public class Persona {
    String nombre;

    public Persona() {
        this("Desconocido"); //Con esto llama al siguiente constructor pasandole String nombre Desconocido
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override //Sobreescribe
    public String toString() {
        return "Persona: " + nombre;
    }
}