package clases;

public class Apartamento {
	final int PRECIO_M2 = 1000;
	final int PRECIO_HABITACION = 10000;
	final int PRECIO_BANIO = 25000;
	int dimension;
	int nHabitaciones;
	int nBanios;
	boolean ocupado;
	int planta;
	char letra;

	public Apartamento(){

	}
	
	public Apartamento(int dimension, int nHabitaciones, int nBanios, boolean ocupado, int planta, char letra){
		this.dimension = dimension;
		this.nHabitaciones = nHabitaciones;
		this.nBanios = nBanios;
		this.ocupado = ocupado;
		this.planta = planta;
		this.letra = letra;
	}

	public boolean comprar(){
		if(ocupado){
			return false;
		}
		ocupado = true;
		return true;
	}

 	public boolean isOcupado(){
 		return this.ocupado;
 	}

	public float precio(){
		return dimension*PRECIO_M2+nHabitaciones*PRECIO_HABITACION+nBanios*PRECIO_BANIO;
	}

	public void info(){
		System.out.println("\t- "+
			dimension+"m2\t"+
			nHabitaciones+"h  "+
			nBanios+"b"+
			"\t--> "+(int)precio()+" euros"
		);
	}

	public String toString(){
		return "[ "+dimension+", "+nHabitaciones+", "+nBanios+", "+ocupado+", "+planta+", "+letra+" ]";
	}
}