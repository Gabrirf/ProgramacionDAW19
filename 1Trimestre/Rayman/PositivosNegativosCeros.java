import java.util.Scanner;

public class PositivosNegativosCeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int positivo = 0;
        int negativo = 0;
        int cero = 0;

        for(int contador = 0 ; contador < 10; contador++){
            System.out.print("Introduce un numero: ");
            num1 = sc.nextInt();
            if(num1 > 0){
                positivo++;
            }else if(num1 < 0){
                negativo++;
            }else{
                cero++;
            }
        }       System.out.println("Hay "+positivo+" numeros positivos.");
                System.out.println("Hay "+negativo+" numeros negativos.");
                System.out.println("Hay "+cero+" ceros.");
    }
}