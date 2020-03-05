import classes.*;

public class Main {
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo("Rojo", true, 2);
        System.out.println(c1.toString());

        Rectangulo r1 = new Rectangulo("Rojo", true, 3, 2);
        System.out.println(r1.toString());

        Cuadrado cu1 = new Cuadrado("Rojo", true, 2);
        System.out.println(cu1.toString());

    }
}