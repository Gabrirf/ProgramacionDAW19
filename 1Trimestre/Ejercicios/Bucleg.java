import java.util.Scanner;

public class Bucleg{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduzca un numero y se realizara su potencia, si usted desea finalizar el programa solo debe introducir el numero 0");

        int a = 1;
        a = sc.nextInt();

        while(a != 0){

            int b = a*a;
            System.out.println("Su potencia es: " + b );

            System.out.println("Introduzca su numero");
            a = sc.nextInt();

        }
        System.out.println(" Su programa ha finalizado");
        sc.close();
    }
}