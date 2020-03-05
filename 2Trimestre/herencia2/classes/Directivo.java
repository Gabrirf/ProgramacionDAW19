package classes;
public class Directivo extends Empleado {

    public Directivo(){
        this("DesconocidoDirec");
    }

    public Directivo(String nombre){
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" ->directivo";
    }
}