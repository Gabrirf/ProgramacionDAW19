import java.util.Scanner;

public class cuentaAtras{
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n;

		System.out.print("Introduce un numero: ");
			n=sc.nextInt();

		while(n!=0 && n>0){
			n--;//n=n-1
			System.out.println(n);
		}

		if(n<0){
			System.out.println("Escribe un numero positivo ;)");
		}else{
		System.out.println("BOOM");
		}
	}
}