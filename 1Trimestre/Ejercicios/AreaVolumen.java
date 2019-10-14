import java.util.Scanner;

public class AreaVolumen{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        


        System.out.println("Introduzca el valor del Radio del Cilindro: ");
        int radio = sc.nextInt();

        System.out.println("Introduzca el valor de la Altura del Cilindro: ");
        int altura = sc.nextInt();

        System.out.println("Introduzca '1' para Area o '2' para Volumen: ");
        int elec = sc.nextInt();

        

        double r = (double)radio;
        double h = (double)altura;
        double pi = Math.PI;
        double po = Math.pow(r,2);

        double a = 2*pi*r*(r+h);
        double v = pi*po*h;

        

        switch(elec){

            case 1:
                System.out.println("El Area del Cilindro es: "+a+" m^2.");
            break;

            case 2:
                System.out.println("El Volumen del Cilindro es: "+v+" m^3.");
            break;

        }
    }
}