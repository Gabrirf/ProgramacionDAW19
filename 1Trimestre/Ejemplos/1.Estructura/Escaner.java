import java.util.Scanner; // Importar la librería Scanner

public class Escaner{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // Crear el objeto Scanner para que lea de la consola

		System.out.print("Introduce un texto: "); // Imprimir por consola el mensaje para avisar al usuario
		String texto = entrada.nextLine(); // Leer la linea que se ha introducido por consola y guardar en 'texto'
		System.out.println("El texto introducido es:\n\t" + texto); // Imprimir por consola un mensaje con el texto leído
	}
}