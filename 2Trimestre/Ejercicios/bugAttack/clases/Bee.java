package clases;

public class Bee extends Bug implements Flyer {

	int cont;

	public Bee(String name){
		super(name, 100, 50);
		this.cont = 0;
	}

	public void attack(Bug enemy){
		System.out.println(this.name + " ataca a " + enemy.getName());
		enemy.takeDamage(this.power);
		this.cont++;
		this.health = cont >= 3 ? 0 : this.health;
	}

	public void toFly(){
		System.out.println("I'm flying");
	}

}