public class ImprimirArrayAlterno {
	public static void main(String[] args) {
		
		int[] a1 = {1,2,3,4,5,6,7,8,9,10};
		int[] a2 = {10,20,30,40,50};
		int[] nuevoArray = new int[a1.length + a2.length];

		int[] arMenor, arMayor;

		if(a1.length > a2.length){
			arMayor = a1;
			arMenor = a2;
		}else{
			arMayor = a2;
			arMenor = a1;
		}

		/* Rellenar el nuevo array*/
		for (int i=0; i<arMenor.length; i++ ) {
			nuevoArray[i*2] = a1[i];
			nuevoArray[i*2+1] = a2[i];	
		}
		for (int i=arMenor.length; i<arMayor.length; i++ ) {
			nuevoArray[arMenor.length + i] = arMayor[i];
		}

		/* Imprimir el array */
		for (int i=0; i<nuevoArray.length ; i++ ) {
			System.out.print(nuevoArray[i]+"-");
		}
		System.out.println();
	}
}