package classes;

public class Anciano extends Persona {

    public Anciano() {}

    public Anciano(String nombre) {
        super(nombre);
    }

    @Override //Sobreescribe
    public String toString() {
        return super.toString() + nombre;
    }
}