import java.util.Scanner;

public class NumeroCaracter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        System.out.print("Introduce un numero ");
        numero = sc.nextInt();

        for(int repeticiones = 1; repeticiones <= numero; repeticiones++ ){
            System.out.println(" ");
            for(int r = 0; r < repeticiones; r++){
                System.out.print    (".1.");
            }
        }
    }       
}
