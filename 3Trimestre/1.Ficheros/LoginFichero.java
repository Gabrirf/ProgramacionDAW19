import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class LoginFichero{
    public static void main(String[] args){
        File fichero = new File("files/credenciales");

        try{
            Scanner file = new Scanner(fichero);
            Scanner console = new Scanner(System.in);

            String userFile = file.nextLine();
            String passwordFile = file.nextLine();

            System.out.print("Introduzca su usuario: ");
            String userConsole = console.nextLine();
            System.out.print("Introduzca su constraseña: ");
            String passwordConsole = console.nextLine();

            if(userFile.equals(userConsole) && passwordFile.equals(passwordConsole)){
                System.out.println("Bienvenid@ al sistema ;)");
            }else{
                System.out.println("Baiasé de aki impostol !!");
            }
            
        }catch(FileNotFoundException e){
            System.out.println("Error en el fichero de credenciales: no existe el fichero");
        }catch(NoSuchElementException e){
            System.out.println("Error en el fichero de credenciales: faltan datos");
        }
    }

}