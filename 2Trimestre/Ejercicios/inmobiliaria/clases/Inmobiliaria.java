package clases;

import utils.CP;

public class Inmobiliaria {
	Edificio[] edificios;
	CP[] cps;

	public Inmobiliaria(){

	}

	public Inmobiliaria(Edificio[] edificio, CP[] cps){
		this.edificios = edificios;
		this.cps = cps;
	}

	public void listarAptos(){

	}

	public void listarAptos(Edificio edificio){
		
	}

	public boolean comprarApto(Edificio edificio, int idApartamento){
		return true;
	}

	public float verPrecioApto(Edificio edificio, int idApartamento){
		return 0f;
	}

	public float verPrecioMedio(){
		return 0f;
	}
	public float verPrecioMedio(Edificio edificio){
		return 0f;
	}
	public float verPrecioMedio(CP cp){
		return 0f;
	}

	public String toString(){
		return "[ "+edificios+", "+cps+" ]";
	}
}