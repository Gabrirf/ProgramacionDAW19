import java.util.Scanner;

public class Escaner{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un texto: ");
		String texto = entrada.nextLine();
		System.out.println("El texto introducido es:\n\t" + texto);
	}
}