import java.util.Scanner;

public class Edades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int edad = 0; 
        int altura = 0;
        int mediaedad = 0;
        int mediaaltura = 0;
        int contadormayor = 0;
        int contadoraltura = 0;

        for(int contador = 0; contador < 5 ; contador++){
            System.out.println("Introduce tu edad: ");
            edad = sc.nextInt();
            System.out.println("Introduce tu altura en centimetros: ");
            altura = sc.nextInt();
            mediaedad = edad + mediaedad;
            mediaaltura = altura + mediaaltura;
            if(edad >= 18){
                contadormayor++;
            }
            if(altura > 175){
                contadoraltura++;
            }
        }mediaaltura = mediaaltura/5;
        mediaedad = mediaedad/5;
        System.out.println("La edad media es de "+mediaedad+" years old.");
        System.out.println("La altura media es de "+mediaaltura+" centimetros.");
        System.out.println("Hay "+contadormayor+" personas mayores de 18 years old.");
        System.out.println("Hay "+contadoraltura+" personas que miden mas de 175 centimetros de altura.");
        
    }
}