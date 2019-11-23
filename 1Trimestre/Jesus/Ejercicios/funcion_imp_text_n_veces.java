package ejercicioss;

import java.util.Scanner;

public class funcion_imp_text_n_veces {

	public static void main(String[] args) {
		
		int repes;
		
		int aletras;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Mete un numero del 1 al 9"); //pedimos numero
		
		repes = sc.nextInt();
		aletras = repes;
				
		while (repes>0) { 
			numeros(aletras);
			repes--;
		}
		

		
		
		
	}

	
	
	private static void numeros(int aletras) {
		
		
		if (aletras == 1) {
				System.out.println("Uno ");
		}
		
		if (aletras == 2) {
			System.out.println("Dos ");
		}
		if (aletras == 3) {
			System.out.println("Tres ");
		}
		if (aletras == 4) {
			System.out.println("Cuatro ");
		}
		if (aletras == 5) {
			System.out.println("Cinco ");
		}
		if (aletras == 6) {
			System.out.println("Seis ");
		}
		if (aletras == 7) {
			System.out.println("Siete ");
		}
		if (aletras == 8) {
			System.out.println("Ocho ");
		}
		if (aletras == 9) {
			System.out.println("Nueve ");
		}
		
		
	}

}
