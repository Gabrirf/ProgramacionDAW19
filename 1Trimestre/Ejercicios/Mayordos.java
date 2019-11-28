import java.util.Scanner;

public class Mayordos{
	public static void main(String[] args) {
		Scanner pepe = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		System.out.println("Introduce un numero: ");
		num1 = pepe.nextInt();
		System.out.println("Introduce otro numero: ");
		num2 = pepe.nextInt();

		if(num1==num2){
			System.out.println(num1+ "=" +num2);
		}
		else if(num1>num2){
			System.out.println(num1+ ">" +num2);
		}else{
			System.out.println(num2+ ">" +num1);
			//PDT: TE queremos Gabri ♥
		}
	}
}