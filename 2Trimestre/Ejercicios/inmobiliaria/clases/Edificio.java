package clases;

import java.util.Arrays;

public class Edificio{
	int nPlantas;
	int nAptos;
	Apartamento[] apartamentos;
	int cp;

	public Edificio(){

	}

	public Edificio(int nPlantas, int nAptos, int cp){
		this(nPlantas, nAptos, new Apartamento[nAptos], cp);
		for (int i=0; i < nAptos ; i+=1 ) {
			int d = (int)Math.floor(Math.random()*41+80);
			int nH = (int)Math.ceil(Math.random()*5);
			int nB = (int)Math.ceil(Math.random()*3);
			boolean o = Math.random() > 0.5 ? true : false;
			int p = (int)Math.floor(Math.random()*nPlantas);
			char l = (char)(Math.floor(Math.random()*4)+'A');
			apartamentos[i] = new Apartamento(d, nH, nB, o, p, l);
		}
	}

	public Edificio(int nPlantas, int nAptos, Apartamento[] apartamentos, int cp){
		this.nPlantas = nPlantas;
		this.nAptos = nAptos;
		this.apartamentos = apartamentos;
		this.cp = cp;
	}

	public void info(){
		System.out.println("El edificio en "+cp+" cuenta con "+
			nAptos+" apartamentos distribuidos en "+nPlantas+" plantas:"
		);
		for (int i=0; i<apartamentos.length ; i+=1 ) {
			if(!apartamentos[i].isOcupado()){
				apartamentos[i].info();
			}
		}

	}

	public String toString(){
		return "[ "+nPlantas+", "+nAptos+", "+Arrays.toString(apartamentos)+", "+cp+" ]";
	}
}