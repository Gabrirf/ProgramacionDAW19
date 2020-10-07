public class Ejercicios {
    public static void main (String[] args){
        
        ejercicio1(3);        

        int resultado2 = ejercicio2(3,3);
        if(resultado2 == -1) System.out.println("Error");

        int resultado3 = ejercicio3(2,5,3,2,5,4,6,3,7,6,5,8,1);
        System.out.println(resultado3);

        ejercicio4(3, 700);


    }

    static void ejercicio1(int numero){
        for(int i=0; i<numero; i++){
            System.out.println(numero);
        }
    }

    static int ejercicio2(int a, int b){
        if(a == b){
            return -1;
        }
        int mayor = a > b ? a : b;
        return mayor;
    }

    static int ejercicio3(int... numeros){
        int max = numeros[0];
        for(int i=1; i<numeros.length; i++){
            max = numeros[i] > max ? numeros[i] : max;
        }
        return max;
    }

    static void ejercicio4(int inicio, int fin){
        for(int i=inicio; i<=fin; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}