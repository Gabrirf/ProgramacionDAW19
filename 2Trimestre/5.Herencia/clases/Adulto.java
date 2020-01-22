package clases;

public class Adulto extends Persona{

	public Adulto(){
		this("Adulto");
	}
	public Adulto(String nombre){
		super(nombre);
		System.out.println("Constructor de Adulto");
	}

	@Override
	public String toString(){
		return super.toString() + " -> Adulto";
	}
}