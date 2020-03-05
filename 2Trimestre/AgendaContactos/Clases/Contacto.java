package Clases;

public class Contacto {
    public String nombre = "Mario";
    public String telefono = "6454532";

    @Override  // Para sobrescribir algo existente
    public String toString(){
        return this.nombre + " : "+ this.telefono;
    }
}
