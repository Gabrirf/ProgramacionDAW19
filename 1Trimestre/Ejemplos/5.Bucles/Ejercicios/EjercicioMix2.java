import java.util.Scanner;

public class EjercicioMix2 {
    public static void main(String[] args){
        
        int numeroSecreto = (int)Math.floor(Math.random()*100)+1; // Numero entre 1 y 100
        int numeroElegido = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduzca un numero:");
            numeroElegido = sc.nextInt();

            if(numeroSecreto > numeroElegido){
                System.out.println("Mayor");
            }else if(numeroSecreto < numeroElegido){
                System.out.println("Menor");
            }else{
                System.out.println("Has acertado !!");
            }
        }while(numeroSecreto != numeroElegido);
    }
}