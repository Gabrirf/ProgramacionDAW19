package clases;

public class Empleado{
	String nombre;

	public Empleado(){
		this("Lolito");
	}
	public Empleado(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	@Override
	public String toString(){
		return "Empleado: "+ nombre;
	}

}