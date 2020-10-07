package clases;

public class Coche implements Vehiculo{

	int tiempo; // en minutos

	public Coche(){}
	public Coche(int tiempo){
		this.tiempo = tiempo;
	}

	public void setTiempo(){
		this.tiempo = tiempo;
	}
	public double factura(){
		return this.tiempo*0.1;
	}
	public void aparca(Parking parking){
	}
	public boolean hayPlaza(Parking parking){
		return parking.hayPlaza();
	}
}