import java.util.Scanner;

public class EdadesAlturas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double sumAlt = 0;
        int altos = 0;

        while(cont!=5){
            cont++;

            System.out.println("Introduce alturas en metros: ");
            double alt=sc.nextDouble();

            sumAlt = sumAlt + alt;

            if(alt >= 1.75){

                altos++;
            }
        }

        double mediaAlt = sumAlt/5;

        int cont2 = 0;
        double sumEd=0;
        int mayores = 0;

        while(cont2!=5){

            cont2++;

            System.out.println("Introduzca edades: ");
            double ed = sc.nextDouble();

            sumEd = sumEd + ed;

            if(ed >=18){
                mayores++;
            }
        }

        double mediaEd = sumEd/5;

        System.out.println("La media de alturas es: "+mediaAlt);
        System.out.println("Hay "+altos+" personas que miden mas de 1,75 metros.");
        System.out.println("La media de edades es: "+mediaEd);
        System.out.println("Hay "+mayores+" personas mayores de edad.");

        sc.close();

        
    }
}