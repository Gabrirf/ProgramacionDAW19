import java.util.Scanner;
	
	public class numim{

		public static void main(String[] args) {

		float numero = 0f;

		Scanner tecla = new Scanner(System.in);

		System.out.println("Mete un numero");
				
		numero = tecla.nextInt();

		while (numero != 0 && numero > 1){

			numero = (numero - 1);

			System.out.println(numero);

		}


		}








	}