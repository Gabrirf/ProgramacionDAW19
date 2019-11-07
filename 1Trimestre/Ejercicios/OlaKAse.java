/* -Esto es un comentario, los comentarios se usan para ayuda, sin afectar al codigo del programa,
   -Se abren con barra y asterisco; y se cierra con asterisco y barra.
   -en programacion el primer elemento simepre ser EL 0. 
   -cuando hay un fallo de copilacion es que hay un fallo en la sintaxis o java no es capaz de leerlo,
   -Para añadir un espacio en una funcion con texto(args) (para que te lo muestre en pantalla (print)) añadimos en medio de los dos elmentos comillas.
   -Para hacer condicionales ponemos if(){, osea esto significa si funciona la condicion entra en ese corchete, si no se pondria if(){}else{} y en este corchete pondriamos lo que ocurriria en el caso
   negativo.
*/
public class OlaKAse{
// -Public significa que es publica 
	public static void main(String[] args){		// String significa que va aser tratado los datos como si fuesen texto; ! significa lo contrario de lo que le continua; una sola comilla es para un caracter.
// -Static significa que se va amantener a lo largo de todo el programa.
// -Void es una funcion que no te va devolver nada. 
// -main es la funcion principal que la maquina va a buscar.
		 //System.out es para sacar datos. print para indicar que se imprima.
			// For para hacer una especie de bucle
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println("a + b = " + c); // int; se usa para declarar una variable de numeros enteros. 
		System.out.println(args[0]+" "+args[1]);
		if(edad >= 18){
			if( edad>= 80){
				System.out.println("No puede conducir");
			}else{
				System.out.println("puede conducir");
			}
		}else{}
		}
	}   