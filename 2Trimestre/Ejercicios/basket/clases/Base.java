package clases;

public class Base extends Jugador {
	
	public Base(String nombre, String apellido, int dorsal, double altura){
		super(nombre, apellido, dorsal, altura);
	}

	public void pasar(Jugador jugador){
		System.out.println(nombre+" ha pasado el balon a "+jugador.nombre);
	}

	public void fintar(){
		System.out.println(nombre+" ha realizado una finta");
	}

	@Override
	public void jugar(Jugador jugador){
		fintar();
		pasar(jugador);
	}
}