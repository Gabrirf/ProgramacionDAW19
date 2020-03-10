package classes;

public class Galgo extends Thread implements Runnable{
    String nombre;
    int velocidad;
    int distancia;

    public Galgo(){}
    public Galgo(String nombre, int ms, int distancia){
        this.nombre = nombre;
        this.distancia = distancia;
        this.velocidad = ms;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad =velocidad;
    }

    public void run(){
        try{
            Thread.sleep((int)(((double)this.distancia/(double)this.velocidad)*1000));
        }catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println(this.nombre+ " ha llegado");
    }

    @Override
    public String toString(){
        return "Galgo: "+this.nombre;
    }
}