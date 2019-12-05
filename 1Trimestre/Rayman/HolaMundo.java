import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        
        int suma1 = 1;
        int suma2 = 1;
        int resultado = 0;
        
      
        resultado = suma1 + suma2;

        for(int i = 0; i < 4; i++){
            resultado = resultado * 10;
        }
        System.out.println(resultado);

    }    
}