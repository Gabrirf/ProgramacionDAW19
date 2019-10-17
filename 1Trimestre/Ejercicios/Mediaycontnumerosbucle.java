import java.util.Scanner;

public class Mediaycontnumerosbucle{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		double nl;
		double cont=0;
		double s = 0;


		System.out.print("Introduce numeros: ");

		nl = sc.nextInt();

			while( nl>=0 ){
				
				s = s + nl;
				cont ++;

					System.out.print("Introduce numeros: ");

						nl = sc.nextInt();

		}
		System.out.println("Has introducido "+cont+" numeros.");
		System.out.println("La suma de todos los numeros es "+s);
		System.out.println("La media de los numeros es "+(s / cont) );

	}
	
}