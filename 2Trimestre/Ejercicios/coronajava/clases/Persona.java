package clases;

public abstract class Persona {

	String nombre;
	int edad;
	char sexo;

	protected Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	protected abstract void saludar(Persona persona);

	public String toString(){
		return "["+nombre+", "+edad+", "+sexo+"]";
	}

}