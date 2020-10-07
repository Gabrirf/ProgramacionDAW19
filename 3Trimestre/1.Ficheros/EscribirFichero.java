import java.io.FileWriter;

public class EscribirFichero{
    public static void main(String[] args){
        FileWriter fichero = null;
        String linea = "";
        try {
            // Crear el objeto que va a escribir el fichero
            fichero = new FileWriter("leeme.txt");
            for (int i=0; i<10; i+=1) {
                linea = i+". ";
                linea = linea + "Hola\n";
                fichero.write(linea);
            }
            fichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}