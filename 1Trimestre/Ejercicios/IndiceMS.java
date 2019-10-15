import java.util.Scanner;

public class IndiceMS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("introduzca su estatura en centimetros por favor: ");
        double m1 = sc.nextDouble();

        System.out.println("introduzca su peso en Kg por favor: ");
        double k = sc.nextDouble();

        double m = m1/100;

        double indice = k/(m*m);

        System.out.println("Su Indice de masa corporal es: "+ indice);

    }
}