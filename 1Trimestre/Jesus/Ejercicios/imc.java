import java.util.Scanner;


public class imc
{
    public static void main( String[] args )
    {
    	float peso = 0f;
    	float altura = 0f;
    	Scanner tecla = new Scanner(System.in);

    	System.out.printf( "Ponga su peso " );
		peso = tecla.nextFloat();

    	System.out.printf( "Ponga su altura " );
    	altura = tecla.nextFloat();

    	System.out.printf( "Este es su IMC =  " + peso/(altura*altura));








    }
}