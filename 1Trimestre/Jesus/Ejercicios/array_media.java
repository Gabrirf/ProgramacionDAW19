import java.util.Scanner;
import java.util.Arrays;

public class array_media{

	public static void main(String[] args) {
		
		int notas = 0;
		int contador = 0;
		double mediaNotas;
		int suma = 0;
		int negativos = 0;
		int ceros = 0;
		int positivos = 0;

		Scanner n = new Scanner(System.in);
		
		System.out.print("¿Cuantas notas quieres meter?");
		notas = n.nextInt();
		
		int[] arrayMedia = new int [notas];

		for (int i = 0; i < notas; i++) {
			System.out.print("Introduce una nota: ");
			arrayMedia[i] = n.nextInt();
			contador++;
			suma = suma + arrayMedia[i];

			if (arrayMedia[i] < 0){
				negativos++;
			}
			else if (arrayMedia[i] == 0){
				ceros++;
			}
			else if (arrayMedia[i] > 0){
				positivos++;
			}
		}

		mediaNotas = suma / contador;
		System.out.println("La media de las notas es: " + mediaNotas);
		System.out.println("Las notas positivas son: " + positivos);
		System.out.println("Las notas negativas son: " + negativos);
		System.out.println("Los ceros son: " + ceros);

	}
}