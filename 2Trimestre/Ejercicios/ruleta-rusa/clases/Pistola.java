package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Pistola {
	ArrayList<Bala> tambor;

	public Pistola(){
		this(6);
	}

	public Pistola(int capacidad){
		this.tambor = initTambor(capacidad);
	}

	public ArrayList<Bala> initTambor(int n){
		ArrayList<Bala> tambor = new ArrayList<Bala>();
		for (int i=0; i<n ; i++ ) {
			tambor.add( null );
		}
		return tambor;
	}

	public void recargar(Bala bala){
		tambor.set(0, bala);
	}

	public void girarTambor(){
		Collections.rotate(tambor, (int)(Math.random()*100));
	}

	public boolean disparar(){
		Bala bala = tambor.set(0, null);
		Collections.rotate(tambor, 1);
		return bala != null;
	}

	public String verEstado(){
		return tambor.toString();
	}
}