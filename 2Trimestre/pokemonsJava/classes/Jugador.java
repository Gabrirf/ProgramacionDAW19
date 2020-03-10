package classes;

import java.util.ArrayList;

public class Jugador {
    String nombre;
    ArrayList <Pokemon> pokemons;
    ArrayList <String> medallas;

    public Jugador(){}
    public Jugador(String nombre, ArrayList <Pokemon> pokemons, ArrayList <String> medallas){
        this.nombre = nombre;
        this.pokemons = pokemons;
        this.medallas = medallas;
    }

    
}