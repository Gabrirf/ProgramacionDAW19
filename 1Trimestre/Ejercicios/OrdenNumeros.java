import java.util.Scanner;

public class OrdenNumeros{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] ar = new int[10];

        System.out.println("Introduzca 10 numeros: ");

        for(int i =0; i<10; i++){
            ar[i]=sc.nextInt();

        }

        for(int i =0; i<10; i++){

            if(i%2!=0){
                System.out.print(ar[i]+" ");
            }

        }
        sc.close();

        
    }
}