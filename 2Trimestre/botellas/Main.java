import java.util.ArrayList;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Botella b1 = new Botella("Red Label", 750, 40, 5);

        int cantidad = b1.getCapacidad();

        System.out.println(b1.toString());

        System.out.println(b1.servirCopa(cantidad));
        System.out.println(b1.vaciar(cantidad));
        System.out.println(b1.llenar(cantidad));

        // Utilizando Array Lists

        ArrayList<String> lista1 = new ArrayList<String>();

        lista1.add("Mario");
        lista1.clear();
    }
}