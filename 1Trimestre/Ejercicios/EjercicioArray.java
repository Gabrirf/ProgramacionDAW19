import java.util.*;

public class EjercicioArray{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        int[] arrayEnteros = new int[5];  // Declarar una variable que es un array

        for(int i = 0; i < 5 ; i++){
            System.out.print("Introduce un numero: ");
            arrayEnteros[i] = sc.nextInt();
            
            //sc.next(); //extra
        }
        System.out.println("He terminado");
        for(int i = 0; i < 5 ; i++ ){
            System.out.print(arrayEnteros[i] + " ");
        }
    }
}