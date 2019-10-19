import java.util.Scanner;
	
	public class numexp{

		public static void main(String[] args) {

		float base = 0f;
		float exp = 0f;
		float variable = 1f;

		Scanner tecla = new Scanner(System.in);

		System.out.printf("Mete la base:");
				
			base = tecla.nextInt();	
		
			System.out.printf("Mete el exp:");
			exp = tecla.nextInt();

		while (exp > 0){

			variable = variable * base;
			exp--;
			
		}

		System.out.println(variable);

		}

	}	