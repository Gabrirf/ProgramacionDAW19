import java.util.Scanner;

public class Par{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		
			int numero = 0;

			

			System.out.print("Introducir numero a: ");
		 	numero = sc.nextInt();
			

		if(numero % 2 == 0){
			System.out.println("El numero es par");
		}else{
			System.out.println("El numero es impar");
		}


	}	
}	