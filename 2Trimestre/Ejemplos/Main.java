import clases.*;

public class Main{
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contacto c1 = new Contacto("Lolo");
		Contacto c2 = new Contacto("Pepa", 123456789);
		Contacto c3 = new Contacto("Joselito", "123456789");
		c1.setNombre("Paco");
		String nombre = c1.getNombre();
		System.out.println(nombre);
		/*c1.nombre = "Lolo";
		c2.nombre = "Pepa";
		c3.nombre = "Joselito";
		
		c1.telefono = "123456789";
		c2.telefono = "987654321";
		c3.telefono = "123123123";*/

		Contacto[] contactos = new Contacto[3];
		contactos[0] = c1;
		contactos[1] = c2;
		contactos[2] = c3;
		//Contacto[] contactos = {c1,c2,c3};

		agenda.contactos = contactos;

		System.out.println(agenda.contactos[2].getNombre());

		/*Persona p1 = new Persona();
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
*/


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