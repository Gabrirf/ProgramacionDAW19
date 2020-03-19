package classes;

public class Sanitario extends Persona {

    private String categoria;

    //-------------------------------------------------------------------
    public Sanitario () {
        super();
    }
    public Sanitario (String nombre, int edad, char sexo, String categoria){
        super(nombre, edad, sexo);
        this.categoria = categoria;
    }

    //-------------------------------------------------------------------
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getCategoria(){
        return this.categoria;
    }

    @Override
    public String toString(){
        return super.toString()+this.categoria;
    }

    //-------------------------------------------------------------------
    public boolean diagnosticar(Paciente paciente){
        if(paciente.getEdad()<18){
            if(paciente.getEnfermedades().size()>0){
                System.out.println("El paciente puede curarse");
                return true;
            }else{
                System.out.println("Paciente Sano");
                return true;
            }
        }

        if(paciente.getEdad()>=18 && paciente.getEdad()<=50){
            if(paciente.getEnfermedades().size()>0){
                System.out.println("Puede curarse");
                return true;
            }else{
                System.out.println("Paciente Sano");
                return true;
            }
        }else{
            if(paciente.getEnfermedades().size()>0){
                System.out.println("El paciente morira");
                return false;
            }else{
                System.out.println("Paciente Sano");
                return true;
            }
        }
    }
    public Paciente curar(Paciente paciente){
        paciente.curarse();
        return paciente;
    }
}