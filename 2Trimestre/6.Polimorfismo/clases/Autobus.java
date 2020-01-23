package clases;

public class Autobus extends Vehiculo{

	public Autobus(){}
	public Autobus(Persona[] personas){
		super(personas);
	}

	public void arrancar(){
		System.out.println("run run ...");
	}

	@Override
	public String toString(){
		return super.toString();
	}
}