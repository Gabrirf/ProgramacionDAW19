import java.util.Scanner;

public class Piaramide{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        System.out.print("Introduce un numero ");
        numero = sc.nextInt();

        for(int repeticiones = 1; repeticiones <= numero; repeticiones++){
            for(int i = repeticiones-1; i > 0; i--){
                System.out.print("");
            }  
            for(int r = numero; r >= repeticiones; r--){
                System.out.print("*");
            }  
            for(int r = numero; r >= repeticiones; r--){
                System.out.print("*");
            }
            System.out.println(" ");
        }       
    }
}
