import java.util.Scanner;
import java.util.Arrays;

public class MediaR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam = 10;
        double sum = 0;
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;

        // Si no indico argumento
        if(args.length > 0){
            tam = Integer.parseInt(args[0]);
        }else{
            tam = 10;
        }
        int[] array = new int[tam];

        // Rellenamos el array
        for(int i = 0; i < array.length; i++){
            System.out.println("Introduzca un numero porfavor: ");
            array[i] = sc.nextInt();
        }
        // Calculamos
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];

            if(array[i] == 0){
                ceros++;
            }else if(array[i] < 0){
                negativos++;
            }else{
                positivos++;
            }
        }

        String array2 = Arrays.toString(array);             //tengo que guardar el metodo en alguna variable para poder enseñarlo.
        double m = sum/array.length;                           //  array.length; es la longitud que tenga el array.
        System.out.println("Sus numeros son: "+ array2);
        System.out.println("La media de sus "+ array.length +" numeros es: "+ m);
        
        if(negativos != 0){
            System.out.println("Cantidad de numeros negativos: " + negativos);
        }
        if(positivos != 0){
            System.out.println("Cantidad de numero positivos: " + positivos);
        }
        if(ceros != 0){
            System.out.println("Cantidad de 0 es " + ceros);
        }
        sc.close();
    }
}