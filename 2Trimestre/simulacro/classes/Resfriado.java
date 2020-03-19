package classes;

import interfaces.Enfermedad;

public class Resfriado implements Enfermedad{

    private String codigo = "123R";

    //-------------------------------------------------

    @Override
    public String toString(){
        return "Enfermedad: Resfriado - "+this.codigo;
    }

    //--------------------------------------------------
    
    public void contagiar(Paciente paciente){
        paciente.enfermar(new Resfriado());
    }

    //--------------------------------------------------
    
    public Persona contagiar(Persona persona){
        return persona;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
}