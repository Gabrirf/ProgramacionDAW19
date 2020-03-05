import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {

        lanzaExcepcion();

        System.out.println("Sigue");

        System.out.println("Escribe un numero:");
        int num = entero();

        System.out.println("El entero es: "+num);
    }



    public static String texto(){
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}

	public static String texto(String info){
		System.out.print(info);
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		return texto;
	}

	public static int entero(){
		int numero;
		try{
			numero = Integer.parseInt(texto());
		}catch(Exception e){
			numero = entero("Introduzca un numero valido: ");
		}
		return numero;
	}

	public static int entero(String info){
		int n;
		try{
			n = Integer.parseInt(texto(info));
		}catch(Exception e){
			n = entero("Introduzca un numero valido: ");
		}
		return n;
	}

    public static void lanzaExcepcion() throws InputMismatchException {
        System.out.println("Se rompio");
    }
}