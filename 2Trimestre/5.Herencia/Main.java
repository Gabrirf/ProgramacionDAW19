import clases.*;

public class Main{
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		//Persona p2 = new Persona("Manolo");
		//System.out.println(p1.toString());
		Adulto adulto1 = new Adulto();
		Anciano anciano1 = new Anciano();
		Joven joven1 = new Joven();

		System.out.println(persona1.toString());
		System.out.println(adulto1.toString());
		System.out.println(anciano1.toString());
		System.out.println(joven1.toString());
	}
}