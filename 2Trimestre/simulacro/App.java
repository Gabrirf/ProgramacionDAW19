import java.util.ArrayList;

import classes.*;
import interfaces.*;

public class App {
    public static void main(String[] args) {


        Ninio ninio1 = new Ninio("Alberto", 12, 'M', new ArrayList<Enfermedad>());
        Adulto adulto1 = new Adulto("Carla", 26, 'F', new ArrayList<Enfermedad>());
        Anciano anciano1 = new Anciano("Fernando", 68, 'M', new ArrayList<Enfermedad>());

        Gripe gripe = new Gripe();
        Coronavirus corona = new Coronavirus();
        Resfriado resfriado = new Resfriado();

        gripe.contagiar(ninio1);
        gripe.contagiar(ninio1);
        corona.contagiar(adulto1);
        resfriado.contagiar(anciano1);

        System.out.println(ninio1.toString());
        System.out.println(adulto1.toString());
        System.out.println(anciano1.toString());

        ninio1.saludar(anciano1);

        System.out.println(anciano1.toString());
    }
}