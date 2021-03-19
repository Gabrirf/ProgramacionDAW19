package clases;

public class Persona {
	String nombre; // public / null / protected / private 
	int edad;
	double altura;

	public Persona(){

	}

	public Persona(String nombre, int edad, double altura){
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public void saludar(){
		System.out.println("Hola, soy "+nombre);
	}

	public String toString(){
		return nombre+", "+edad+", "+altura;
	}

}