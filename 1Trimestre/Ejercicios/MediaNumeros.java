import java.util.Scanner;

public class MediaNumeros{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n=0;
        double cont=0;
        double sum=0;
        double res=0;

        System.out.print("Introduzca un numero: ");
        n = sc.nextDouble();


        while(n>=0){

            sum = sum+n;
            cont++;

            System.out.print("Introduzca otro numero: ");
            n = sc.nextDouble();

        }

        res = sum/cont;
        System.out.println("La media de todos los numeros es igual a "+res);
        sc.close();

    }

}