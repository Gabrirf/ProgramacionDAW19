import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int fact = 0;
        int resultado = 0;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();
        fact = numero-1;

        while(fact>1){
            resultado = fact * numero;
            System.out.println(numero+" x "+fact+" = "+resultado);
            numero = resultado;
            fact--;
        }
    }
}