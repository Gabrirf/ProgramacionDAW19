package classes;

public class Circulo extends Figura {
    int radio;

    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(int radio) {
        super();
        this.radio = radio;
    }

    public Circulo(String color, boolean relleno) {
        super();
        this.radio = 0;
    }

    public Circulo(String color, boolean relleno, int radio) {
        super(color, relleno);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() +" | Radio: "+this.radio;
    }

    //AREA

    public double calcularAreaCirculo(int radio) {
        return (Math.PI * radio * radio);
    }
}
