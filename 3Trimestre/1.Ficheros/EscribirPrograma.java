import java.io.FileWriter;
import java.util.Scanner;

public class EscribirPrograma{
    public static void main(String[] args){
        FileWriter fichero = null;
        String linea = "";
        try {
            // Crear el objeto que va a escribir el fichero
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca el nombre del programa: ");
            String nombre = sc.nextLine();
            fichero = new FileWriter(nombre+".java");
            fichero.write("public class "+nombre+" {\n");
            fichero.write("\tpublic static void main(String[] args) {\n");
            fichero.write("\t\tSystem.out.println(\""+nombre+"\");\n");
            fichero.write("\t}\n");
            fichero.write("}\n");
            fichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
