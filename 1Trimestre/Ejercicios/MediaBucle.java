import java.util.Scanner;

public class MediaBucle{

    public static void main(String[] args) {
        Scanner sc = new Scanner(SYstema.in);
        int numeroLeido, contador = 0;                          

        System.out.println("Introduzca un numero: ");
        numeroLeido = sc.nextInt();
        while(numeroLeido >= 0){
            contador ++;                                    // con esto cada vez que entra en el bucle, o sea cada vez que introduce un numero aumenta el contador en 1.
            System.out.println("Introduzca un numero: "); // volbemos a pedir el numero.
            numeroLeido = sc.nextInt();
        }
        System.out.println("Usted ha introducido "+ contador+ " numeros");  // fuera del bucle le damos el resultado del contador. 
    }
}