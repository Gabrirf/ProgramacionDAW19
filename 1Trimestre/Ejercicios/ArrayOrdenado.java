public class ArrayOrdenado{
	public static void main(String[] args) {
		int[] arrayCreciente = {1,2,3,4,5,6};
		int[] arrayDecreciente = {5,4,3,2,1};
		int[] arrayDesordenado = {4,3,6,2,8,4,3,2,1,1,1};
		int[] array = arrayDesordenado;
		boolean creciente = true;
		boolean decreciente = true;

		for (int i=0; i<array.length-1 ;i++ ) {
			if (array[i] < array[i+1]) {
				decreciente = false;
			}else{
				creciente = false;
			}
		}

		if (creciente) {
			System.out.println("Es creciente: " +creciente);
		}else if(decreciente){
			System.out.println("Es decreciente: " +decreciente);
		}else if(!(creciente || decreciente)){
			System.out.println("Desordenado es");
		}
	}
}






