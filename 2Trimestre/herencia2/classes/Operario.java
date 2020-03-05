package classes;
public class Operario extends Empleado {

    public Operario(){
        this("DesconocidoOper");
    }

    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" ->operario";
    }
}