public class InvertirArgs{
	public static void main(String[] args) {
		int numArgs = args.length; // numero de parametros de Args
		for (int i=numArgs-1; i>=0;i--) {
			int numLetras = args[i].length(); // Numero de letras del String
			for (int j=numLetras-1; j>=0; j--) {
				char letra = args[i].charAt(j);
				System.out.print(letra);
			}
			System.out.print(" ");
		}
	}
}