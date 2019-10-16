import java.util.Scanner;

public class Potencia{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n;

        double r = 0;

        System.out.print("Escriba un numero: ");
        n = sc.nextDouble();

        while(n!=0){

            r = Math.pow(n,2);
            System.out.println("Al cuadrado es igual a "+r);

            System.out.print("Escriba un numero: ");
            n = sc.nextDouble();
            
        }
        System.out.println("El programa ha terminado");
        sc.close();

    }

}