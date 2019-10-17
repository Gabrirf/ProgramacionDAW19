import java.util.Scanner;

public class Numero1{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n=1;

        while(n!=0){

            System.out.print("Introduzca un numero: ");
            n = sc.nextInt();

            if(n>0){

                System.out.println("El numero es positivo");
                
            }else if(n<0){

                System.out.println("El numero es negativo");
                
            }
            

        }
        System.out.println("El programa ha finalizado");
        sc.close();

    }
}