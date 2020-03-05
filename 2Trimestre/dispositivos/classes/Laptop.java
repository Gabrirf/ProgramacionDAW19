package classes;
import interfaces.*;

public class Laptop extends Ordenador implements Portable {

    int bateria;
    int bateriaInicial;

    public Laptop(){
        super();
    }
    public Laptop(String procesador, int ram, int rom, String sistOper, int bateria){
        super(procesador, ram, rom, sistOper);
        this.bateria = bateria;
        this.bateriaInicial = bateria;
    }

    @Override
    public void launch(String app){
        System.out.println("Ejecutando "+app+" ...");
        this.bateria = this.bateria - 5;
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