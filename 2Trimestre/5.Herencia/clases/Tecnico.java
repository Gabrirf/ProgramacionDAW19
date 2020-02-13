package clases;

public class Tecnico extends Operario{

	public Tecnico(){
		this("Tecnico");
	}
	public Tecnico(String nombre){
		super(nombre);
	}

	@Override
	public String toString(){
		return super.toString() + " -> Tecnico";
	}
}