import java.util.Arrays;

public class FusionarArrays{
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2 = {10,20,30,40,50,60,70,80,90,100};
		int[] arrayFusion = new int[array1.length+array2.length];

		for (int i = 0; i < array1.length ; i++ ) {
			arrayFusion[2*i] = array1[i];
			arrayFusion[(2*i)+1] = array2[i];
		}
		for (int i = array1.length; i < array2.length ; i++ ) {
			System.out.println(i +" "+ array2[i]);
			arrayFusion[i+array1.length] = array2[i];
		}

		System.out.println(Arrays.toString(arrayFusion));
	}
}