import java.util.Scanner;

public class Funcion2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        sc.nextLine();
        System.out.print("Introduzca un String: ");
        String txt = sc.nextLine();



        funcion(n, txt);

        sc.close();

    }

    public static void funcion(int n, String txt){
        for(int i = 0; i<n; i++){
            System.out.println(txt);
        }
    }

}