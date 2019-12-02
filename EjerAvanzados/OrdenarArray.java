import java.util.Scanner;
import java.util.Arrays;

public class OrdenarArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cantidad de numeros: ");
        int length = sc.nextInt();

        int[] array = new int[length];
        System.out.println("Introduzca "+length+" numeros:");
        for(int i = 0; i<length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("\nEstos son los numeros introducidos: "+Arrays.toString(array));

        System.out.println("\n1. Creciente\n2. Decreciente\n0.Exit");
        System.out.print("\nElija su opcion: ");
        int op = sc.nextInt();

        switch(op){
            case 1: 
                System.out.println("Estos son los numeros en orden creciente: "+Arrays.toString(ordenar(array)));
                break;
            
            case 2:
                int [] array2 = ordenar(array);
                System.out.println("Estos son los numeros en orden decreciente: "+Arrays.toString(invertir(array2)));
                break;
            
            default:
                System.out.println("Gracias por su tiempo!");
        }

        sc.close();
    }

    public static int[] ordenar(int[] array){

        int aux;

        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array.length-i-1; j++){
                if (array[j + 1] < array[j]) {
                    aux = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

    public static int[] invertir(int[] array2){
        int[] invertido = new int[array2.length];
        int max = array2.length;
        for(int i = 0; i<array2.length; i++){
            invertido[max-1] = array2[i];
            max--;
        }
        return invertido;
    }
}