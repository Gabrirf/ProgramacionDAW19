import java.util.Scanner;
import java.util.Arrays;

public class ajedrez{
	public static void main(String[] args) {

		int [] num = {1,2,3,4,5,6,7,8};
		String [] letras = {"a|","b|","c|","d|","e|","f|","g|","h|"};
	

		for (int cont = 0; cont < num.length; cont++ ) {	// Con este for vemos el tamaño del array y le ponemos contador
		System.out.print("_" + "_" + num[cont] );

		}
		System.out.println("_");
		//System.out.print("\n");
		for (int cont = 0; cont < letras.length; cont++ ) {
			System.out.print(letras[cont]);

			if (cont == 0 || cont == 2 || cont == 4 || cont == 6 || cont == 8 ){
			System.out.println("#" + " " +  " " + " " + " " + " #"  + " " +  " " + " " + " " + " #" + " " +  " " + " " + " " + " #" + " " + " " + " " + "|");
			}

			if (cont == 1 || cont == 3 || cont == 5|| cont == 7){
			System.out.println( " " + " " +  " #" + " " + " " + " " + " " +  " #" + " " + " " + " " + " " +  " #" + " " + " " + " " + " " + " #" + "|");
			}
		}

	}
}