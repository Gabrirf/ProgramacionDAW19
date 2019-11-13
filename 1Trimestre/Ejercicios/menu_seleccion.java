import java.util.Scanner;

public class menu_seleccion{  

	public static void main(String[] args) {
		
		int seleccion;
		//suma
		int suma;
		int suma1;
		int suma2;
		//resta
		int resta;
		int resta1;
		int resta2;
		//multiplicacion
		int multiplicacion;
		int multi1;
		int multi2;
		//division
		int division;
		int division1;
		int division2;
		//potencia
		int base;
		int exp;
		//factorial
		int factorial = 1;
		int fact1;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nEstas son las opciones ");
		System.out.println("(1) Suma ");
		System.out.println("(2) Resta ");
		System.out.println("(3) Multiplicacion ");
		System.out.println("(4) Division ");
		System.out.println("(5) Potencia ");
		System.out.println("(6) Factorial ");
		System.out.println("Para salir pulse 0  ");
		System.out.print("¿Que opcion quiere usar?  ");
		

		seleccion = sc.nextInt();

		while (seleccion != 0){

			if (seleccion == 1){
				System.out.println("Ha elegido usted una suma ");
				System.out.print("Meta un numero:");
				suma1 = sc.nextInt();
				System.out.print("\nMeta otro numero:");
				suma2 = sc.nextInt();
				suma = suma1 + suma2;
				System.out.println("El resultado de la suma es: " + suma);

			}

			if (seleccion == 2){
				System.out.println("Ha elegido usted hacer una resta ");
				System.out.print("Meta un numero:");
				resta1 = sc.nextInt();
				System.out.print("Meta otro numero:");
				resta2 = sc.nextInt();
				resta = resta1 - resta2;
				System.out.println("El resultado de la resta es: " + resta);



			}

			if (seleccion == 3){
				System.out.println("Ha elegido usted multiplicar ");
				System.out.print("Meta un numero: ");
				multi1 = sc.nextInt();
				System.out.print("Meta otro numero: ");
				multi2 = sc.nextInt();
				multiplicacion = multi1 * multi2;
				System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

			}

			if (seleccion == 4){
				System.out.println("Ha elegido usted dividir ");
				System.out.print("Meta un numero: ");
				division1 = sc.nextInt();
				System.out.print("Meta otro numero: ");
				division2 = sc.nextInt();
				division = division1 / division2;
				System.out.println("El resultado de la division es: " + division);

			}

			if (seleccion == 5){
				System.out.println("Ha elegido usted hacer una potencia ");
				System.out.println("Ingrese la base: ");
				base = sc.nextInt();
				System.out.println("Ingrese el exponente");
				exp = sc.nextInt();
				int exponente = (int) Math.pow(base, exp);
				System.out.println(base + " elevado a " + exp + " es igual a =  " + exponente);
			}

			if (seleccion == 6){
				System.out.println("Ha elegido usted hacer un factorial ");
				System.out.print("Introduce un numero: ");
				fact1 = sc.nextInt();
				if (fact1 < 1){									
				System.out.println("El factorial de 0 es 1");		
				}

				while(fact1 >= 1 ){				

				factorial = factorial * fact1;		
				fact1--;							
				}

				System.out.println("El factorial es" + factorial);	
				
			}

		System.out.println("\nEstas son las opciones ");
		System.out.println("(1) Suma ");
		System.out.println("(2) Resta ");
		System.out.println("(3) Multiplicacion ");
		System.out.println("(4) Division ");
		System.out.println("(5) Potencia ");
		System.out.println("(6) Factorial ");
		System.out.println("Para salir pulse 0  ");
		System.out.print("¿Que opcion quiere usar?  ");
		
		seleccion = sc.nextInt();
		}

	}
}