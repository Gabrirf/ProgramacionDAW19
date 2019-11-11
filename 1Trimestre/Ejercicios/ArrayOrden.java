import java.util.Scanner;
public class ArrayOrden{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ar = new int[5];

        System.out.println("Introduce 5 numeros:");

        for(int i = 0; i<5; i++){
            ar[i] = sc.nextInt();
        }

        int cont = 0;
        int cont2 = 0;
        int a;
        int b;

        for(int i = 0; i<5; i++){

            
            if(i<4){
                a = ar[i];
                b = ar[i+1];
            }else{
                b=ar[4];
                a=ar[3];
            }
            

            if(a<b){
                cont++;
            }
        }

        for(int i = 0; i<5; i++){

            
            if(i<4){
                a = ar[i];
                b = ar[i+1];
            }else{
                b=ar[4];
                a=ar[3];
            }
            

            if(a>b){
                cont2++;
            }
        }
        
        if(cont==5){
            System.out.println("Ordenado de forma Creciente.");
        }else if(cont2==5){
            System.out.println("Ordenado de forma Decreciente.");
        }else{
            System.out.println("No esta Ordenado.");
        }

        sc.close();
    }
}