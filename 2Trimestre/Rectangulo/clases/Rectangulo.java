package clases;

public class Rectangulo {
    int ancho;
    int altura;

    //Constructor
    public Rectangulo(int ancho, int altura) {
        this.ancho = ancho;
        this.altura = altura;

    }

    public int calcularArea () {
        return this.altura * this.ancho;
    }

    public int calcularPerimetro () {
        return (this.altura + this.ancho)*2;
    }

    public void dibujar() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.ancho; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}