package clases;

public class Joven extends Persona{

	public Joven(){
		this("Joven");
	}
	public Joven(String nombre){
		super(nombre);
		System.out.println("Constructor de Joven");
	}

	@Override
	public String toString(){
		return "Joven: "+ super.getNombre();
	}
}