package classes;

public class Movimiento {
    String nombre;
    String tipo;
    int pp;
    int dano;

    public Movimiento() {}
    public Movimiento(String nombre, String tipo, int pp, int dano){
        this.nombre = nombre;
        this.tipo = tipo;
        this.pp = pp;
        this.dano = dano;
    }

}