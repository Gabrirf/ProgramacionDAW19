import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

			float nota = 0;
				System.out.println("Pon la nota:");
				nota = entrada.nextFloat();
				if(nota >= 0 && nota < 5) {
				System.out.println("Suspenso");
				} else if(nota >= 5 && nota < 7) {
				System.out.println("Bien");
				} else if(nota >= 7 && nota < 9) {
				System.out.println("Notable");
				} else if(nota >= 9 && nota <= 10) {
				System.out.println("Mastodonte");
				} else {
				System.out.println("Eso no va hulio");
					}
	}
}