package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachTest {

	public void start(){
		ArrayList aList = new ArrayList<Integer>();
		for (int i=0; i<10 ; i++ ) {
			aList.add((int)Math.ceil(Math.random()*50));
		}
		System.out.println(aList.toString());

		/* Recorrer elementos */
		for (int i=0; i<aList.size() ; i++ ) {
			System.out.println(aList.get(i));
		}

		/* For each */
		for(Object item : aList){
			System.out.println(item);
		}

		/* Iterator */
		Iterator iter = aList.iterator();
		while(iter.hasNext()){
			Integer item = (Integer)iter.next(); // iter.previous()
			System.out.println(item);
		}


	}

}