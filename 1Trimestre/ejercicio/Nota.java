import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		
		double nota = 0; //he introducido una variable que se llama nota, y en vez de ponerle int que es un numero entero le he puesto double ya que es un numero dicimal

		Scanner notas = new Scanner(System.in);
		System.out.println("introduce una nota");
		nota = notas.nextDouble();


		if(nota<5){
			System.out.println("suspenso");
		}else if(nota<6)
			System.out.println("sufieciente");
		else if(nota<7)
			System.out.println("bien");
		else if(nota<9)
			System.out.println("notable");
		else if(nota<10)
			System.out.println("sobresaliente");
		else if(nota == 10)
			System.out.println("matricula");	
			
			}
		}


/*public class notas{
	public static void main(String[] args) {
		int nota = 4;

		if (nota >= 0 && nota < 5) {
			System.out.println("lo siento, has suspendido");
		}else if(nota == 5){
			System.out.println("has aprobado");
		}else if(nota == 6){
			System.out.println("bien");
		}else if(nota >= 7 && nota <= 8){	//(nota == 7 || nota == 8)
						.
						.
						.
		}
	}
} este es el ejemplo de GABI*/
		
