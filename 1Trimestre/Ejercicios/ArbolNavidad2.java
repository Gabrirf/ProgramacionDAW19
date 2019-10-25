import java.util.Scanner;

public class ArbolNavidad2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        for(int a=1; a<=n; a++){

            for(int i = 1; i<=a; i++){

                for(int b = (n-i); b>=0; b--){
                       
                    System.out.print(" ");
                            
                }
    
                for(int u = 0; u<(i*2)-1; u++){
    
                    System.out.print("*");
                    
                }
                
                System.out.println(" ");

            }

        }
        sc.close();
    }

}