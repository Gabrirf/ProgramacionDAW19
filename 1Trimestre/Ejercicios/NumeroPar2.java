import java.util.Scanner;

public class NumeroPar2{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n=1;

        while(n!=0){

            System.out.print("Introduzca un numero: ");
            n = sc.nextInt();

            if(n%2==0 && n!=0){

                System.out.println("El numero es par");
                
            }else if(n%2!=0 && n!=0){

                System.out.println("El numero es impar");
                
            }
            

        }
        System.out.println("El programa ha finalizado");
        sc.close();

    }
}