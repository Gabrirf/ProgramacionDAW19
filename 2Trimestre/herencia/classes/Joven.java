package classes;

public class Joven extends Persona{

    public Joven() {}

    public Joven(String nombre) {
        super(nombre);
    }

    @Override //Sobreescribe
    public String toString() {
        return super.toString() + nombre;
    }
}