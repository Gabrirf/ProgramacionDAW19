import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotacion{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] ar = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(ar));
        System.out.print("\nIntroduzca numero de veces a rotar este Array:");
        int n = sc.nextInt();

        System.out.println(" ");

        int cont = 0;
        int aux0, aux1, aux2, aux3, aux4;

        while(cont!=n){

            aux0 = ar[0];
            aux1 = ar[1];
            aux2 = ar[2];
            aux3 = ar[3];
            aux4 = ar[4];

            ar[0] = aux4;
            ar[1] = aux0;
            ar[2] = aux1;
            ar[3] = aux2;
            ar[4] = aux3;

            /*
            
            for(int i = ar.length-1; i>0; i--){

                if((i+1)==5){
                    ar[0]=ar[i];
                }else{
                    aux = ar[i+1];
                    ar[i]=aux; 
                }  

            }

            */

            System.out.print(Arrays.toString(ar)+" ");

            cont++;
        }

        System.out.println("\n\nHa terminado!");
        sc.close();
    }
}