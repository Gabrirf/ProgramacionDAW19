package classes;

public class Botella{
    String marca;
    int capacidad;
    int graduacion;
    int porcentajeHielo;

    public Botella(){}
    public Botella(String marca, int capacidad, int graduacion, int porcentajeHielo){
        this.marca = marca;
        this.capacidad = capacidad;
        this.graduacion = graduacion;
        this.porcentajeHielo = porcentajeHielo;
    }

    public String getMarca(){
        return this.marca;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    public int getGraduacion(){
        return this.graduacion;
    }
    public int getHielo(){
        return this.porcentajeHielo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void setGraduacion(int graduacion) {
        this.graduacion = graduacion;
    }
    public void setHielo(int porcentajeHielo) {
        this.porcentajeHielo = porcentajeHielo;
    }

    @Override
    public String toString() {
        return "Marca: "+this.marca+" | Capacidad: "+this.capacidad+"ml | Graduacion: "+this.graduacion+" | Hielo: "+this.porcentajeHielo;
    }

    public int llenar(int cantidad){
        return cantidad = this.capacidad;
    }

    public int vaciar(int cantidad) {
        return cantidad = 0;
    }

    public int servirCopa(int cantidad){
        return cantidad - 50;
    }


}