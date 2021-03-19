package clases.comidas;

public class Ingrediente {

	String nombre;
	double gramos;
	double calorias; // Por cada 100 gramos

	public Ingrediente(String nombre, String gramos, String calorias){
		this(nombre, Double.parseDouble(gramos), Double.parseDouble(calorias));
	}

	public Ingrediente(String nombre, double gramos, double calorias){
		this.nombre = nombre;
		this.gramos = gramos;
		this.calorias = calorias;
	}

	public String toString(){
		return "[ "+nombre+", "+gramos+", "+calorias+" ]";
	}

}