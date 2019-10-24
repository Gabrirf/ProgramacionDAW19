import java.util.Scanner;

public class NumerosSeguidos{   // for(primero ponemos el contadorcque es iniciado por una variable; luego la condicion; y luego una operacion como i++ )
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        numero++;

        for(int contador = 1 ; contador < numero ; contador++){
            System.out.print(contador+" ");
        }
    }
}