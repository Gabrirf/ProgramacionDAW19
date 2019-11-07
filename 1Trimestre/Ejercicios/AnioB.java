import java.util.Scanner;

public class AnioB{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

			int a = 0;

			System.out.println("Introduce anio: ");
			a = sc.nextInt();

			if((a % 400 == 0) || (a % 100 != 0) && (a % 4 == 0)){
				System.out.println(" El anio es bisiesto");
			}else{
				System.out.println(" El anio no es bisiesto");
			}
	}
}			