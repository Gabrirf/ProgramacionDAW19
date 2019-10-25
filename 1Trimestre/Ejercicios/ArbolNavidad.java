import java.util.Scanner;

public class ArbolNavidad{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n-2; i++){

            for(int b = (n-i); b>=0; b--){
                   
                System.out.print(" ");
                        
            }

            /*for(int u = i; u>=2; u--){

                System.out.print("*");
                
            }

            for(int b = i; b>=1; b--){
                   
                System.out.print("*");
                        
            }*/

            for(int u = 0; u<(i*2)-1; u++){

                System.out.print("*");
                
            }
            
            System.out.println(" ");

        }
        
        for(int i = 1; i<=n-1; i++){

            for(int b = (n-i); b>=0; b--){
                   
                System.out.print(" ");
                        
            }

            for(int u = 0; u<(i*2)-1; u++){

                System.out.print("*");
                
            }
            
            System.out.println(" ");

        }

        for(int i = 1; i<=n; i++){

            for(int b = (n-i); b>=0; b--){
                   
                System.out.print(" ");
                        
            }

            for(int u = 0; u<(i*2)-1; u++){

                System.out.print("*");
                
            }
            
            System.out.println(" ");

        }
        sc.close();
    }
}