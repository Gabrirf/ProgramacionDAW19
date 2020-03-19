package classes;
import interfaces.*;
import java.util.ArrayList;

public abstract class Paciente extends Persona {

    private ArrayList<Enfermedad> enfermedades;

    //-------------------------------------------------------------------

    public Paciente () {
        super();
    }
    public Paciente (String nombre, int edad, char sexo, ArrayList<Enfermedad> enfermedades){
        super(nombre, edad, sexo);
        this.enfermedades = enfermedades;
    }

    //-------------------------------------------------------------------

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades){
        this.enfermedades = enfermedades;
    }

    public ArrayList<Enfermedad> getEnfermedades(){
        return this.enfermedades;
    }

    //--------------------------------------------------------------------

    @Override
    public String toString(){
        return super.toString()+" tiene "+this.enfermedades.size()+ " enfermedades";
    }

    //-------------------------------------------------------------------
    
    public void enfermar(Enfermedad enfermedad){
        this.enfermedades.add(enfermedad);
    }

    public void transmitirEnfermedades(ArrayList<Enfermedad> enfermedades){
        this.enfermedades.addAll(enfermedades);
    }

    public void curarse() {
        this.enfermedades.clear();
    }

    //-------------------------------------------------------------------

    public void pintarEnfermedades(){

    }

    public void saludar(Paciente paciente){
        paciente.transmitirEnfermedades(this.enfermedades);
        
    }
}