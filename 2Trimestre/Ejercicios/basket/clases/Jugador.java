package clases;

public class Jugador extends Persona {
	int dorsal;
	double altura;

	public Jugador(String nombre, String apellido, int dorsal, double altura){
		super(nombre, apellido);
		this.dorsal = dorsal;
		this.altura = altura;
	}

	public void jugar(){
		System.out.println("Yuju estoy jugando !");
	}

	public void jugar(Jugador jugador){
		System.out.println("Yuju estoy jugando !");
	}

	public String toString(){
		return  nombre+", "+apellido+", "+dorsal+", "+altura;
	}
}