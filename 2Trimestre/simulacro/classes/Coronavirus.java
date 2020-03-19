package classes;

import interfaces.Enfermedad;

public class Coronavirus implements Enfermedad{

    private String codigo = "123C";

    //-------------------------------------------------

    @Override
    public String toString(){
        return "Enfermedad: Coronavirus - "+this.codigo;
    }

    //--------------------------------------------------

    public void contagiar(Paciente paciente){
        paciente.enfermar(new Coronavirus());
    }

    //--------------------------------------------------
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
}