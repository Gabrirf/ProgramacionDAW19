package clases;

public class Pivot extends Jugador {

	public Pivot(String nombre, String apellido, int dorsal, double altura){
		super(nombre, apellido, dorsal, altura);
	}

	public void tapon(Jugador jugador){
		System.out.println(nombre+" ha taponado a "+jugador.nombre);
	}

	public void mate(){
		System.out.println(nombre+" ha machacado la canasta");
	}

	@Override
	public void jugar(Jugador jugador){
		tapon(jugador);
		mate();
	}
	
}