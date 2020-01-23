package clases;

public class Adulto extends Persona{

	public Adulto(){}
	public Adulto(String nombre){
		super(nombre);
	}

	public void saludar(){
		System.out.println("Soy "+super.getNombre()+" y soy un Adulto");
	}

	@Override
	public String toString(){
		return super.toString() + " -> Adulto";
	}
}