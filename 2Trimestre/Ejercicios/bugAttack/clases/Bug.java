package clases;

public abstract class Bug {

	String name;
	int health;
	int power;

	public Bug(String name, int health, int power){
		this.name = name;
		this.health = health;
		this.power = power;
	}

	public String getName(){
		return this.name;
	}

	public int getHealth(){
		return this.health;
	}

	public void takeDamage(int power){
		this.health -= power; 
	}

	public abstract void attack(Bug bug);

}