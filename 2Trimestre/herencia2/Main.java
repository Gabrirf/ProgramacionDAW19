import classes.*;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("EEEE");
        Directivo d1 = new Directivo("DDD");
        Operario o1 = new Operario("OOO");
        Oficial oo1 = new Oficial("OOOF");
        Tecnico t1 = new Tecnico("TTTT");

        System.out.println(e1.toString());
        System.out.println(d1.toString());
        System.out.println(o1.toString());
        System.out.println(oo1.toString());
        System.out.println(t1.toString());
    }
}