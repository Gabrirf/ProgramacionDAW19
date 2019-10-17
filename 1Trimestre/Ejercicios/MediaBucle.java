import java.util.Scanner;

public class MediaBucle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numeroLeido;
		double contador = 0;
		double suma = 0;

		System.out.print("Introduzca un numero: ");
			numeroLeido = sc.nextInt();
		while(numeroLeido >= 0){
			suma = suma+numeroLeido;
			contador++;
			//Volver a pedir un numero.
			System.out.print("Introduzca un numero: ");
				numeroLeido = sc.nextInt();
		}
		System.out.println("La media de todos los numeros es: " +(suma/contador));

	}
}