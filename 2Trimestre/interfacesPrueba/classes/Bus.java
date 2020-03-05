package classes;

import interfaces.*;

public class Bus implements Vehiculo{
    String marca;
    int tiempo = 0;

    public Bus() {
        this.marca = "Desconocido";
    }

    public Bus(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return this.marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return this.marca;
    }

    public double factura() {
        double importe = 0;
        while(this.tiempo >= 24) {
            this.tiempo -= 24;
            importe += 25;
        }

        while(this.tiempo != 0 && this.tiempo < 24) {
            this.tiempo --;
            importe += 1.2;
        }
        return importe;
    }

    public boolean hayPlaza(int numeroPLazas, int plazasOcupadas) {
        if(numeroPLazas <= plazasOcupadas) {
            return false;
        }else {
            return true;
        }
    }

    public void aparca(int numeroPlaza) {
        System.out.println("Aparcando en la plaza numero "+numeroPlaza);
    }

    public void setTiempo(int tiempoEnHoras) {
        this.tiempo = tiempoEnHoras;
    }
}