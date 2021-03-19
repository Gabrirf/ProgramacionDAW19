package clases;

public class Equipo {
	String nombre;
	Jugador[] jugadores;
	Entrenador entrenador;

	public Equipo(){

	}

	public Equipo(String nombre, Jugador[] jugadores, Entrenador entrenador){
		this.nombre = nombre;
		this.jugadores = jugadores;
		this.entrenador = entrenador;
	}
}