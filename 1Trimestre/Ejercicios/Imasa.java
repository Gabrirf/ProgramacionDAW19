import java.util.Scanner;

public class Imasa{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("P en kilogramos: ");
        double p = sc.nextDouble();

        System.out.println("Medida en Cm: ");
        double altura = sc.nextDouble();

        double altura2 = altura/100;

        double indicedemasacorporal = p/(h2*h2);

        System.out.println("El IDC es: "+indicedemasacorporal);

    }

}