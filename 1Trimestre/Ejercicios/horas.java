import java.util.Scanner;

public class horas
{

    public static void main( String[] args )
    {
        float hora;
        float minutos = 0f;
        float segundos = 0f;
        float dias = 0f;
        float semanas = 0f;
        float meses = 0f;
        float anos = 0f; 
        

        Scanner tecla = new Scanner(System.in);

        System.out.printf( "Meta una hora" );
        hora = tecla.nextInt();

    

        minutos = hora * 60;
        segundos = minutos * 60;
        dias = hora / 24;
        semanas = dias / 7;
        meses = semanas / 4;


        System.out.println( "minutos= " + minutos );
        System.out.println( "segundos= " + segundos );
        System.out.println( "dias= " + dias );
        System.out.println( "semanas=" + semanas );
        System.out.println( "meses=" + meses );
		

    }


}