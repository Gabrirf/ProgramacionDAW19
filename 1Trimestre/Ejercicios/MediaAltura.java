import java.util.Scanner;

public class MediaAltura{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        double suma = 0;
        double altura = 0; 
        int edadm = 0;
        int alturam = 0;
        Double n = 1.00;

        for(int e = 1; e <= 5; e++){
            System.out.println("Introduzca su edad porfavor: ");
             n = sc.nextDouble();

            //Edad media
            cont++;
            suma = suma + n;

            //Altura media
            System.out.println("Introduzca su altura en metros porfavor: ");
            n = sc.nextDouble();
            altura = altura + n;

            //+18 edad
            if(n>18.00){
               edadm ++; 
            }
            //+1,75 cm
            if( n > 1.75){
                alturam ++;
            }
        }
        System.out.println("Edad media = "+ suma/cont);
        System.out.println("Altura media = "+ altura/n);
        System.out.println("Mayores de 18 = "+ edadm);
        System.out.println("Mas altos que 1,75m = "+ alturam);

        sc.close();
    }
}