import java.util.Scanner;

public class Notas{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nota:");
        int nota = sc.nextInt();


        if(nota>=0 && nota<5){
            System.out.println("Estas suspenso");
        }else if(nota==5){
            System.out.println("Aprobado");
        }else if(nota==6){
            System.out.println("Bien");
        }else if(nota==7 || nota==8){
            System.out.println("Notable");
        }else if(nota==9){
            System.out.println("Sobresaliente");
        }else if(nota==10){
            System.out.println("Tienes Matricula de Honor!");
        }

    }

}