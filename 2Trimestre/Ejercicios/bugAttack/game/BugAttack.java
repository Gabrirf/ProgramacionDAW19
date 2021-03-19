package game;

import clases.Bug;
import clases.Ant;
import clases.Fly;
import clases.Bee;
import clases.Flyer;
import clases.Match;

public class BugAttack {

	public void start(){
		System.out.println("Comience el juego");
		Bug ant = new Ant("Hormiguita");
		Bug fly = new Fly("Moscardon");
		Bug bee = new Bee("Maya");

		Bug[] bugs = {ant, fly, bee};
		int rIndex1 = (int)Math.floor(Math.random()*bugs.length);
		int rIndex2 = (int)Math.floor(Math.random()*bugs.length);
		while(rIndex2 == rIndex1){
			rIndex2 = (int)Math.floor(Math.random()*bugs.length);
		};

		Match combat = new Match(bugs[rIndex1], bugs[rIndex2]);
		while(combat.nextRound()){
			System.out.println(combat.getStats());
		}
		System.out.println(combat.getStats());
		Bug winner = combat.checkWinner();
		if(winner != null){
			System.out.println("El ganador es "+ winner.getName());
		}else{
			System.out.println("Es un empate");
		}
	}

}