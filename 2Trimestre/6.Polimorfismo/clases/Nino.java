package clases;

public class Anciano extends Persona{

	public Anciano(){}
	public Anciano(String nombre){
		super(nombre);
	}

	public void saludar(){
		System.out.println("Soy "+super.getNombre()+" y soy un Nino");
	}

	@Override
	public String toString(){
		return "Anciano: "+ super.getNombre();
	}
}