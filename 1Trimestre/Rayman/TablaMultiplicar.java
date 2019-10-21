import java.util.Scanner;

public class TablaMultiplicar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int multiplicador = 0;
        int resultado = 0;
        System.out.println("Introduce un numero y le mostrare su tabla de multiplicar");
        numero = sc.nextInt();
        
        while(multiplicador<=10){
            resultado = numero * multiplicador;
            System.out.println(multiplicador+" por "+numero+" es igual a = "+resultado);
            multiplicador++;
        }
    }
}