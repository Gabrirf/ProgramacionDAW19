public class Argumentos{
	public static void main(String[] args) {
		int entero;
		double real;
		String texto;
		if(args.length < 3){
			System.out.println("Inserte 3 argumentos: entero real texto");
			System.out.println("\n\tEj: java Argumentos 7 3.14 Hola");
		}else{
			entero = Integer.parseInt(args[0]);
			real = Double.parseDouble(args[1]);
			texto = args[2];

			System.out.println("Primer argumento: "+entero);
			System.out.println("Segundo argumento: "+real);
			System.out.println("Tercer argumento: "+texto);
		}
	}
}