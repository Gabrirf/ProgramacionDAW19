package clases;

public class Oficial extends Operario{

	public Oficial(){
		this("Oficial");
	}
	public Oficial(String nombre){
		super(nombre);
	}

	@Override
	public String toString(){
		return super.toString() + " -> Oficial";
	}
}