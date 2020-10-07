import java.util.Scanner;

public class PotenciaBucleVidasMensaje{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int vidas = 5;
		System.out.print("Introduzca un numero ('0' para salir): ");
		n = sc.nextInt();
		while(n != 0 && vidas > 0){
			System.out.println("La potencia de "+n+" es "+n*n);
		
			System.out.print("Introduzca un numero: ");
			n = sc.nextInt();
			vidas--;
		}
		if(vidas <= 0){
			System.out.println("Ya está pesao!");
		}else{
			System.out.println("Has salido porque has querido");
		}
	}
}