import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LeerFichero{
    public static void main(String[] args){
        // Creo el objeto fichero
        File fichero = new File("files/fichero.txt");
        int cont = 0;
        try{
            // Asocio el scanner con el fichero
            Scanner lector = new Scanner(fichero);

            // *** Lectura *** //
            while(lector.hasNextLine()){
                cont += 1;
                String linea = lector.nextLine();
                //if(linea.equals("tercera")){
                    System.out.println( cont +"\t"+ linea);
                //}
            }

            // ************** //
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        System.out.println("Fin!");
    }
}