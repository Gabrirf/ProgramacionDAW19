import java.util.Scanner;

public class Ecuacion{

public static void main(String[] args) {

    System.out.println("Ax^2+Bx+C=0");
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el Valor de A: ");
    double a = sc.nextDouble();

    System.out.println("Introduce el Valor de B: ");
    double b = sc.nextDouble();

    System.out.println("Introduce el Valor de C: ");
    double c = sc.nextDouble();

    double i = (b*b)-(4*a*c);
    
    
    if(i<0){

        System.out.println("No hay solucion");
        
    }else{

        double raiz = Math.sqrt(i);

        double sol1 = (-b+raiz)/(2*a);
        double sol2 = (-b-raiz)/(2*a);

        System.out.println("Los resultados son: "+sol1+" y "+sol2);
    }
    

}

}