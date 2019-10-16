import java.util.Scanner;

public class Ecuacionsegundogrado{

	public static void main(String[] args){

		System.out.println("Ax^2+Bx+C=0");

		Scanner sc=new Scanner(System.in);

		System.out.println("A");
		double a=sc.nextDouble();

		System.out.println("B");
		double b=sc.nextDouble();

		System.out.println("C");
		double c=sc.nextDouble();

		double x= (b*b)-(4*a*c);

		if(x<0){

			System.out.println("Sin solucion");
		}else{

			double r = Math.sqrt(x);

			double ps=(-b+r)/(2*a);
			double ss=(-b-r)/(2*a);

			System.out.println("Soluciones"+ps+"y"+ss);

		}

	}
}