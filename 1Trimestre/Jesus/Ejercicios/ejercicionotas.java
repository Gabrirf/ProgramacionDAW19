import java.util.Scanner;

public class ejercicionotas
{

    public static void main( String[] args )
    {
        int nota;	//Creamos la variable tipo entero
        Scanner tecla = new Scanner(System.in);	//Creamos la clase leer, tipo escaner

        System.out.printf( "Ponga una nota: " );	//pedimos un numero
        nota = tecla.nextInt();		//Lo leemos y asignamos a la variable numero

        if ( nota<5 && nota>0)
        {
            System.out.print( "Suspenso" );
        } else if( nota==5 )
        {
            System.out.print( "Aprobado" );
        }

        else if(nota==6)
        {
            System.out.print( "Bien" );
        }

        else if(nota==7 || nota==8)
        {
            System.out.print( "Notable" );
        }

        else if(nota==9)
        {
            System.out.print( "Sobresaliente" );
        }

        else if(nota==10)
        {
            System.out.print( "Matricula de honor" );
        }


    }


}