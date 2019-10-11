import java.util.Scanner;

public class Notas{
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = 0;               //Para numero con decimales usamos Double 
        
        System.out.println("Introduce su nota: ");
        
        a = sc.nextDouble();

        if(a <= 4){
            System.out.println("Suspenso");
        }else if( a == 5){
            System.out.println("Aprobado");
        }else if ( a == 6){
             System.out.println("Bien");
        }else if( a == 7 && a == 8){
             System.out.println("Notable"); 
        }else if( a == 9){
             System.out.println("Sobresaliente");
        }else if(a == 10){
             System.out.println("Matricula");
        }
    }
}