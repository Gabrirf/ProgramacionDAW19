package clases;

public class Rectangulo extends Figura{
	double alto;
	double ancho;

	public Rectangulo(){}
	public Rectangulo(String color, boolean relleno, double alto, double ancho){
		super(color, relleno);
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto(){
		return this.alto;
	}
	public void setAlto(double alto){
		this.alto = alto;
	}
	public double getAncho(){
		return this.ancho;
	}
	public void setAncho(double ancho){
		this.ancho = ancho;
	}

	public double area(){
		return alto*ancho;
	}
	public double perimetro(){
		return 2*(alto+ancho);
	}

	@Override
	public String toString(){
		return "[" +
			super.getColor() + ", " +
			super.isRelleno() + ", " +
			this.alto + ", " +
			this.ancho +
			"]";
	}
}