import java.util.Scanner;

public class MayorTres{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;


		System.out.print("Introducir numero a: ");
		 a = sc.nextInt();
		System.out.print("Introducir numero b: ");
		 b = sc.nextInt();
		System.out.print("Introducir numero c: ");
		 c = sc.nextInt();

		if(a == b && b == c){
			System.out.println("son iguales");
		}
		else if(a > b){
			System.out.println("a es mayor");
		}else if(a < b){
			System.out.println("b es mayor ");
		}else if(b < c){
			System.out.println("c es mayor ");
		}
	}
}