import java.util.Arrays;
import java.util.Scanner;

public class MenuFunciones{
	public static void main(String[] args) {
		double a = 25;
		double b = 10;
		double resultado = 0;
		switch (Integer.parseInt(args[0])) {
			case 1:
				a = leerNumero();
				b = leerNumero();
				resultado = sumar(a,b);
				break;
			case 2:
				resultado = restar(a,b);
				break;
			case 3:
				resultado = multiplicar(a,b);
				break;
			case 4:
				resultado = dividir(a,b);
				break;
			case 5:
				fusionarArrays();
			default:
				System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
		}
		System.out.println(resultado);
	}

	static double sumar(double a, double b){
		System.out.println("Has elegido suma");
		return a+b;
	}
	static double restar(double a, double b){
		return a-b;
	}
	static double multiplicar(double a, double b){
		return a*b;
	}
	static double dividir(double a, double b){
		return a/b;
	}

	static double leerNumero(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		double numero = sc.nextDouble();
		return numero;
	}


	public static void fusionarArrays() {
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2 = {10,20,30,40,50,60,70,80,90,100};
		int[] arrayFusion = new int[array1.length+array2.length];

		for (int i = 0; i < array1.length ; i++ ) {
			arrayFusion[2*i] = array1[i];
			arrayFusion[(2*i)+1] = array2[i];
		}
		for (int i = array1.length; i < array2.length ; i++ ) {
			System.out.println(i +" "+ array2[i]);
			arrayFusion[i+array1.length] = array2[i];
		}

		System.out.println(Arrays.toString(arrayFusion));
	}
}