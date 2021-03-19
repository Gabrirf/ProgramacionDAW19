/*import clases.personas.Cliente;
import clases.personas.Camarero;
import clases.personas.Chef;
import clases.personas.Pinche;
import clases.comidas.Comida;
import clases.comidas.Receta;*/
import clases.comidas.Ingrediente;
import utils.Variables;

public class Main {
	public static void main(String[] args) {
		int randomIndex = (int)Math.floor(Math.random()*Variables.ingredientes.length-1);
		Ingrediente ing = Variables.ingredientes[randomIndex];
		System.out.println(ing);
	}
}