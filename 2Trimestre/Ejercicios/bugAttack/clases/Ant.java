package clases;

public class Ant extends Bug {

	public Ant(String name){
		super(name, 100, 30);
	}

	public void attack(Bug enemy){
		System.out.println(this.name + " ataca a " + enemy.getName());
		enemy.takeDamage(this.power);
	}

	@Override
	public void takeDamage(int power){
		int reducedPower = power;
		if(this.health > 1 && power >= this.health){
			reducedPower = health-1;
		}
		super.takeDamage(reducedPower);
	}

}