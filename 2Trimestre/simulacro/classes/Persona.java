package classes;

public abstract class Persona {
    protected  String nombre;
    protected int edad;
    protected char sexo;

    public Persona () {}
    public Persona (String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public char getSexo(){
        return this.sexo;
    }

    @Override
    public String toString(){
        return this.nombre+" || "+this.edad+" || "+this.sexo+" || ";
    }

}