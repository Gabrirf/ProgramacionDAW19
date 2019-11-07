import java.util.Scanner;

public class NumeroI{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca un valor y se repetira es mismo numero de veces: ");
        int a = sc.nextInt();


        for(int i = a; i >= 1; i--){
               
            for(int e =1; e <=(a-i) ; e++){

                System.out.print(" ");
            }

            for(int u =1; u <= i; u++ ){
                
                System.out.print("*");
                
            } 
            System.out.println(" ");
        }
        
        sc.close();
    }
}