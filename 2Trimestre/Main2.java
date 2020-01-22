import clases.*;

public class Main2{
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Contacto c1 = new Contacto("Lolo", "12398430");
		Contacto c2 = new Contacto("Pepa", 123456789);
		Contacto c3 = new Contacto("Joselito", "123456789");

		Contacto[] contactos = {c1,c2,c3};
		agenda.contactos = contactos;

		System.out.println(c1.toString());
		c1.mostrar();
		
	}
}