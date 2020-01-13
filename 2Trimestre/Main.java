import clases.*;

public class Main{
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.nombre = "Ana";
		p1.edad = 21;
		p1.altura = 1.65f;
		p1.dni = "12345678F";

		p2.nombre = "Juanito";
		p2.edad = 11;
		p2.altura = 1.25f;
		p2.dni = "87654321A";

		System.out.println(p1.esMayorEdad());
		System.out.println(p2.esMayorEdad());

		System.out.println(p1.dniValido());
		System.out.println(p2.dniValido());













		/*// Instanciar objeto
		Coche coche = new Coche();
		// Inicializar variables
		coche.marca = "Mercedes";
		coche.modelo = "A";
		coche.color = "blanco";
		coche.arrancado = false;
		// Usar variables y metodos
		System.out.println(coche.arrancado);
		coche.arrancar();
		System.out.println(coche.arrancado);
*/
	}
}