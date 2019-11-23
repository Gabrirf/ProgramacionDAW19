import java.util.Scanner;
import java.util.Arrays;

public class MostrarNumerosIntroducidosPregunta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrayEnteros = new int[10];
		boolean seguir = true;
		int cont = 0;
		String continuar="";

		for (int i = 0; seguir && i < arrayEnteros.length ; i++ ) {
			System.out.print("Introduce un numero: ");
			arrayEnteros[i] = sc.nextInt();
			System.out.print("Quiere seguir? (S/n): ");
			continuar = sc.next();
			if(continuar.equals("n") || continuar.equals("N")){
				cont = i;
				seguir = false;
			}
		}
		System.out.println("He terminado");
		for (int i = 0; i <= cont ; i++ ) {
			System.out.print(arrayEnteros[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrayEnteros));
	}
}