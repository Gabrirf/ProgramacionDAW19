import java.util.Scanner;

public class imp_asterisco_valor{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Introduce el numero en el que termina: ");
		n = sc.nextInt();
		
		for (int n1 = 1;n1 <= n ;n1++) {	
			for (int n2 = 1;n2 <= n1 ; n2++ ) {
				System.out.print('*');
			}
				System.out.println();
		}
	}
}