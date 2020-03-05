package classes;

public class Figura {
    String color;
    boolean relleno;

    public Figura(){
        this("none", false);
    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isRelleno() {
        return this.relleno;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Color: "+color+" | Relleno: "+relleno;
    }
}