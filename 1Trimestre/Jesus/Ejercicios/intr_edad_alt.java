import java.util.Scanner;

public class intr_edad_alt{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n;
		double edad = 0;
		double mediaedad = 0;
		double mediaalt = 0;
		double sumaalt = 0;
		double alto = 0;
		double sumedad = 0;
		int personas = 0;
		
		
		while (personas < 5){
			personas++;
			
			//	PARTE DE EDAD

			System.out.print("Mete tu edad:");
			n = sc.nextInt();

			sumedad = sumedad + n;

			if(n >= 18){
				edad++;	
			}
			mediaedad = sumedad / 5;

			//	PARTE DE ALTURA

			System.out.print("Mete tu altura:");
			n = sc.nextDouble();

			sumaalt = sumaalt + n;	// sumaalt vale cero hasta que metemos la altura y se le suma "n", el valor final se guarda en sumaalt para hacer la media

			if (n > 1.75){	//	Aquí indicamos que si es mayor de 1.75 vaya sumando uno
				alto++;
			}
			mediaalt = sumaalt / 5;	//Aquí indicamos la media, cogemos la suma de todas las altura y la dividimos entre 5

		}

		
		// Parte de edad
		System.out.println("\n Resultados de edad:");
		System.out.println("Mayores de edad=" + edad);
		System.out.println("Media edad=" + mediaedad);

		//Parte de altura
		System.out.println("\nResultados edad:");
		System.out.println("Mas altos de 1,75:" + alto);
		System.out.println("Media altura:" + mediaalt);

	}
}