import java.util.Scanner;

public class intr_num_calc{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int negativos = 0;
		int positivos = 0;
		int cero = 0;
		int pasos = 0;

		
		
		while (pasos < 10){
			pasos++;
			
			System.out.print("Introduce un numero: ");
			n = sc.nextInt();
			
			if(n < 0){
				negativos++;	
			}
			else if( n > 0){
				positivos++;
			}
			else if (n == 0){
				cero++;
			}
		}

		System.out.println("\n Estos son los resultados");

		System.out.println("Negativos=" + negativos);
		System.out.println("Positivos=" + positivos);
		System.out.println("Ceros=" + cero);
	}
}
