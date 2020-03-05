import java.util.Arrays;

import Clases.Agenda;
import Clases.Contacto;

public class App {
    public static void main(String[] args) {
        
        Clases.Contacto contacto = new Contacto();
        Clases.Agenda agenda = new Agenda();

        int cantidadP = agenda.cantidad;


        System.out.println(contacto.toString());
    }

    public static void imprimir(String[][] agenda, int cantidadP) {
        for (int i = 0; i<cantidadP; i++) {
            System.out.println(Arrays.toString(agenda[i]));
        }
    }
}

