import java.util.Scanner;

public class Factorial{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();

        int res = 1;

        while(n!=0){
            res = res*n;
            n--;
        }
        System.out.println("El resultado es: "+res);
        
        sc.close();
    }

}