import java.util.Scanner;

public class Factorizacion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduzca el numero que desea factorizar: ");
        int a = sc.nextInt();
        int z = a;
        for(int i=a-1; i>=2;i--){
            z = i*z;
            
        }System.out.println(z);
        sc.close();
    }
}