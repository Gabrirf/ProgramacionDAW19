package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    String nombre;
    ArrayList<Cliente> clientes;
    ArrayList<Libro> libros;

    public Tienda () {}
    public Tienda (String nombre, ArrayList<Cliente> clientes, ArrayList<Libro> libros){
        this.nombre = nombre;
        this.clientes = clientes;
        this.libros = libros;
    }

    //----------------------------------------------------------------------------

    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    public ArrayList<Libro> getLibros(){
        return this.libros;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setClientes(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
    public void setLibros(ArrayList<Libro> libros){
        this.libros = libros;
    }

    //------------------------------------------------------------------------------

    public void listarLibros(){
        int contador = 0;
        for(Libro libro : this.libros){
            contador++;
            System.out.println(contador+". "+libro.toString());
        }
    }

    public void listarClientes(){
        int contador = 0;
        for(Cliente cliente : this.clientes){
            contador++;
            System.out.println(contador+". "+cliente.toString());
        }
    }

    public void registrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    public void registrarLibro(Libro libro){
        this.libros.add(libro);
    }

    public void venderLibro(Libro libro, Cliente cliente){
        if(cliente.getDinero()>=libro.getPrecio()){
            if(libro.comprar()!=null){
                cliente.pagarLibro(libro.getPrecio());
                cliente.addLibro(libro);
            }else{
                System.out.println("Error en la compra");
            }
        }else{
            System.out.println("Error en la compra");
        }
    }
    
    public void buscar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Elija la opcion de busqieda ---");
        System.out.println("1. Nombre\n2. Autor\n3. Categoria");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion){
            case 1:
                System.out.print("Introduzca un nombre a buscar: ");
                String nombre = sc.nextLine();
                System.out.println();
                boolean temporal = true;
                for(Libro libro : this.libros){
                    if(libro.getNombre().equalsIgnoreCase(nombre)){
                        System.out.println("- "+libro.getNombre());
                        temporal = false;
                    }
                }
                if(temporal == false){
                    System.out.println("No se ha encontrado ningun libro con ese nombre");
                }
                break;
            case 2:
                System.out.print("Introduzca un autor a buscar: ");
                String autor = sc.nextLine();
                System.out.println();
                boolean temporal2 = true;
                for(Libro libro : this.libros){
                    if(libro.getAutor().equalsIgnoreCase(autor)){
                        System.out.println("- "+libro.getNombre());
                        temporal2 = false;
                    }
                }
                if(temporal2 == false){
                    System.out.println("No se ha encontrado ningun libro con ese autor");
                }
                break;
            case 3:
                System.out.print("Introduzca un categoria a buscar: ");
                String categoria = sc.nextLine();
                System.out.println();
                boolean temporal3 = true;
                for(Libro libro : this.libros){
                    if(libro.getCategoria().equalsIgnoreCase(categoria)){
                        System.out.println("- "+libro.getNombre());
                        temporal3 = false;
                    }
                }
                if(temporal3 == false){
                    System.out.println("No se ha encontrado ningun libro con ese categoria");
                }
                break;  
        }
        sc.close();

    }

}