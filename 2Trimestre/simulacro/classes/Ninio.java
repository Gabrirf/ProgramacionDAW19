package classes;
import interfaces.*;
import java.util.ArrayList;

public class Ninio extends Paciente{
    public Ninio(){
        super();
    }
    public Ninio(String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades){
        super(nombre, edad, sexo, enfermedades);
    }

}