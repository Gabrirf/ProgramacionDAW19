package clases;

public class Persona{
	String nombre;

	public Persona(){
		this("Lolito");
	}
	public Persona(String nombre){
		this.nombre = nombre;
		System.out.println("Constructor de Persona");
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString(){
		return "Persona: "+ nombre;
	}

}