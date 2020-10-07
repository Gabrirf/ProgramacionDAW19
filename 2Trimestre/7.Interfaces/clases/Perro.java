package clases;

import interfaces.*;

public class Perro implements Animal{
	String nombre;

	public Perro(){}
	public Perro(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void saludar(){
		System.out.println("Guau");
	}
	public void saludar(Animal gato){
		System.out.println("GUAU GUAU GUAU");
	}

	@Override
	public String toString(){
		return "Perro: "+ this.nombre;
	}

}