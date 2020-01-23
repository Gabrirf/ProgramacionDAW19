package clases;

public class Circulo extends Figura{
	double radio;

	public Circulo(){}
	public Circulo(String color, boolean relleno, double radio){
		super(color, relleno);
		this.radio = radio;
	}

	public double getRadio(){
		return this.radio;
	}
	public void setRadio(double radio){
		this.radio = radio;
	}

	public double area(){
		return Math.PI*radio*radio;
	}
	public double perimetro(){
		return 2*Math.PI*this.radio;
	}

	@Override
	public String toString(){
		return "[" +
			super.getColor() + ", " +
			super.isRelleno() + ", " +
			this.radio +
			"]";
	}
}