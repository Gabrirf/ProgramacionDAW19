import java.util.Scanner;

public class esfera
{

    public static void main( String[] args )
    {
        int diametro;
        float pi = 3.14f;
        float radio = 0f;
        float area = 0f;
        float volumen = 0f;
        

        Scanner tecla = new Scanner(System.in);

        System.out.printf( "Meta el diametro de la esfera" );
		diametro = tecla.nextInt();
        
        radio = diametro / 2;
		System.out.println( "radio= " + radio );
		System.out.println( "area= " + 4*pi*radio*radio );
		System.out.println( "Volumen= " + (4/3)*pi*radio*radio*radio );

    }


}