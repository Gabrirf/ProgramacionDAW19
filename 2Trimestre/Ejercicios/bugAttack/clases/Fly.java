package clases;

public class Fly extends Bug implements Flyer {

	public Fly(String name){
		super(name, 100, 20);
	}

	public void attack(Bug enemy){
		System.out.println(this.name + " ataca a " + enemy.getName());
		enemy.takeDamage(this.power);
		this.power *= 2;
	}

	public void toFly(){
		System.out.println("I'm flying");
	}
}