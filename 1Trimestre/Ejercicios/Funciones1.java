import java.util.Scanner;

public class Funciones1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("\nIntroduzca primer numero: ");
        n1 = sc.nextInt();

        System.out.print("\nIntroduzca segundo numero: ");
        n2 = sc.nextInt();

        System.out.println("\nLa suma de estos dos numeros es: "+suma(n1, n2));

        sc.close();
    }

    //Declarar una funcion que realiza la suma de dos variables
    public static int suma(int n1, int n2){

        return n1+n2;

    }
}