import java.util.Scanner;

public class Pares{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

        sc.close();
    }
}