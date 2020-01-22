import clases.*;

public class Main2{
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		Directivo directivo1 = new Directivo();
		Operario operario1 = new Operario();
		Oficial oficial1 = new Oficial();
		Tecnico tecnico1 = new Tecnico();

		System.out.println(empleado1.toString());
		System.out.println(directivo1.toString());
		System.out.println(operario1.toString());
		System.out.println(oficial1.toString());
		System.out.println(tecnico1.toString());
	}
}