package classes;

public class Adulto extends Persona {

    public Adulto() {}

    public Adulto(String nombre) {
        super(nombre);
    }

    @Override //Sobreescribe
    public String toString() {
        return super.toString() + nombre;
    }
}