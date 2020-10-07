import java.util.Arrays;

public class OrdenarArrayRT{
	public static void main(String[] args) {
		int[] numeros = {7,6,5,4,3,2,1};
		int aux=0;
		for (int i=0; i<numeros.length-1 ; i++ ) {
			for (int j=0; j<numeros.length-1-i ; j++ ) {
				if(numeros[j] > numeros[j+1]){
					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
				System.out.print("\r"+Arrays.toString(numeros));
				esperar(1000);
			}
			esperar(2000);	
		}
	}

	static void esperar(int ms){
		try{
			Thread.sleep(500);
		}catch(Exception e){
			System.out.println(e);
		}	
	}
}