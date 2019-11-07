import java.util.Scanner;

public class Bucle{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean control = true;
        System.out.println("Introduzca un numero y se realizara su potencia, si usted desea finalizar el programa solo debe introducir el numero 0");

        while(control){


            int a = sc.nextInt();
            int b = a*a;

            System.out.println("Su potencia es: " + b );

            if(a==0){
                control = false;
            }
        }
        System.out.println(" Su programa ha finalizado");
        sc.close();
    }
}