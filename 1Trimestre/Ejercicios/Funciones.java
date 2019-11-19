public class Funciones{
	public static void main(String[] args) {
		imprimeN(Integer.parseInt(args[0]));
	}

	public static void imprimeN(int n){
		for (int i=0; i<n ; i++ ) {
			System.out.println(n);
		}
	}
}