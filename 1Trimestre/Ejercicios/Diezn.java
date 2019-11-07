import java.util.Scanner;
import java.util.Arrays;

public class Diezn{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int i; 
        for( i = 0; i < 10; i++){

            System.out.println("Introduzca un numero: ");
            n [i] = sc.nextInt();

        }
        
        //String arrn = Arrays.toString(n); ------------------------------------> Para imprimir todo la Arrais completa
        System.out.println(" ");
        for( i = 0; i < 10; i++){

            if(i%2!=0){
                System.out.print(n[i]+" ");
            }
        }
        
    }
}