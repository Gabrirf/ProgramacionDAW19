package clases;

public class Alero extends Jugador {

	public Alero(String nombre, String apellido, int dorsal, double altura){
		super(nombre, apellido, dorsal, altura);
	}

	public void bloquear(Jugador jugador){
		System.out.println(nombre+" ha bloqueado el paso a "+jugador.nombre);
	}

	public void tirar(){
		System.out.println(nombre+" ha lanzado a canasta");
	}

	@Override
	public void jugar(Jugador jugador){
		bloquear(jugador);
		tirar();
	}
	
}