import java.util.Scanner;

public class Bisiesto{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un Anio: ");
        int a = sc.nextInt();

        if(a%400==0 || a%100!=0 && a%4==0){
            System.out.println("Es Bisiesto");
        }else{
            System.out.println("No es Bisiesto");
        }

    }
}