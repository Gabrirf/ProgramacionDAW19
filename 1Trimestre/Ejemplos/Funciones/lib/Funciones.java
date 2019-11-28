package lib;

public class Funciones{
	public static void holaMundo(){
		System.out.println("Hola Mundo !");
	}

	public static int duplicar(int n){
		return n*2;
	}

	public static int max(int a, int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	public static int min(int a, int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}

	public static int max(int[] array){
		int max = array[0];
		for (int i=1;i<array.length ;i++ ) {
			if(array[i] > max){
				max = array[i];
			}
		}
		return max;
	}

	public static int min(int[] array){
		int min = array[0];
		for (int i=1;i<array.length ;i++ ) {
			if(array[i] < min){
				min = array[i];
			}
		}
		return min;
	}
}