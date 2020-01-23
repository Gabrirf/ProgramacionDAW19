package clases;

abstract public class Figura{
	String color;
	boolean relleno;

	public Figura(){}
	public Figura(String color, boolean relleno){
		this.color = color;
		this.relleno = relleno;
	}

	abstract double area();
	abstract double perimetro();

	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isRelleno(){
		return this.relleno;
	}
	public void setRelleno(boolean relleno){
		this.relleno = relleno;
	}

	@Override
	public String toString(){
		return "["+color+", "+relleno+"]";
	}
}