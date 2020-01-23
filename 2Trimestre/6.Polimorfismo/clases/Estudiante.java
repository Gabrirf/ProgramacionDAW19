package clases;

public class Estudiante extends Persona{

	public Estudiante(){}
	public Estudiante(String nombre){
		super(nombre);
	}

	public void saludar(){
		System.out.println("Soy "+super.getNombre()+" y soy un Estudiante");
	}

	@Override
	public String toString(){
		return "Estudiante: "+ super.getNombre();
	}
}