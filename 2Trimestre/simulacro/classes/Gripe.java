package classes;

import interfaces.Enfermedad;

public class Gripe implements Enfermedad{

    private String codigo = "123G";

    //-------------------------------------------------

    @Override
    public String toString(){
        return "Enfermedad: Gripe - "+this.codigo;
    }

    //--------------------------------------------------

    public void contagiar(Paciente paciente){
        paciente.enfermar(new Gripe());
    }

    //--------------------------------------------------
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return this.codigo;
    }
}