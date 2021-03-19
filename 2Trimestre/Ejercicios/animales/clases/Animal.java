package clases;

abstract public class Animal {

	String name;

	public Animal(){}

	public Animal(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void saludar(){
		System.out.println("Ey, I'm an animal");
	}

	abstract public void greeting();
}