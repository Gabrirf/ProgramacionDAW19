import java.util.Scanner;
public class Nota{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Introduce la nota: ");
        num1 = a.nextInt();

        if(num1<5 && num1>=0){
            System.out.println("Suspenso");
        }else if(num1==5){
            System.out.println("Aprobado");
        }else if(num1==6){
            System.out.println("Bien");
        }else if(num1==7 || num1==8){
            System.out.println("Notable");
        }else if(num1==9){
            System.out.println("Sobresaliente");
        }else if(num1==10){
            System.out.println("Matricula de honor");
        }else if(num1>10){
            System.out.println("A engañar al colegio campeon ;)");
        }
    }
}