import java.util.Scanner;

public class Tablademulti{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc es el nombre del scanner se le puede poner el nombre que quiera.
        int numero = 0;
        int multiplicador = 0;
        int resultado = 0;
        System.out.println("Introduce un numero");
        numero = sc.nextInt();

        while(multiplicador<=10){    //bucle.cnd se cumpla lo que hay dentro seguiremos con el programa
            resultado = numero*multiplicador;
            System.out.println(numero+" x "+multiplicador+" = "+resultado);
            multiplicador++;
        }    
        

    }
}