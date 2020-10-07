import clases.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
	public static void main(String[] args) {
		/*Parking parking1 = new Parking(100, 50);
		Parking parking2 = new Parking(100, 0);

		Coche coche = new Coche(0);

		System.out.println(coche.hayPlaza(parking1));
		System.out.println(coche.hayPlaza(parking2));*/

		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i <10 ;i++ ) {
			aList.add(new Coche());
		}

		// For + i
		for (int i = 0; i < aList.size() ;i++ ) {
			System.out.print(aList.get(i)+" - ");
		}
		// ForEach
		for (int element : aList) {
			System.out.println(element);
		}

		// Iterator
		Iterator iter = aList.iterator();
		while(iter.hasNext()){
			System.out.print( iter.next() );
			if(iter.hasNext()){
				System.out.print(", ");
			}
		}
	}
}