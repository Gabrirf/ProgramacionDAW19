import java.util.Arrays;

public class ArrayElementos {
	public static void main(String[] args) {
		int[] arrayEnteros =  {1,2,3,4,5,6,7,8,9,10}; //new int[10];
		System.out.println(Arrays.toString(arrayEnteros));
		arrayEnteros[5] = 100;
		System.out.println(Arrays.toString(arrayEnteros));
	}
}