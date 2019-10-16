import java.util.Scanner;


public class CambioTiempos{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cantidad de horas: ");
        double h = sc.nextDouble();

        System.out.println("\nELIJA UNA OPCION: ");
        System.out.println("\n\t-Opcion 1-");
        System.out.println("\t-Opcion 2-");
        System.out.println("\t-Opcion 3-");
        System.out.println("\t-Opcion 4-");
        System.out.println("\t-Opcion 5-");
        System.out.println("\t-Opcion 6-");
        System.out.println("\t-Opcion 7-");
        int elec = sc.nextInt();

        double m = h*24;
        double s = m*24;
        double d = h/24;
        double sem = d/7;
        double mes = d/30;
        double an = mes/12;

        switch(elec){

            case 1:
                System.out.println("En anos equivale a: "+an);
            break;

            case 2:
                System.out.println("En meses equivale a: "+mes);
            break;

            case 3:
                System.out.println("En semanas equivale a: "+sem);
            break;

            case 4:
                System.out.println("En dias equivale a: "+d);
            break;

            case 5:
                System.out.println("En horas equivale a: "+h);
            break;

            case 6:
                System.out.println("En minutos equivale a: "+m);
            break;

            case 7:
                System.out.println("En segundos equivale a: "+s);
            break;

        }
        sc.close();
        
    }

}