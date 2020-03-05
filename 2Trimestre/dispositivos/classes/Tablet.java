package classes;
import interfaces.*;

public class Tablet extends Dispositivo implements Portable{
    int bateria;
    int bateriaInicial;

    public Tablet(){
        super();
    }
    public Tablet(String procesador, int ram, int rom, String sistOper, int bateria){
        super(procesador, ram, rom, sistOper);
        this.bateria = bateria;
        this.bateriaInicial = bateria;
    }

    public void play(String game){
        System.out.println("Abriendo "+game+" ...");
        this.bateria = this.bateria - 5;
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
        return super.toString()+" | Bateria: "+this.bateria;
    }

    public void setCharge(int bateria){
        this.bateria = bateria;
        this.bateriaInicial = bateria;
    }

    public int getBateria(){
        return this.bateria;
    }

    public void cargar(){
        this.bateria = bateriaInicial;
    }

    public void descargar(){
        this.bateria = 0;
    }
}