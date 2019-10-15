import java.util.Scanner;
public class ComprobarFecha{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia: ");
        int d = sc.nextInt();

        System.out.println("Introduce el mes: ");
        int m = sc.nextInt();

        System.out.println("Introduce el anio: ");
        int a = sc.nextInt();

        if(d>=1 && d<=30 && m>=1 && m<=12){
            System.out.println("La Fecha es correcta.");
        }else{
            System.out.println("La Fecha no existe");
        }

    }

}