
package paquete1;

public class Funciones{

    //Duplicado
    public static int duplicar(int n){
        return n*2;
    }

    //Numero mayor
    public static int mayor(int a, int b){
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        return max;
    }

    //Numero menor
    public static int menor(int a, int b){
        int min;
        if(a>b){
            min=b;
        }else{
            min=a;
        }
        return min;
    }

    //Maximo valor de un array
    public static int maxAr(int[] ar){

        int max=0;

        for(int i = 0; i<ar.length; i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }

        return max;

    }

    //Minimo valor de un array
    public static int minAr(int[] ar){

        int min=0;

        for(int i = 0; i<ar.length; i++){

            if(min>ar[i]){
                min=ar[i];
            }

        }

        return min;

    }

}