import java.util.Scanner;

public class intr_num_sueldo{  // NO TERMINADO

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n;
		int vecesBucle = 0;
		double pasos = 0;
		double sueldos = 0;
		double sueldomax = 0;

		
		System.out.print("¿Cuantos sueldos quieres meter? ");

		vecesBucle = sc.nextInt(); 
		
		while (pasos < vecesBucle){
			pasos++;

			System.out.print("\nMete un sueldo: ");
			n = sc.nextDouble();

			sueldos = n;

			if (sueldos > sueldomax){
				
				sueldomax = sueldos;
			}

		}

		System.out.println("\nSueldo maximo: " + sueldomax);
		System.out.println(" WOoOoOW esta persona gana una pasta!!");

	}
}