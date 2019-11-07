import java.util.Scanner;

public class Esfera{

public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el Diametro para saber el radio, el area y el volumen: " );
    double a = sc.nextDouble();       // Diametro = a; para que introduzca el valor que queremos hay que hacerlo en este orden

    double d = a/2;
    System.out.println("El radio es: " + d);

    double pi = Math.PI;   // Math.PI-----> sirve para poner el numero Pi en el lenguaje de programacion
    double area = 4*pi*d*d;
    double volumen = 4/3 * pi *d*d*d;

    System.out.println("El area de la esfera es: " + area );
    System.out.println("El volumen de la esfera es: " + volumen);
    
    sc.close();
    }    
}