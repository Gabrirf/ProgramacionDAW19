import java.util.Scanner;

public class PotenciaBucle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Introduzca un numero: ");
		n = sc.nextInt();
		while(n != 0){
			System.out.println("La potencia de "+n+" es "+n*n);
		
			System.out.print("Introduzca un numero: ");
			n = sc.nextInt();
		}
	}
}