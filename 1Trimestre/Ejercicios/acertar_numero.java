import java.util.Scanner;

public class acertar_numero{  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 0;
		int aleatorio = 0;
		int contador = 0;
		int n = 0;

		aleatorio = (int)(Math.random() *100); /* Genera el numero del 1 a 100 con el
												  "int" decimos que nos de el numero entero*/

		System.out.print("Introduce un numero: ");
			n = sc.nextInt();

		while (n != aleatorio) {
			

			if (n < aleatorio){
				System.out.print("\nEl numero es MAYOR, mete otro numero: ");
			}
			else if(n > aleatorio){
				System.out.print("\nEl numero es MENOR, mete otro numero: ");
			}

			n = sc.nextInt();

			contador++;		/*Aquí vamos contando las veces que pasa el buble 
							  para decir luego cuantas veces lo has intentado */

		}
		if (n == aleatorio){
			System.out.println("\n Has acertado el numero aleatorio!");
			System.out.println("\n Lo has intentado "+contador+" veces");
		}

		
	}
}