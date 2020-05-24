public class FuncionRecursiva{
	public static void main(String[] args) {
		//imprimirNumeroR(1);
		System.out.println(sumarACero(4));
	}

	public static void imprimirNumeroR(int n){
		if(n < 10){
			imprimirNumeroR(n+1);
		}
		System.out.println(n);
	}

	public static int sumarACero(int n){
		int suma=n;
		if (n > 0) {	
			suma = suma + sumarACero(n-1);
		}
		return suma;
	}

}