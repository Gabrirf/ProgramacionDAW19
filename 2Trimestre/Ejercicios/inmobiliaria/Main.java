import clases.*;
import utils.CP;
import java.util.Arrays;

public class Main{

	public static void main(String[] args) {
		Inmobiliaria inmobi;
		Edificio[] edificios = new Edificio[3];
		CP[] cps;
		Apartamento[] apartamentos = new Apartamento[10];

		// 41001 - 41989
		cps = new CP[20];
		for (int i=0; i < 20 ; i+=1 ) {
			cps[i] = new CP(i*50+41001, (float)(Math.random() * 0.4 + 0.8) );
		}

		//System.out.println(Arrays.toString(cps));
		inmobi = new Inmobiliaria(edificios, cps);

		/******/
		Edificio e = new Edificio(4, 16, 41011);
		e.info();



	}
}