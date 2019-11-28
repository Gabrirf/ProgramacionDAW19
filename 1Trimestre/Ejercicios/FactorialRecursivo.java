import java.util.Scanner;

public class FactorialRecursivo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aux = 1;

        System.out.print("Introduzca un numero: ");
        int n = sc.nextInt();

        System.out.println(factorial(n, aux));

        sc.close();
    }

    public static int factorial(int n, int aux){

        int res = n;

        if(n==0){
            System.out.println("No existe resultado");
        }else if(aux!=n){
            res = res * factorial(n-1, aux);;
        }
        return res;
    }
}