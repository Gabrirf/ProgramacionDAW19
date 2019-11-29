import java.util.Arrays;

public class ArrayBidimensional{
	public static void main(String[] args) {
		int n = 5;
		String[][] array = new String[n][n];
		for (int row = 0; row < n ; row++ ) {
			for (int column = 0; column < n ; column++) {
				array[row][column] = row + "." + column;
			}
		}
		for (int i=0; i<n; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}
}