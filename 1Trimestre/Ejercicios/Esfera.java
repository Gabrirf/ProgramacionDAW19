import java.util.Scanner;

public class Esfera{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Introduzca el valor del Diametro de la Esfera: ");
        double diametro = sc.nextDouble();

        //Aqui habría que meter un condicional por si el diametro es negativo

        System.out.println("Introduzca '1' para Area o '2' para Volumen o '3' para Radio: ");
        int elec = sc.nextInt();

        double r = diametro/2;
        double pi = Math.PI;
        double po2 = Math.pow(r,2);
        double po3 = Math.pow(r,3);

        double a = 4*pi*po2;
        double v = (4f/3f)*pi*po3;

        switch(elec){

            case 1:
                System.out.println("El Area de la Esfera es: "+a+" m^2.");
                break;

            case 2:
                System.out.println("El Volumen de la Esfera es: "+v+" m^3.");
                break;

            case 3:
                System.out.println("El radio de la Esfera es: "+r+" m.");
                break;

            default:
                System.out.println("No es una opcion valida.");
            //case default: para que haga algo en caso por defecto

        }
    }
}