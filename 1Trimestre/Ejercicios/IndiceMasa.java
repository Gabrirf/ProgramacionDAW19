import java.util.Scanner;

public class IndiceMasa{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto pesas en kg: ");
        double p = sc.nextDouble();

        System.out.println("Cuanto mides en cm: ");
        double h = sc.nextDouble();

        double h2 = h/100;

        double imc = p/(h2*h2);

        System.out.println("El Indice de Masa Corporal es de "+imc);

    }

}