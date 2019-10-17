import java.util.Scanner;

public class ImparPar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 0;        

        System.out.println("Introduce un numero");
        n = sc.nextInt();
        while(n!=0){
            if(n%2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }System.out.println("Introduce otro numero");
            n = sc.nextInt();
        }
    }
}