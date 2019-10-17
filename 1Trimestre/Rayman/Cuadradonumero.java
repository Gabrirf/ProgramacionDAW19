import java.util.Scanner;

public class Cuadradonumero{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        int num1 = 0; // Aqui vamos a introducir la variable
        int k = 0;
        boolean control = true; // Con esto iniciamos una variable boleana en true
        while(control){ // Con esto comenzamos el bucle
            System.out.println("Introduce un numero para elevarlo al cuadrado y sacar la solucion en pantalla");
            num1 = a.nextInt();

            System.out.println("El resultado es = "+(num1*num1));
            System.out.println("Introduce otro numero o pulsa '0' para salir del programa");
            k = a.nextInt();
            if(k==0){ // Con esto definimos que cuando se cumpla esa condicion que en este caso es que introduzcamos 0 saldremos del programa
                control = false; // Porque cambiara la variable boleana a false y saldra del programa
            }
        
        

        }
    }
}
