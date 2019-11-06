import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] ar = {1,2,3};
        // 1--piedra / 2--papel / 3--tijeras

        int random = (int) (Math.random() * ar.length) + 1;
        

        
        System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

        System.out.print("\n Elija una opción: ");
        int elec = sc.nextInt();

        switch(elec){

            case 1: //piedra

                if(random == 1){
                    System.out.println(" Empate");
                }
                if(random == 2){
                    System.out.println(" Perdiste");
                }
                if(random == 3){
                    System.out.println(" Ganaste");
                }

            break;

            case 2: //papel

                if(random == 1){
                    System.out.println(" Ganaste");
                }
                if(random == 2){
                    System.out.println(" Empate");
                }
                if(random == 3){
                    System.out.println(" Perdiste");
                }

            break;

            case 3: //tijeras

                if(random == 1){
                    System.out.println(" Perdiste");
                }
                if(random == 2){
                    System.out.println(" Ganaste");
                }
                if(random == 3){
                    System.out.println(" Empate");
                }

            break;
        }

        if(random == 1){
            System.out.println(" La maquina saco PIEDRA");
        }
        if(random == 2){
            System.out.println(" La maquina saco PAPEL");
        }
        if(random == 3){
            System.out.println(" La maquina saco TIJERAS");
        }

        sc.close();
    }
}