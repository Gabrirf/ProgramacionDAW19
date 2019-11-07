import java.util.*;

public class ArrayMedia{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int media = 0;
        int resultado = 0;
        int[]  arrayEnteros = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.println("Introduce un numero: ");
            arrayEnteros[i] = sc.nextInt();
        }
        for(int a = 0; a < arrayEnteros.length; a++){
            media = arrayEnteros[a] + media;
        }
        resultado = media / arrayEnteros.length;
        System.out.println("La media de todos estos resultados "+Arrays.toString(arrayEnteros)+" es "+resultado);
    }
}