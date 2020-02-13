import clases.*;

public class Main2{
	public static void main(String[] args) {
		Adulto a = new Adulto("Manolo");
		Nino n = new Nino("Lolito");
		Estudiante e = new Estudiante("Lolo");
		// Array Personas
		Persona[] personas = {a, n, e};
		System.out.println(personas.toString()+"\n");

		// Objeto Autobus
		Autobus bus = new Autobus(personas);
		System.out.println(bus.toString()+"\n");

		// Que saluden todos los del Bus
		for (int i=0; i<bus.getPersonas().length; i++) {
			bus.getPersonas()[i].despedir();
		}
	}
}