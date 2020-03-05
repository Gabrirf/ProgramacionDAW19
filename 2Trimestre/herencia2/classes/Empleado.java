package classes;
public class Empleado {
    String nombre;

    public Empleado(){
        this("Desconocido");
    }

    public Empleado(String nombre){
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
        return "Nombre: "+this.nombre+" ->empleado";
    }
}