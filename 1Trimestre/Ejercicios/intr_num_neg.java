import java.util.Scanner;

public class intr_num_neg{		//	Meto X numeros y digo si hay alguno negativo

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int vecesBucle = 0;
		int pasos = 0;
		int negativos = 0;
		

		System.out.print("¿Cuantos numeros quieres meter?");

		vecesBucle = sc.nextInt(); // Aquí meto cuantas veces quiero que se repita el bucle
		
		while (pasos < vecesBucle){
			pasos++;		//voy sumando pasos hasta que sea igual que la veces que le he metido para que pare

			System.out.print("Mete un numero: "); 	// Aquí voy metiendo el numero
			n = sc.nextInt();


			if (n < 0){
				negativos++;
				
			}
			

		}
		if (negativos == 0){
			System.out.println("\nNo has metido ningun numero negativo");
		}
		else if (negativos > 0){
			System.out.println("\nHas metidos numeros negativos!!");
			System.out.println("\nHas metido la cantidad de "+ negativos +" numeros negativos! :O");

		}
		//System.out.println("\n¿Has metido algun numero negativo?"  );
		//System.out.println("\nHas metido:"  + negativos + "numeros negativos");

	}
}