import java.util.Scanner;

public class InvertirPalabra{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        String palabra = sc.nextLine();

        char[] desguezada = palabra.toCharArray();

        invertir(desguezada);

        sc.close();
    }

    public static void invertir(char[] desguezada){
        
    }

}