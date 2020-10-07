import java.util.Scanner;

public class EjemploDoWhile{
	public static void main(String[] args) {
        boolean control = false;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Elije una opción:");
            System.out.println("1.Seguir");
            System.out.println("2.Salir");
            control = sc.nextInt() == 1 ? true : false;
        }while(control);

	}
}