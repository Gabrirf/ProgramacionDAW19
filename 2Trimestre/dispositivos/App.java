import java.util.ArrayList;

import classes.*;

public class App {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Intel", 12, 500, "Windows 10", 2000);
        System.out.println(l1.toString());
        l1.launch("Minecraft");
        System.out.println(l1.toString());
        l1.descargar();
        System.out.println(l1.toString());
        l1.cargar();
        System.out.println(l1.toString());
        l1.off();
        l1.on();
        l1.restart();

        Sobremesa s1 = new Sobremesa("Intel", 12, 500, "Windows 10");
        System.out.println(s1.toString());

        Tablet t1 = new Tablet("Intel", 12, 500, "Windows 10", 1500);
        System.out.println(t1.toString());

        Smartphone sm1 = new Smartphone("Intel", 12, 500, "Windows 10", 1000);
        System.out.println(sm1.toString());

        ArrayList listaDispositivos = new ArrayList<>();
        listaDispositivos.add(l1);
        listaDispositivos.add(s1);
        listaDispositivos.add(t1);
        listaDispositivos.add(sm1);

        listaImpress(listaDispositivos);

        String dispositivo = "t1";

        comprar(listaDispositivos, dispositivo);

        listaImpress(listaDispositivos);

    }

    public static void listaImpress(ArrayList listaDispositivos){
        System.out.println("\nDISPOSITIVOS DISPONIBLES: ");
        System.out.println(" ");
        for(int i = 0; i<listaDispositivos.size(); i++){
            System.out.println(listaDispositivos.get(i));
        }
    }

    public static void comprar(ArrayList listaDispositivos, String dispositivo) {
        System.out.println("Has comprado "+ dispositivo);
        int index = listaDispositivos.indexOf(dispositivo);
        listaDispositivos.remove(index);
    }
}