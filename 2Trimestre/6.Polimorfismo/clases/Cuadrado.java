package clases;

public class Cuadrado extends Rectangulo{

	public Cuadrado(){}
	public Cuadrado(String color, boolean relleno, double lado){
		super(color, relleno, lado, lado);
	}

	@Override
	public String toString(){
		return "[" +
			super.getColor() + ", " +
			super.isRelleno() + ", " +
			super.getAlto()+"x"+super.getAncho() +
			"]";
	}
}