import java.util.*;

public class ArrayImprimir{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] arrayEnteros = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.print("Introduce un numero: ");
            arrayEnteros[i] = sc.nextInt();
        }
        for(int i = 0; i < tam ; i = i + 2){
            System.out.print(arrayEnteros[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < tam; i++){
            System.out.print(arrayEnteros[i]+" ");
            System.out.print(arrayEnteros[(tam-1)-i]+" ");
        }
    }
}