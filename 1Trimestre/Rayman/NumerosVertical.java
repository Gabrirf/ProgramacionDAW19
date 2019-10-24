import java.util.Scanner;

public class NumerosVertical{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        numero++;

        for(int contador = 1; contador < numero; contador++){
            System.out.println(contador+" ");
        }
    }
}