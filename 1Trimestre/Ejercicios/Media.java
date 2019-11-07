import java.util.Scanner;
                                                                //la clase que desees usar--->(....).parseInt= para transformar en numero enteros por la finalizacion. -int.
public class Media{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double contador = 0;
        double numeroLeido; 
        double suma = 0;                         

        System.out.println("Introduzca un numero: ");
        numeroLeido = sc.nextDouble();
        while(numeroLeido >= 0){
            suma = suma + numeroLeido;
            contador ++;                                    // con esto cada vez que entra en el bucle, o sea cada vez que introduce un numero aumenta el contador en 1.
            //pedimos de nuevo numero si no entra en bucle infinito. y BUM RESPLANDOR
            System.out.println("Introduzca un numero: "); // volbemos a pedir el numero.
            numeroLeido = sc.nextDouble();
        }
        System.out.println("La media de los numeros introducidos es: " + (suma/contador));  // fuera del bucle le damos el resultado del contador. 
    }
}