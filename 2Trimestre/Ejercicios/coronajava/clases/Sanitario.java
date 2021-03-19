package clases;

public class Sanitario extends Persona {

	String categoria;

	public Sanitario(String nombre, int edad, char sexo, String categoria){
		super(nombre, edad, sexo);
		this.categoria = categoria;
	}

	public Enfermedad diagnosticar(Persona persona){
		return null;
	}

	public boolean curar(Persona persona){
		return false;
	}

	public void saludar(Persona persona){
		System.out.println(this.nombre+" saluda a " + persona.getNombre());
	}

}