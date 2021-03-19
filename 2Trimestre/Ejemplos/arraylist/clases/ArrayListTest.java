package clases;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	
	public void start(){
		ArrayList aList = new ArrayList<Integer>();
		//System.out.println(aList.toString());
		//System.out.println(aList.size());
		for (int i=0; i<10 ; i++ ) {
			aList.add((int)Math.ceil(Math.random()*50));
		}
		System.out.println(aList.toString() + " | "+ aList.size());

		//aList.remove(10); // int --> index
		//aList.remove(new Integer("400")); // Object --> Buscar y borrar
		//System.out.println(aList.toString() + " | "+ aList.size());

		//System.out.println(aList.get( aList.size() - 1 )); // Accede al ultimo elemento del arraylist

		aList.sort(null); // Ordenar ascendente
		Collections.reverse(aList); // Le da la vuelta
		System.out.println(aList.toString());

		System.out.println(
			"Sacamos el elemento: " +
			aList.remove((int)Math.floor(Math.random()*aList.size()))
		);
		System.out.println(aList.toString());

		ArrayList aList2 = new ArrayList<Integer>(10);
		System.out.println(aList2.toString());
	}
}

class ComparadorInv implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n2.compareTo(n1);
    }
}
