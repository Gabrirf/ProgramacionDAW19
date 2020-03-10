import java.util.ArrayList;

import classes.*;

public class App {
    public static void main(String[] args) {
        //Creando Movimientos
        Movimiento mov1 = new Movimiento("Fiera", "Piedras", 6, 100);
        Movimiento mov2 = new Movimiento("Dadaa", "Garape", 4, 400);
        Movimiento mov3 = new Movimiento("Rapa", "Treper", 3, 600);
        Movimiento mov4 = new Movimiento("Parapola", "Byronga", 4, 500);

        ArrayList <Movimiento> movimientos1 = new ArrayList<Movimiento>();
        movimientos1.add(mov1);
        movimientos1.add(mov2);
        movimientos1.add(mov3);
        movimientos1.add(mov4);

        //Creando Pokemons
        Pokemon poke1 = new Pokemon("844729084", "Bulbasur", 2200, 100, 200, 100, 300, 50, "Tierra", movimientos1);
        Pokemon poke2 = new Pokemon("841111184", "Charmander", 2000, 120, 240, 80, 160, 80, "Fuego", movimientos1);

        ArrayList <Pokemon> pokemons1 = new ArrayList<Pokemon>();
        pokemons1.add(poke1);

        ArrayList <String> medallas1 = new ArrayList<String>();
        medallas1.add("Golpe Infernal");
        medallas1.add("Galapago");

        //Creando Jugador
        Jugador jug1 = new Jugador("Alberto", pokemons1, medallas1);

        while(poke1.getSalud()>0 && poke2.getSalud()>0){
            figth(poke1, poke2);
        }

        if(poke1.getSalud()<=0 && poke1.getSalud()<poke2.getSalud()){
            System.out.println("Ha ganado "+ poke2.getNombre());
            System.out.println(poke1.getSalud());
            System.out.println(poke2.getSalud());
        }

        if(poke2.getSalud()<=0 && poke2.getSalud()<poke1.getSalud()) {
            System.out.println("Ha ganado "+poke1.getNombre());
            System.out.println(poke1.getSalud());
            System.out.println(poke2.getSalud());
        }

    }

    public static void figth (Pokemon poke1, Pokemon poke2) {
        int segundoAtk = 0;
        if(poke1.getVel() > poke2.getVel()){
            ataque(poke2, poke1);
            ataque(poke1, poke2);
            segundoAtk = 1;
        }else {
            ataque(poke1, poke2);
            ataque(poke2, poke1);
            segundoAtk = 0;
        }

        //Segundo ataque
        if(segundoAtk==0){
            ataque(poke2, poke1);
            ataque(poke1, poke2);
        }else {
            ataque(poke1, poke2);
            ataque(poke2, poke1);
        }

    }

    public static void ataque(Pokemon poke1, Pokemon poke2) {
        int newLife = poke1.getSalud() - poke2.getAtk();
        poke2.setHp(newLife);
    }

}