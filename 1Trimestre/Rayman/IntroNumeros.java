import java.util.Scanner;

public class IntroNumeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int listado = 0;
        int numero = 0;
        int negativo = 0;
        
        System.out.print("Introduce la cantidad de numeros que vas a introducir:");
        listado = sc.nextInt();

        for(int contador = 0; contador < listado; contador++){
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();
            if(numero < 0){
                negativo++;
            }
        }if(negativo > 0){
            System.out.println("Si ha introducido un numero negativo.");
        }else{
            System.out.println("No ha introducido ningun numero negativo.");
        }
        

    }
}