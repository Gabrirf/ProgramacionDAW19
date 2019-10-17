import java.util.Scanner;

public class NegativoPositivo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 1;
        int k = 0;
        
        System.out.println("Introduce un numero");
        n = sc.nextInt();
        while(n!=0){
            if(n < 0 ){ //(1*(-n))
                System.out.println("El numero es negativo");
            }else if(n==n){
                System.out.println("El numero es positivo");
            }System.out.println("Introduce un numero");
            n = sc.nextInt();
        }
    }
}