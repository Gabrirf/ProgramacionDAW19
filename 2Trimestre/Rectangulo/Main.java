import clases.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(20, 5);

        System.out.println(r1.calcularArea());

        System.out.println(r1.calcularPerimetro());

        r1.dibujar();
    }
}