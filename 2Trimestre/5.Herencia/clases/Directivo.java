package clases;

public class Directivo extends Empleado{

	public Directivo(){
		this("Directivo");
	}
	public Directivo(String nombre){
		super(nombre);
	}

	@Override
	public String toString(){
		return super.toString() + " -> Directivo";
	}
}