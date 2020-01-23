package clases;

abstract public class Persona{
	String nombre;

	public Persona(){}
	public Persona(String nombre){
		this.nombre = nombre;
	}

	abstract public void saludar();

	public void despedir(){
		System.out.println("ADIOS");
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