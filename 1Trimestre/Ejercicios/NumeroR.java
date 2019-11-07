import java.util.Scanner;

public class NumeroR{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduzca un valor y se repetira es mismo numero de veces: ");
        int a = sc.nextInt();
        int u;

        for(int i =1; i <= a; i++){
            

            for(u = 1; u <= i;u++ ){
                System.out.print("*");    //la "u" es un simple contador de las veces que tiene que imprimir la "i"
               
            }
            System.out.println(" ");    // este sistem se usa para que el bucle vuelba a entrar en si, al leer el system. gracias al valor que hay en vacio.
        }
        
        sc.close();
    }
}