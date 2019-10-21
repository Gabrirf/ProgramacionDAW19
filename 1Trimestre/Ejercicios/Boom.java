import java.util.Scanner;

public class Boom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero y comenzara el juego: ");
        int n = sc.nextInt();

        while(n > 0){
            System.out.println(" " + (n-1));
            n--;
        }if(n == 0){
        System.out.println("BOOOOM");
        }
        sc.close();
    }
}