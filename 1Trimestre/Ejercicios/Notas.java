public class Notas{
	public static void main(String[] args) {
		int nota = 7; // Valor estático

		if (nota >= 0 && nota < 5) {
			System.out.println("Lo siento, has suspendido");
		}else if(nota == 5){
			System.out.println("Has aprobado");
		}else if(nota == 6){
			System.out.println("Bien");
		}else if(nota >= 7 && nota <= 8){ // (nota == 7 || nota ==8)
			System.out.println("Notable");
		}else if(nota == 9){
			System.out.println("Sobresaliente");
		}else if(nota == 10){
			System.out.println("Mat. honor");
		}else{
			System.out.println("Introduzca una nota válida");
		}

	}
}