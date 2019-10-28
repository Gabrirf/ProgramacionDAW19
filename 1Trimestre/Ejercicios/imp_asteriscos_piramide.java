import java.util.Scanner;

public class imp_asteriscos_piramide{		//TERMINAR EN CASA

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Introduce un numero y te hago una piramide: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n ; i++ ) {
			for (int j = n; j > i ; j-- ) {
			System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++ ) {
			System.out.print("*");
			}
			for (int j = 1; j < i ; j++ ) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n¿Te ha gustado la piramide?");
	}
}
