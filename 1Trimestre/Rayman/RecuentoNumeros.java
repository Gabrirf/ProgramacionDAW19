import java.util.Scanner;

public class RecuentoNumeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int k = 0;
        
        System.out.println("Introduce numero");
        k = sc.nextInt();
        while(k>0){
            n++;
            System.out.println("Introduce un numero");
            k = sc.nextInt();
        }System.out.println("Ha metido "+n+" numeros");
    }
}