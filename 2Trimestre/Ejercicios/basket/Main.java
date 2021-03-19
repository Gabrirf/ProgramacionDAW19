import clases.Equipo;
import clases.Persona;
import clases.Entrenador;
import clases.Jugador;
import clases.Base;
import clases.Alero;
import clases.Pivot;

public class Main {
	public static void main(String[] args) {
		Jugador j = new Jugador("Michael", "Jordan", 23, 1.93);
		//System.out.println(j);

		Jugador base = new Base("Stephen", "Curry", 19, 1.90);
		Jugador alero = new Alero("Lebron", "James", 10, 2.15);
		Jugador pivot = new Pivot("Marc", "Gasol", 5, 2.20);

		Jugador[] jugadores = {base, alero, pivot};

		jugadores[(int)Math.floor(Math.random()*jugadores.length)].jugar(j);

		/*Equipo equipo = new Equipo();
		Persona persona = new Persona();
		Persona entrenador = new Entrenador();
		Persona jugador = new Jugador();
		Persona base = new Base();
		Persona alero = new Alero();
		Persona pivot = new Pivot();
		Jugador base2 = new Base();
		Jugador alero2 = new Alero();
		Jugador pivot2 = new Pivot();*/
	}
}