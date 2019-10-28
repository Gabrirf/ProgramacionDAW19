import java.util.Scanner;

public class Sueldos{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int listado = 0;
        int sueldo = 0;
        int sueldomax = 0;
        System.out.println("Introduce la cantidad de numero que vas a introducir: ");
        listado = sc.nextInt();

        for(int contador = 0; contador < listado; contador++){
            System.out.println("Introduce el sueldo: ");
            sueldo = sc.nextInt();
            if(sueldo > sueldomax){
                sueldomax = sueldo;
            }
        }
        System.out.println("El sueldo maximo es de "+sueldomax+" euros.");
    }
}