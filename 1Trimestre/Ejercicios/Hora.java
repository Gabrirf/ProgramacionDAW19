import java.util.Scanner;

public class Fecha{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca anio porfavor");

        int h = sc.nextInt();

        System.out.println("Introduca mes porfavor");

        int m = sc.nextInt();

        System.out.println("Introduca dia porfavor");
        int s = sc.nextInt();

        if( h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59){
            System.out.println("Hora introducida valida");
        }else{
            System.out.println("Lo sentimos la Hora introducida no es valida");
        }
    }
} 