import java.util.Scanner;

public class Fecha{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca anio porfavor");

        int a = sc.nextInt();

        System.out.println("Introduca mes porfavor");

        int m = sc.nextInt();

        System.out.println("Introduca dia porfavor");
        int d = sc.nextInt();

        if( d >= 1 && d <= 30 && m >= 1 && m <= 12){
            System.out.println("Fecha introducida valida");
        }else{
            System.out.println("La fecha introducida no es valida");
        }
    }
} 