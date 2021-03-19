import clases.Animal;
import clases.Dog;
import clases.Cat;
import clases.BigDog;

public class Main {
	public static void main(String[] args) {
		//Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal bigdog = new BigDog();

		Animal[] animales = {dog, cat, bigdog};

		int randomIndex = (int)Math.floor(Math.random()*animales.length);
		Animal randomAnimal = animales[randomIndex];
		String stringClass = randomAnimal.getClass().toString();
		String[] splittedString = stringClass.split("\\.");
		String className = splittedString[splittedString.length-1];
		System.out.println(className);
		randomAnimal.greeting();
	}
}