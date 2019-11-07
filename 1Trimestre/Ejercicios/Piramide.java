import java.util.Scanner;

public class Piramide{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca un valor y se repetira es mismo numero de veces: ");
        int a = sc.nextInt();


        for(int i = a; i >=a-2; i--){
            
            for(int u =1; u <= i; u++ ){
                
                System.out.print(" ");
                
            } 
               
            for(int e =0; e <=(a-i) ; e++){

                System.out.print("*");
            }
            for(int o =1; o <=(a-i); o++){

                System.out.print("*");

            }

            System.out.println(" ");
        }
        
        sc.close();
    }
}