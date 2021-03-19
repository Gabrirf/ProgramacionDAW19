package clases;

public class Adulto extends Persona {

	String empresa;

	public Adulto(){

	}

	public Adulto(String nombre, int edad, double altura){
		this(nombre, edad, altura, "Deloitte");
	}

	public Adulto(String nombre, int edad, double altura, String empresa){
		super(nombre, edad, altura);
		this.empresa = empresa;
	}

	public void saludar(){
		System.out.println("Hola, soy " + nombre +" y trabajo en "+empresa);
	}

	public String toString(){
		return super.toString()+", "+empresa;
	}



}