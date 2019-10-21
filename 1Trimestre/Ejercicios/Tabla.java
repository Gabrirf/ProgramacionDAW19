import java.util.Scanner;

public class Tabla{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero que desea multiplicar: ");
        int a = sc.nextInt();

        for( int i = 0; i<=10; i++ ){
            int s = a*i;
            System.out.println(s+" = "+ a +" x " + i);
        }
        sc.close();
    }
}