package clases;

import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NumberFormatException;
import java.lang.NullPointerException;

public class TryCatch {
	
	public static void indexException(){
		try {
			int[] numberList = {1,2,3,4,5,6,7};
			System.out.println(numberList[10]);
			System.out.println("Nunca se va a ejecutar");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No pasa na, ta to controlao");
			System.out.println("Error: "+ e);
		}
	}

	public static void parseException(){
		try{
			String text = "asdf";
			int number = Integer.parseInt(text);
			System.out.println(number);
		}catch(NumberFormatException e){
			System.out.println("No pasa na, ta to controlao");
			System.out.println("Error: "+ e);
		}
	}

	public static void nullException(){
		try{
			String text = null;
			System.out.println(text.length());
		}catch(NullPointerException e){
			System.out.println("No pasa na, ta to controlao");
			System.out.print("Error: ");
			e.printStackTrace();
		}
	}

	public static void mixException(){
		try{
			String[] textList = {"1", "2", "3"};
			for (int i=0; i<textList.length+1 ; i+=1 ) {
				System.out.println(Integer.parseInt(textList[i]));			
			}
		} catch(NumberFormatException e){
			System.out.println("Error de conversion");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error de indice");
		} catch(NullPointerException e){
			System.out.println("Error de null");
		} catch(Exception e){
			System.out.println("Error generico");
		}
	}
}