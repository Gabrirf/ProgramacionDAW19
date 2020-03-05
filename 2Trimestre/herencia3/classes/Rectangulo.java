package classes;

public class Rectangulo extends Figura {
    int base;
    int altura;

    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(int base, int altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, boolean relleno) {
        super(color, relleno);
        this.base = 0;
        this.altura = 0;
        
    }

    public Rectangulo(String color, boolean relleno, int base, int altura) {
        super(color, relleno);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        if(this.base == this.altura) {
            return super.toString() +" | Lado: "+this.base;
        }else {
            return super.toString() +" | Base: "+this.base+" | Altura: "+this.altura;
        }
    }

    //AREA
    public double calcularAreaRectangulo(int base, int altura) {
        return base*altura;
    }
}


