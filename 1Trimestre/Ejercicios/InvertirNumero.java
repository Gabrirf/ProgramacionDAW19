import java.util.Scanner;

public class InvertirNumero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero a invertir: ");
        int n = sc.nextInt();

        System.out.println(invertir(n));

        sc.close();
    }

    public static int invertir(int n){
        
		int aux, l = 0, cifra;
				
		aux = n;
				
		while (aux != 0) {
			cifra = aux % 10;
			l = l * 10 + cifra;
			aux = aux / 10;
        }
        
        return l;
    }

}