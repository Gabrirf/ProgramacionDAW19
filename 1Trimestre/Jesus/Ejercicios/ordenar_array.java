import java.util.Scanner;
import java.util.Arrays;

public class ordenar_array{  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam;

		//Pide el tamaño del array
		System.out.print("¿Cuantos numeros quieres meter? ");	
		tam = sc.nextInt();

		int[] arraynumeros = new int [tam];

		for (int i = 0; i < tam; i++) {
		System.out.print("Mete un numero: ");	//Vamos guardando los numeros en la array
		arraynumeros[i] = sc.nextInt();

	}
	Arrays.sort(arraynumeros);
	for (int numero:arraynumeros)
		System.out.println(numero);
}
}