import java.util.Scanner;

public class AprendeContar{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        System.out.print(n+" ");

        while(n!=1){
            n--;
            System.out.print(n+" ");
        }

        System.out.print(" Boom!");

        sc.close();
    }

}