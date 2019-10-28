import java.util.Scanner;
import java.util.Random;

    public class AdivinarNumero{
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce un numero limite: ");
            int n = sc.nextInt();


            int random = (int) (Math.random() * n) + 1;

            System.out.println(random);


            System.out.println("Adivina el numero!");

            System.out.print("\nIntroduzca un numero: ");
            int i = sc.nextInt();

            while(i!=random){

                if(i>random){
                    System.out.println("Es menor!");
                }
                if(i<random){
                    System.out.println("Es mayor!");
                }
                System.out.print("\nIntroduzca otro numero: ");
                i = sc.nextInt();
            }

            System.out.println("Lo has adivinado el numero era el "+random);


            sc.close();
        }
    }
