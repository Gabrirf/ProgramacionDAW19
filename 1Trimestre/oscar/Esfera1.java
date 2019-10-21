import java.util.Scanner;


public class Esfera1{
	public static void main(String[] args) {
		
		//4 π r 2
		//double pi = 3.1415926535897932384626433832;
		//double radio = 0;
		//double diametro = 0;
		
		int radios = 1;
		int area = 2;
		int volumen = 3;
		int salir = 4;

			Scanner numero = new Scanner(System.in);

			 System.out.println("Que quieres calcular");
			 System.out.println(" ");
			 System.out.println("-a)Para calcular radio pulsa '1'");
			 System.out.println(" ");
			 System.out.println("-b)Para calcular Area pulsa '2'");
			 System.out.println(" ");
			 System.out.println("-c)Para calcular Volumen pulsa '3'");
			 System.out.println(" ");
			 System.out.println("'4' para salir");

			 	radios = numero.nextInt();

			 		if (radios == 1){

			 				double diametro = 0;
			 					System.out.println("APara calcular el radio introduce diametro en centimetros");
			 						diametro = numero.nextDouble();
										System.out.println("El radio es "+(diametro / 2));


			 		}else if (radios == 2){
			 			double diametro2 = 0;
			 			double pi = 3.1415926535897932384626433832;
			 				if(diametro2 > 0){ 
			 					System.out.println("Para calcular el area Introduce el diametro en centimetros");
			 					diametro2 = numero.nextDouble();
			 						System.out.println("El area es "+(4*pi*((diametro2/2)*(diametro2/2))));
			 					}
			 		}else if (radios == 3){
			 			double diametro3 = 0;
			 			double pi = 3.1415926535897932384626433832;
			 				System.out.println("Para calcular esl volumen introduce el diametro en centimetro");
			 					diametro3 = numero.nextDouble();
			 						System.out.println("El volumen es "+(4/3*(pi)*((diametro3/2)*(diametro3/2)*(diametro3/2))));
			 		
			 		}else if (radios == 4){
			 			System.out.println("...");
			 			System.out.println("exit");
			 		}
			 		

			 		
			 		}

	}
