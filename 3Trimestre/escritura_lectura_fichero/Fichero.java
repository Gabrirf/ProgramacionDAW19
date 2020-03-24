import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Fichero {
    public static void main(String[] args) {

        boolean control = true;

        Scanner entrada = new Scanner(System.in);
        Scanner salida = null;
    
        FileWriter ficheroEscritura = null;
        File ficheroLectura = null;

        try {

            ficheroLectura = new File("fichero.txt");
            ficheroEscritura = new FileWriter("fichero.txt");

            salida = new Scanner(ficheroLectura);

            while (control){

                System.out.println("Escriba algo (Exit --> salir): ");
                String texto = entrada.nextLine();

                if(!(texto.equalsIgnoreCase("exit"))){
                    ficheroEscritura.write(texto + "\n");
                } else {
                    control = false;
                }

            }

            ficheroEscritura.close();

            while(salida.hasNextLine()){
                String linea = salida.nextLine();
                System.out.println(linea);
            }

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }

        entrada.close();

    }
}