import java.util.Scanner;

public class EjercicioWhile1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        do{
            System.out.print("Introduzca un numero:");
            numero = sc.nextInt();

            if((numero % 4 == 0 && numero % 100 != 0) || numero % 400 == 0){
                System.out.println("El numero "+numero+" es bisiesto");
            }else{
                System.out.println("El numero "+numero+" NO es bisiesto");
            }
        }while(numero >= 0);
    }
}