package clases;

import interfaces.*;

public class Gato implements Animal{
	String nombre;

	public Gato(){}
	public Gato(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void saludar(){
		System.out.println("Miau");
	}

	@Override
	public String toString(){
		return "Gato: "+ this.nombre;
	}

}