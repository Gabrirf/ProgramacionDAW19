package clases;

public class Nino extends Persona{

	public Nino(){}
	public Nino(String nombre){
		super(nombre);
	}

	public void saludar(){
		System.out.println("Soy "+super.getNombre()+" y soy un Nino");
	}

	@Override
	public void despedir(){
		System.out.println("adeu");
	}

	@Override
	public String toString(){
		return "Nino: "+ super.getNombre();
	}
}