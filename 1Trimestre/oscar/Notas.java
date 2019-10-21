import java.util.Scanner;

public class Notas{
	public static void main(String[] args) {

		double nota = 0;

		Scanner notas = new Scanner(System.in);
			System.out.println("Introduce nota");
				nota = notas.nextDouble();


				if (nota < 5){
					System.out.println("Suspenso");
				}else if (nota < 6){
					System.out.println("Aprobado");
				}else if (nota < 7){
					System.out.println("Bien");
				}else if (nota < 9){
					System.out.println("Notable");
				}else if (nota < 10){
					System.out.println("Sobresaliente");
				}else if (nota == 10){
					System.out.println("MAT.HONOR");
				}else if (nota > 10 && nota != 123){
					System.out.println("Nota no valida");
					System.out.println("Introduzca valor entre 1 y 10");
				}else if (nota == 123){
					System.out.println("HOLAAA PEDROOOO");
				}
			}
		
		}
