package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ruleta {
	ArrayList<Bala> balas;
	ArrayList<Persona> personas;
	ArrayList<Persona> muertos;
	Pistola pistola;
	Scanner sc;

	public Ruleta(ArrayList<Persona> personas){
		this.personas = personas;
		this.balas = initBalas(3);
		this.pistola = new Pistola(6);
		this.muertos = new ArrayList<Persona>();
		this.sc = new Scanner(System.in);
	}

	public ArrayList<Bala> initBalas(int n){
		ArrayList<Bala> balas = new ArrayList<Bala>();
		for (int i=0 ; i<n ; i++ ) {
			balas.add( new Bala() );
		}
		return balas;
	}

	public boolean nextRound(){
		if(balas.size() == 0){
			return false;
		}
		pistola.recargar(balas.remove(0)); // Insertar bala en pistola
		pistola.girarTambor();// Girar tambor de pistola
		// [null, null, bala, null, null, null]
		// Turno de disparo por cada persona hasta disparar la bala
		System.out.println(verEstado());
		System.out.print("Pulse para continuar: ");
		sc.nextLine();
		while(!personas.get(0).disparar(pistola)){
			Collections.rotate(personas, 1);
			System.out.println(verEstado());
			System.out.print("Pulse para continuar: ");
			sc.nextLine();
		}
		muertos.add(personas.remove(0));
		Collections.rotate(personas, 1);
		return true;
	}

	public String verEstado(){
		String estado = "### Estado de la ruleta ###\n";
		estado += "Quedan "+balas.size()+" balas\n";
		estado += "Pistola: "+pistola.verEstado()+"\n";
		estado += "Quedan vivos: \n";
		for(Persona persona : personas){
			estado += "\t- "+persona.getNombre()+"\n";
		}
		return estado;
	}
}