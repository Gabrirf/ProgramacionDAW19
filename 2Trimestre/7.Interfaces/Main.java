import clases.*;
import interfaces.*;

public class Main{
	public static void main(String[] args) {
		Perro perro = new Perro("Chucho");
		Perro perro2 = new Perro("Chucho");
		Gato gato = new Gato("Misifu");

		/*System.out.println(perro.toString());
		System.out.println(gato.toString());*/

		perro.saludar(perro2);
		gato.saludar();
	}
}