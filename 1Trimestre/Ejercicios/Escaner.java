import java.util.Scanner; // un objeto es una caja en la que meter varias funciones o variables para mandarlas o usarlas todas a la vez como si fuese una sola

public class Escaner{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un texto: ");
		String texto = entrada.nextLine();
		System.out.println("El texto introducido es:\n\t" + texto);
		entrada.close();
	}
}