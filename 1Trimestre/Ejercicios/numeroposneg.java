import java.util.Scanner;

public class numeroposneg{

	public static void main(String[] args) {

		int n = 1; //Ponemos 1 para que no coja ese valor y no entre en el programa
		
		Scanner tecla = new Scanner(System.in);

		
		while(n != 0 ){ 	//esto se pone aquí para que "n" no se guarde
		System.out.println("Mete un numero y te digo si es positivo o negativo");
		
		n = tecla.nextInt();

						
			if(n > 0 ){
			System.out.println("El numero es positivo");
			}
			
			if(n < 0 ){
				System.out.println("El numero es negativo");
			}
			
		}
		
		}
	}
