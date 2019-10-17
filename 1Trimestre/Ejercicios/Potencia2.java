import java.util.Scanner;

public class Potencia2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base:");
        int b = sc.nextInt();

        System.out.print("Introduzca el exponente:");
        int e = sc.nextInt();

        int r = b;
        int i = e;

        while(i!=1){

            i--;
            r=r*b;
            
        }
        System.out.println(r);
        sc.close();


    }
}