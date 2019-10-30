import java.util.Scanner;

public class FactNum		
{
	public static void main(String[] args) {

		float factorial = 1f;
		float numero = 0f;

		Scanner tecla = new Scanner(System.in);


		System.out.printf("Mete un numero y lo factorizo:"); 	//pedimos un numero para iniciar el programa
		numero = tecla.nextInt();

		if (numero < 1){									//Poniendo aquí el if, logramos que no entre en el bucle y se quede aquí si el numero que
		System.out.println("El factorial de 0 es 1");		//metemos es 0, para poner el mensaje y el resultado
		}

		while(numero >= 1 )	{					//El bucle solo entra si es mayor o igual a 1

			factorial = factorial * numero;		//Aquí hacemos la operación, multiplicamos 1 por el numero
			numero--;							//Aquí vamos restando un numero, así cuando empieza el bucle de nuevo tenemos un numero menos para hacer la factorial
		}

		System.out.println(factorial);			//Aquí imprimimos el resultado de la factorial del numero que queramos.


	}
}
