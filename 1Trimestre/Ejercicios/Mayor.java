import java.util.Scanner;

public class Mayor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;


		System.out.print("Introducir numero a: ");
		 a = sc.nextInt();
		System.out.print("Introducir numero b: ");
		 b = sc.nextInt();

		if(a == b){
			System.out.println("son iguales");
		}
		else if(a > b){
			System.out.println("a es mayor");
		}else {
			System.out.println("b es mayor ");
		}
	}
}