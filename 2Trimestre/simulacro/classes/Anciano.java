package classes;
import interfaces.*;
import java.util.ArrayList;

public class Anciano extends Paciente{
    public Anciano(){
        super();
    }
    public Anciano(String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades){
        super(nombre, edad, sexo, enfermedades);
    }
}