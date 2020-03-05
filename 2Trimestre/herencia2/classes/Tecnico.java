package classes;

public class Tecnico extends Operario {
    public Tecnico(){
        this("DesconocidoTec");
    }

    public Tecnico(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" ->tecnico";
    }

}