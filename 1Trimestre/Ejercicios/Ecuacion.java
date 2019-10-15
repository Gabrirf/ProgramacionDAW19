import java.util.Scanner;
import java.util.Math; // biblioteca para raices y potencias. 

public class Ecuacion{

    public static void main(String[] args){
                                                // Math.sqrt(...) para raices cuadradas en java
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca b: ");
        double b = sc.nextDouble();

        System.out.print("Introduzca a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce c: ");
        double c = sc.nextDouble();
        double d = (b*b)-(4*a*c);
        double r = Math.sqrt(d);
        
        if (d < 0){
            System.out.println(" La ecuacion de 2º grado no puede realizarse");
        }else{
                double so = (-b + r)/(2*a);
                System.out.println("Resultado de x1 es = " + so);
                
                double sn = (-b - r)/(2*a);
                System.out.println("Resultado de x2 es = " + sn);
                
            }
          
    }
}