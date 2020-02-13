package clases;

public class Anciano extends Persona{

	public Anciano(){
		this("Anciano");
	}
	public Anciano(String nombre){
		super(nombre);
		System.out.println("Constructor de Anciano");
	}

	@Override
	public String toString(){
		return "Anciano: "+ super.getNombre();
	}
}