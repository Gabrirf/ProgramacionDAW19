import java.util.Scanner;

public class Conversiones{
	public static void main(String[] args) {
		
		/* Conversion directa (casting) */
		int numero = (int) '0';
		char caracter = (char) 48;

		System.out.println(caracter +" <-- tienen el mismo valor binario --> "+ numero);

		int decimal = 10;
		int binario = 0b1010;
		int hexadecimal = 0x0A;
		System.out.println(decimal);
		System.out.println(binario);
		System.out.println(hexadecimal);

		/* Conversion mediante métodos */
		int numeroTexto = Integer.parseInt("10");
		String textoNumero = Integer.toString(10);
		String textoNumero2 = 10 + "";
		System.out.println(numeroTexto +" <-- tienen el mismo valor --> "+ textoNumero);

		/* Extraer caracter de texto */
		char a;
		for (int i=0; i<5; i++) {
			a = "Supercaligrafi...".charAt(i);
			System.out.print(a + " ");
		}
		System.out.println();
	}
}




