import java.util.Scanner;

public class ContadorNumeros{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n=0;
        int cont=0;

        System.out.print("Introduzca un numero: ");
        n = sc.nextInt();


        while(n>=0){

            cont++;

            System.out.print("Introduzca otro numero: ");
            n = sc.nextInt();

        }

        
        System.out.println("Has introducido "+cont+" numeros.");
        sc.close();

    }

}