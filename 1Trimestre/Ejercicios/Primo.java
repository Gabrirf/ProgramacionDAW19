import java.util.Scanner;
 
public class Primo{
    public static void main(String[] ARGS){

        Scanner sc = new Scanner(System.in);
        int contador,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++){

            if((numero % I) == 0){

                contador++;

            }
        }
 
        if(contador <= 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}