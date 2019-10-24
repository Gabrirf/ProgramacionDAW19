import java.util.Scanner;

public class NumerosRepeValores{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        for(int repes = 1; repes <= numero; repes++){
            System.out.println(" ");
           for(int contador = 0; contador < repes; contador++){
               System.out.print(repes);
            }
        }
    }
}