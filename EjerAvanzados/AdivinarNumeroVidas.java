import java.util.Scanner;
import java.util.Random;

    public class AdivinarNumeroVidas{
        public static void main(String[] args) {

            boolean seguir = true;
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce un numero limite: ");
            int n = sc.nextInt();

            while(seguir==true){

                int nVidas = 7;

                int random = (int) (Math.random() * n) + 1;

                System.out.println("Tienes 7 VIDAS!");


                System.out.println("Adivina el numero!");

                System.out.print("\nIntroduzca un numero: ");
                int i = sc.nextInt();
                nVidas--;
                while(i!=random && nVidas!=0){

                    if(i>random){
                        System.out.println("Es menor!");
                        System.out.println("Te quedan "+nVidas+" vidas");
                    }
                    if(i<random){
                        System.out.println("Es mayor!");
                        System.out.println("Te quedan "+nVidas+" vidas");
                    }
                    nVidas--;
                    System.out.print("\nIntroduzca otro numero: ");
                    i = sc.nextInt();      
                    
                }

                if(nVidas==0){
                    System.out.println("Has Perdido!");
                }else{
                    System.out.println("Lo has adivinado el numero era el "+random);
                }

                System.out.println("\n¿Quieres jugar otra vez S/n?");
                char resp = sc.next().toLowerCase().charAt(0);
                
                if(resp=='n'){
                    seguir=false;
                }else{

                    System.out.print("\nIntroduce un numero limite: ");
                    n = sc.nextInt();

                }
            }

            sc.close();
        }
    }
