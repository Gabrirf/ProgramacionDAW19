import lib.Funciones;

public class Main{
	public static void main(String[] args) {
		// funcion void
		Funciones.holaMundo();
		// funcion return int
		int n = Funciones.duplicar(123);
		System.out.println(n);
		// funcion return int
		System.out.println(Funciones.max(3,4));
		System.out.println(Funciones.min(3,4));
		// sobrecarga funciones
		int[] numeros = {4,2,6,3,55,33,2,1,612,3,42};
		System.out.println(Funciones.max(numeros));
		System.out.println(Funciones.min(numeros));
	}
}