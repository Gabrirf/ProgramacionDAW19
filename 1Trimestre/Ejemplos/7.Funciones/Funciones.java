public class Funciones{
	public static void main(String[] args) {
		// llamada a la funcion
		//int suma = ;
		//System.out.println(suma);
		mostrar(sumar(3,7));
	}
	// La funcion en sí
	public static int sumar(int a, int b){
		int suma = a+b;
		int otroNumero = 4;
		return suma;
	}

	public static void mostrar(int n){
		System.out.println("El numero es: "+n);
	}
}