import java.util.Scanner;

public class convertirhora{
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);

		float h=0;

		System.out.print("Pon un numero: ");
			h=n.nextFloat();

		System.out.println(h*3600+ " segundos");
		System.out.println(h*60+ " minutos");
		System.out.println(h/24+ " dias");
		System.out.println(h/168+ " semanas");
		System.out.println(h/5040+ " meses");
		System.out.println(h/60480+ " anos");
	}
}