package clases;

public class Operario extends Empleado{

	public Operario(){
		this("Operario");
	}
	public Operario(String nombre){
		super(nombre);
	}

	@Override
	public String toString(){
		return super.toString() + " -> Operario";
	}
}