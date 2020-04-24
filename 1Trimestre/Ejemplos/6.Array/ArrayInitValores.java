import java.util.Arrays;

public class ArrayInitValores {
	public static void main(String[] args) {
		int[] arrayEnteros = {0,1,2,3,4,5,6,7,8,9};
		String[] arrayTexto = {null, "null", "",  "Hola", ":)"};

		String texto = Arrays.toString(arrayEnteros);
		System.out.println(Arrays.toString(arrayEnteros));
		System.out.println(texto);
	}
}