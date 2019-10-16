import java.util.Scanner; // Esta es una forma mas simplificada de hacerlo y sin ningun if
public class Cuadradonumerosim{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 1;

        System.out.println("Introduzca un numero: ");
        n = sc.nextInt();
        while(n != 0){ // Entrara cuando sea diferente de 0 != significa diferente
        System.out.println("La potencia de "+n+" es "+n*n);
            System.out.println("Introduzca un numero");
            n = sc.nextInt();
        }
    }
}