package classes;
import interfaces.*;
import java.util.ArrayList;

public class Adulto extends Paciente{
    public Adulto(){
        super();
    }
    public Adulto(String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades){
        super(nombre, edad, sexo, enfermedades);
    }
}