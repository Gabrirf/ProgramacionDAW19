package clases;

public interface Vehiculo{
	void setTiempo();
	double factura();
	void aparca(Parking parking);
	boolean hayPlaza(Parking parking);
}