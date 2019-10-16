import java.util.Scanner;

public class negativopositivo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;

		System.out.print("Introduce un numero: ");
			n=sc.nextInt();

			while(n!=0){
				
				if(n<0){
					System.out.println("El numero es negativo");

					System.out.print("Introduce un numero: ");
						n=sc.nextInt();
				}else{
					System.out.println("El numero es positivo");

					System.out.print("Introduce un numero: ");
						n=sc.nextInt();
			}
			}if(n==0){
					System.out.println("Has salio");
			}
	}
}