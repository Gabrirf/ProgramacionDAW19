package clases;

public class Rectangulo{
	int alto;
	int ancho;

	public Rectangulo(){
		System.out.println("Constructor vacio");
		this(10,10);
	}
	public Rectangulo(int alto, int ancho){
		System.out.println(this.toString());
		this.alto = alto;
		System.out.println(this.toString());
		this.ancho = ancho;
		System.out.println(this.toString());
	}

	public void setAlto(int alto){
		this.alto = alto;
	}

	public int calcularArea(){
		return alto*ancho;
	}

	public int calcularPerimetro(){
		return 2*(alto+ancho);
	}

	public void dibujar(){
		for (int i=0;i<alto;i++ ) {
			for (int j=0;j<ancho;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public void dibujar(char c){
		for (int i=0;i<alto;i++ ) {
			for (int j=0;j<ancho;j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public String toString(){
		return "[ "+this.alto+", "+this.ancho+" ]";
	}

	public void queHaceThis(int alto){
		System.out.println("  alto    = "+alto);
		System.out.println("this.alto = "+this.alto);
	}
}















