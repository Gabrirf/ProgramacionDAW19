import java.util.Scanner;

public class parimpar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=0;

		System.out.print("Introduce un numero: ");
			n=sc.nextInt();

		while(n!=0){

			if(n%2==0){
				System.out.println("Si es par.");

				System.out.print("Introduce un numero: ");
					n=sc.nextInt();
			}else{
				System.out.println("No es par.");

				System.out.print("Introduce un numero: ");
					n=sc.nextInt();
			}
			if(n==0){
				System.out.println("Saliste wey.");
			}
		}
	}
}