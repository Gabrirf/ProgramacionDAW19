import java.util.Scanner;

public class MediaBucle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double numeroConvertidoAInt = Double.parseDouble(args[2]);
		double contador = 0;
		double numeroLeido;
		double suma = 0;

		System.out.print("Introduzca un numero: ");
		numeroLeido = sc.nextDouble();
		while(numeroLeido >= 0){
			suma = suma + numeroLeido;
			contador++;
			// Volver a pedir un numero
			System.out.print("Introduzca un numero: ");
			numeroLeido = sc.nextDouble();
		}
		System.out.println("La media de los numeros introducidos es: "+(suma/contador));
	}
}