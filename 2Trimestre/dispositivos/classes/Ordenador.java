package classes;

public class Ordenador extends Dispositivo {

    public Ordenador(){
        super();
    }
    public Ordenador(String procesador, int ram, int rom, String sistOper){
        super(procesador, ram, rom, sistOper);
    }

    public void launch(String app){
        System.out.println("Ejecutando "+app+" ...");
    }

    //METODOS GENERICOS DEL PADRE
    public void off() {
        System.out.println("Apagando...");
    }
    public void on() {
        System.out.println("Encendiendo...");
    }
    public void restart() {
        System.out.println("Reiniciando...");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}