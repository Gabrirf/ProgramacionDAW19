package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import clases.Persona;
import clases.Ruleta;

public class RuletaRusa {

	public void start(){
		Scanner sc = new Scanner(System.in);
		/* Inicializacion */
		ArrayList<Persona> personas = generarPersonas();
		Ruleta ruleta = new Ruleta(personas);

		/* Juego */
		System.out.println("Comience el juego");
		// Bucle hasta fin de juego
		do{
			// Información a imprimir del juego
			System.out.println(ruleta.verEstado());
			System.out.print("Inserte para continuar: ");
			sc.nextLine();
		} while(ruleta.nextRound());
		System.out.println("El juego ha terminado");
		System.out.println(ruleta.verEstado());
	}

	public ArrayList<Persona> generarPersonas(){
		String[] nombres = {"Ana", "Juan", "Felipe", "Toni", "Antonio", "Pepe", "Alfonso", "Maria", "Isabel"};
		ArrayList<Persona> personas = new ArrayList<Persona>(); 
		for (int i=0; i<nombres.length ; i+=1 ) {
			personas.add(new Persona(nombres[i]));
		}
		Collections.shuffle(personas);
		return personas;
	}

}