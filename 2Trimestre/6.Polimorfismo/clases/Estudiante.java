package clases;

public class Joven extends Persona{

	public Joven(){}
	public Joven(String nombre){
		super(nombre);
	}

	public void saludar(){
		System.out.println("Soy "+super.getNombre()+" y soy un Estudiante");
	}

	@Override
	public String toString(){
		return "Joven: "+ super.getNombre();
	}
}