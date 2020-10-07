public class Funciones{

	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		
		int suma = sumar(a, b);
		mostrar(suma);
		/* Es equivalente */
		mostrar(sumar(a,b));
	}
	
	/* Esta funcion devuelve un número */
	public static int sumar(int a, int b){
		int suma = a+b;
		return suma;
	}

	/* Esta funcion no devuelve nada */
	public static void mostrar(int n){
		System.out.println("El numero es: "+n);
	}

}