import java.util.Scanner;

public class MostrarNumerosIntroducidos {
	public static void main(String[] args) {
		int tam = 10
		Scanner sc = new Scanner(System.in);
		int[] arrayEnteros = new int[tam];

		for (int i = 0; i < tam ; i++ ) {
			System.out.print("Introduce un numero: ");
			arrayEnteros[i] = sc.nextInt();
			//sc.next(); // extra
		}
		System.out.println("He terminado");
		for (int i = 0; i < tam ; i++ ) {
			System.out.print(arrayEnteros[i] + " ");
		}
	}
}