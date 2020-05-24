import lib.Funciones2;

public class InvocarFunciones {
    public static void main(String[] args){
        
        /* Modo 1: con static */
        mostrar(); // InvocarFunciones.mostrar();
        Funciones2.mostrar();

        /* Modo 2: creando un objeto para invocar al método */
        new Funciones2().mostrarNoStatic();

        /* Modo 3: creando un objeto y guardandolo, usando el método */
        Funciones2 func2 = new Funciones2();
        func2.mostrarNoStatic();

    }

    public static void mostrar(){
        System.out.println("Hola interno");
    }

}