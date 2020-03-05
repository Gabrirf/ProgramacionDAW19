package classes;

public class Oficial extends Operario {
    public Oficial(){
        this("DesconocidoOfic");
    }

    public Oficial(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" ->oficial";
    }

}