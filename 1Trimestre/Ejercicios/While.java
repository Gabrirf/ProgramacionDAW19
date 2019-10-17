import java.util.Scanner;

public class While{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int n;

			System.out.println("Introduce un numero:");
			n=sc.nextInt();
//
		while(n!=0){

			System.out.println("La potencia de "+n+ " es "+n*n);

			System.out.println("Introduce un numero:");
			n=sc.nextInt();
		}

	}
}