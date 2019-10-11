import java.util.Scanner;

public class suspenso{
	public static void main(String[] args){
		Scanner cutino = new Scanner(System.in);
	
		float nota = 0;
		
		System.out.println("Damee tu nota broo: ");
		nota = cutino.nextFloat();
		
		if(nota == (float)4.9){
			System.out.println("\nTe apruebo por lo desgraciado que eres");
		}else if(nota == 1){
			System.out.println("\nNo sirves ni para beber agua");
		}else if(nota == 0){
			System.out.println("\nMejor vete de aqui antes de eche de una patada en el pecho");
		}else if(nota < 5){
			System.out.println("\nF en el chat");
		}else if(nota == 5){
			System.out.println("\nPor poco ehhhh");
		}else if(nota < 6){
			System.out.println("\nNi tan mal");
		}else if(nota < 7){
			System.out.println("\nNo esta mal para ser tu");
		}else if(nota < 8){
			System.out.println("\nillo peaso nota");
		}else if(nota < 9){
			System.out.println("\nTodavia se puede mejorar");
		}else if(nota < 10){
			System.out.println("\nEres una puta bestia");
		}else if(nota == 10){
			System.out.println("\nEstas mamadisimo");
		}else if(nota > 10){
			System.out.println("\nEres un puto mastodonte, nadie a sacado esta nota nunca");
		}	
	}
}