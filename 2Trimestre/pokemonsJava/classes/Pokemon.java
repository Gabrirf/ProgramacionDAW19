package classes;

import java.util.ArrayList;

public class Pokemon{
    String id;
    String nombre;
    int salud;
    int atk;
    int atkSp;
    int df;
    int dfSp;
    int vel;
    String tipo;
    ArrayList <Movimiento> movimientos;

    public Pokemon () {}
    public Pokemon (String id, String nombre, int salud, int atk, int atkSp, int df, int dfSp, int vel, String tipo, ArrayList <Movimiento> movimientos) {
        this.id = id;
        this.nombre = nombre;
        this.salud = salud;
        this.atk = atk;
        this.atkSp = atkSp;
        this.df = df;
        this.dfSp = dfSp;
        this.vel = vel;
        this.tipo = tipo;
        this.movimientos = movimientos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getVel() {
        return this.vel;
    }

    public int getSalud() {
        return this.salud;
    }
    
    public int getAtk(){
        return this.atk;
    }

    public void setHp(int hp) {
        this.salud = hp;
    }



}