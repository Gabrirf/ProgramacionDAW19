//import clases.Persona;
import clases.Joven;
import clases.Adulto;

public class Main {
	public static void main(String[] args) {
		Joven p1 = new Joven("Antonio", 19, 1.83);
		Adulto a1 = new Adulto("Juan", 49, 1.83, "Tiger One");
		p1.saludar();
		a1.saludar();
		System.out.println(p1);
		System.out.println(a1);
	}
}