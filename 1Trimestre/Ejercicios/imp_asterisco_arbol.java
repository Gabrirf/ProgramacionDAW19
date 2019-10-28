import java.util.Scanner;

public class imp_asterisco_arbol{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int triangulos = 6;

		System.out.print("Introduce un numero y te hago un arbol: ");
		
		triangulos = sc.nextInt();
		
		
		for (int n=2; n<triangulos ;n++ ) {
			for (int i = 1; i <= n ; i++ ) {
			for(int j = n; j < triangulos; j++ ){
			System.out.print(" ");
			}
			for (int j = n; j > i ; j-- ) {
			System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1 ; j++ ) { // De aquí salen los espacios visibles con *
			System.out.print("*");
			}
			System.out.println();
			}
		}
		System.out.println("\n Te ha gustado el arbol de navidad?");
	}
}

