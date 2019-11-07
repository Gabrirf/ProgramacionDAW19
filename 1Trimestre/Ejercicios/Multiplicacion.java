public class multiplicacion{
	public static void main(String[] args){
		int n1, n2, producto;
		scanner teclado = new scanner(System.in);
		System.out.print( "introducir primer numero: ");
			n1= teclado.nextint();
		System.out.print( "introducir segundo numero: ");
			n2= teclado.nextint();
		producto= multiplicar(n1, n2);
		 System.out.printf("La multiplicación es: %d", producto);
    }

    private static int multiplicar(int x, int y){
        return x * y;
    }
}