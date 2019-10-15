import java.util.Scanner;

public class ConversionH{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.print("Introduzca Hora: ");
       double h = sc.nextDouble();

       double s = h * 3600;
       double mn = h * 60;
       double d = h * 0.0416667;        //  PARA INTRODUCIR DECIMALES PUNTOS NO COMAS,  INVITAR A MARIO A CERVEZA
       double a = h * 0.000114155;
       double sm = h * 0.00595238;
       double m = h * 0.00136986;

       System.out.println( h + " Horas en segundo es " + s);
       System.out.println( h + " Horas en minuto es "+ mn);
        System.out.println(h + " Horas en dias es " + d);
        System.out.println(h + " Horas en semanas es " + sm);
        System.out.println(h + " Horas en meses es " + m);
        System.out.println(h + " Horas en años es " + a);
        

    }
}