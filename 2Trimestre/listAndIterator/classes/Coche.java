package classes;

public class Coche {
    String marca;

    public Coche() {
        this.marca = "Desconocida";
    }

    public Coche(String marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca: "+this.marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}