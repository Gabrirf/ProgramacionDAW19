import java.util.Scanner;

public class RepetirNumero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        System.out.print("Introduce un numero ");
        numero = sc.nextInt();

        
        for(int contador = 0; contador < numero; contador++ )
        System.out.println(contador+" ");

    }
}