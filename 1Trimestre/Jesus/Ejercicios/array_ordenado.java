import java.util.Scanner;

public class array_ordenado{  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam;
		boolean creciente = false;
		boolean decreciente = false;
		
		System.out.print("¿Cuantos numeros quieres meter? ");
		tam = sc.nextInt();

		int[] arraynumeros = new int [tam];

		for (int i = 0; i < tam; i++) {
			
		System.out.print("Mete un numero: ");	//Vamos guardando los numeros en la array
		arraynumeros[i] = sc.nextInt();

		}

		for (int i=0; i<tam-1;i++){		//Ponemos el tam-1 para que se quede en la ultima posición y no vaya a más
			
			if (arraynumeros[i] < arraynumeros[i+1]) {	//CRECIENTE
				creciente = true;
			}
			if (arraynumeros[i] > arraynumeros[i+1]) {	//DECRECIENTE
				decreciente = true;
			}
		}

		if (creciente == true && decreciente == false) {		// Para ir imprimiendo todo
			System.out.println("\n El array esta en forma creciente");
		}
		else if (creciente == false && decreciente == true) {
			System.out.println("\n El array esta en forma decreciente");
		}
		else if (creciente ==true && decreciente ==true) {
			System.out.println("\n los numeros estan desordenado");
		}
		else if (creciente == false && decreciente == false) {
			System.out.println("\n Todos los numeros son iguales");
		}
		

	}
}