package clases;

public class Dog extends Animal {

	public Dog(){
		super("doggie");
	}

	@Override
	public void greeting(){
		System.out.println("Guau");
	}
}