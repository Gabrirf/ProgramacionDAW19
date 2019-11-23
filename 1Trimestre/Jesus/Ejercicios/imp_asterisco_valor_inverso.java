import java.util.Scanner;

public class imp_asterisco_valor_inverso{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Introduce el numero en el que termina: ");
		n = sc.nextInt();
		
		for (int n1 = n ;n1 >= 1 ;n1--) {		// Aquí RESTA EL NUMERO
			for (int n2 = n1 ;n2 >= 1 ; n2-- ) {		//(AQUI RESTA NUMERO DE DIGITOS)
				System.out.print("*" );
			}
				System.out.println();
		}
	}
}