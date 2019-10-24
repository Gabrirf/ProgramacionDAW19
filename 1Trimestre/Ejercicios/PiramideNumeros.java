import java.util.Scanner;

public class PiramideNumeros{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        sc.close();

        for(int i = 1; i<=n; i++){
            
            for(int u = 1; u<=i; u++){
                System.out.print("*");
                
            }System.out.println(" ");
        }
    }
}