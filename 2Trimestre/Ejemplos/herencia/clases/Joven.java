package clases;

public class Joven extends Persona {

	String instituto;

	public Joven(){

	}

	public Joven(String nombre, int edad, double altura){
		this(nombre, edad, altura, "ADAITS");
	}

	public Joven(String nombre, int edad, double altura, String instituto){
		super(nombre, edad, altura);
		this.instituto = instituto;
	}

	public void saludar(){
		System.out.println("Eyyy, soy " + nombre +" y estudio en "+instituto);
	}

	public String toString(){
		return super.toString()+", "+instituto;
	}





}