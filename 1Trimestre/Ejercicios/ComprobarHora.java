import java.util.Scanner;
public class ComprobarHora{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce Hh(hora): ");
        int h = sc.nextInt();

        System.out.println("Introduce el mm(minutos): ");
        int m = sc.nextInt();

        System.out.println("Introduce el ss(segundos): ");
        int s = sc.nextInt();

        if(h>=0 && h<=23 && m>=0 && m<=59 && s>=0 && s<=59){

            System.out.println("La hora es correcta");

        }else{

            System.out.println("La hora no existe");

        }
        
    }

}