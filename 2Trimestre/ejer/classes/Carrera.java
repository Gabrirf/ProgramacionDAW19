package classes;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Carrera{
    int distancia;
    ArrayList <Galgo> galgos = new ArrayList<Galgo>();

    public Carrera(){}


    public void setDistancia(int distancia){
        this.distancia = distancia;
    }

    public int getDistancia() {
        return this.distancia;
    }

    public void addGalgo(Galgo galgo){
        this.galgos.add(galgo);
    }

    public void deleteGalgo(String nombre) throws ConcurrentModificationException{
        String nombreAct;
        int index;
        for(Galgo galgo : this.galgos) {
            nombreAct = galgo.getNombre();
            if(nombreAct.equalsIgnoreCase(nombre)){
                index = this.galgos.indexOf(galgo);
                System.out.println(index);
                this.galgos.remove(index);
            }
        }
    }

    public void imprimirListaGalgos() {
        for(Galgo galgo : this.galgos) {
            System.out.println(galgo.toString());
        }
    }

    public void startCarrera(){
       for(Galgo galgo : this.galgos) {
            galgo.start();
       }
        
    }


}