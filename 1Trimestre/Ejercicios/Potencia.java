import java.util.Scanner;

public class Potencia{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca el numero que desea ser elevado: ");
    double a = sc.nextDouble();
    System.out.println("Introduzca el exponente al que desea elevar el numero: ");
    double exp = sc.nextDouble();

    double aux = a;

    while(exp > 1){        // ponemos 1 para que no se multiplique mas veces ya que al poner 0 tambien cuenta como una ve, otra opcion seria iniciar la variable en 1.
        exp--;
        aux = aux * a;          /* usamos una variabl (aux) en este caso, para guardar un numero fijo para poder multiplicar 
         varias veces este numero sin que se vea afectado, de esta forma tienen el mismo funcionamiento de una potencia.*/    
        }
    System.out.println("Su numero elevado es: "+ aux);
    }
    
    // con esto cerramos el Scanner.
}    