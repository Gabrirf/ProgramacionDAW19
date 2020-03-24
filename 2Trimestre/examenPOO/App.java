import java.util.ArrayList;
import java.util.Scanner;

import classes.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        Tienda tienda = new Tienda("Erase una vez", new ArrayList<Cliente>(), new ArrayList<Libro>());
        Libro libro1 = new Libro("ESDLA", "JRR Tolkien", "Fantasia", 23.6, 12);
        Libro libro2 = new Libro("El elfo Oscuro", "Juan", "Fantasia", 26.78, 5);
        Cliente cliente1 = new Cliente("Pepe", new ArrayList<Libro>(), 200.3);
        Cliente cliente2 = new Cliente("Juan", new ArrayList<Libro>(), 220.3);
        Cliente cliente3 = new Cliente("Luis", new ArrayList<Libro>(), 20.3);
        Cliente cliente4 = new Cliente("Pedro", new ArrayList<Libro>(), 70.3);

        tienda.registrarCliente(cliente1);
        tienda.registrarCliente(cliente2);
        tienda.registrarCliente(cliente3);
        tienda.registrarCliente(cliente4);

        tienda.registrarLibro(libro1);
        tienda.registrarLibro(libro2);


        while(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6){
            System.out.println("### Bienvenido a Erase una vez ###");
            System.out.println("1. Ver Libros\n2. Ver Clientes\n3. Buscar Libro\n4. Vender Libro\n5. Registrar Libro\n6.Refistrar Cliente\n0. Salir");
            System.out.print("Introduzca un opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    tienda.listarLibros();
                    break;
                case 2:
                    tienda.listarClientes();
                    break;
                case 3:
                    tienda.buscar();
                    break;
                case 4:
                    tienda.listarClientes();
                    System.out.println("Elije un comprador:");
                    int cliente = sc.nextInt();
                    sc.nextLine();
                    tienda.listarLibros();
                    System.out.println("Elije un libro:");
                    int libro = sc.nextInt();
                    sc.nextLine();
                    tienda.venderLibro(tienda.getLibros().get(libro), tienda.getClientes().get(cliente));
                    break;
                case 5:
                    System.out.println("Introduzca nombre libro");
                    String nombre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduzca autor libro");
                    String autor = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduzca categoria libro");
                    String categoria = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduzca precio libro");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Introduzca cantidad libro");
                    int cant = sc.nextInt();
                    sc.nextLine();
                    tienda.registrarLibro(new Libro(nombre, autor, categoria, precio, cant));
                    break;
                case 6:
                    System.out.println("Introduzca nombre:");
                    String nombreCli = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Introduzca dinero:");
                    double dinero = sc.nextDouble();
                    sc.nextLine();
                    tienda.registrarCliente(new Cliente(nombreCli, new ArrayList<Libro>(), dinero));
                    break;
            }
        }

        System.out.println("Gracias por todo!");

        sc.close();
    }
}