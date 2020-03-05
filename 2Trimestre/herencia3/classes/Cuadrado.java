package classes;
public class Cuadrado extends Rectangulo {

    public Cuadrado() {
        super();
    }

    public Cuadrado(int lado){
        super(lado, lado);
    }

    public Cuadrado(String color, boolean relleno) {
        super(color, relleno);        
    }

    public Cuadrado(String color, boolean relleno, int lado) {
        super(color, relleno, lado, lado);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}