import java.util.Scanner;

public class numeroparim{

	public static void main(String[] args) {

		int n = 1; 
		
		Scanner tecla = new Scanner(System.in);

		
		while(n != 0 ){ 	//esto se pone aquí para que "n" no se guarde
		System.out.println("Mete un numero y te digo si es par o impar");
		
		n = tecla.nextInt();

						
			if(n%2 == 0 ){
			System.out.println("El numero es par");
			}
			
			if(n%2 != 0 ){
				System.out.println("El numero es impar");
			}
			
		}
		
		}
	}
