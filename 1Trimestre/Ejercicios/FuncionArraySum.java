import java.util.Scanner;


public class FuncionArraySum{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de numeros a sumar: ");
        int cant = sc.nextInt();
        int [] myArray = new int[cant];
        System.out.println("Escribe "+cant+" numeros: ");
        for(int i=0; i<cant; i++ ) {
            myArray[i] = sc.nextInt();
        }
        sumArray(cant, myArray);
        sc.close();
    }

    public static void sumArray(int cant, int[] myArray){
        int sum = 0;
        for(int i = 0; i<cant; i++){
            sum = sum + myArray[i];
        }
        System.out.println("La suma de todos estos numeros es: "+sum);
    }

}