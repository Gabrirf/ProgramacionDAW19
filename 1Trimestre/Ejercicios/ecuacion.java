import java.util.Scanner;


public class ecuacion
{
    public static void main( String[] args )
    {
    	float a = 0f;
    	float b = 0f;
        float c = 0f;
        float x = 0f;

    	Scanner tecla = new Scanner(System.in);

    	System.out.println( "¿Quiere resolver una ecuacion de segundo grado?" );
        
        System.out.println( "Voy a ir pidiendote los valores de las letras a, b y c. Ponga el numero que corresponda a cada letra" );


        System.out.printf( "Ponga la letra a: " );
        a = tecla.nextFloat();

        System.out.printf( "Ponga la letra b: " );
        b = tecla.nextFloat();

        System.out.printf( "Ponga la letra c: " );
        c = tecla.nextFloat();

        


    	System.out.println( "El primer resultado es (+) =" + (-b+(Math.sqrt((b*b)*4*a*c))/(2*a)) );
        System.out.println( "El segundo resultado es(-) =" + (-b-(Math.sqrt((b*b)*4*a*c))/(2*a)) );
    	



    }
}