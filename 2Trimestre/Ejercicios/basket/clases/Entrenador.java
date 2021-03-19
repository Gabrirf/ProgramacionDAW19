package clases;

public class Entrenador extends Persona {
	
	public Entrenador(String nombre, String apellido){
		super(nombre, apellido);
	}

	public Jugador[] elegirTitulares(Jugador[] jugadores){
		return jugadores;
	}
}