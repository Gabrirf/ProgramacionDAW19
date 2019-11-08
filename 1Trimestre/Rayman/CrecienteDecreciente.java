import java.util.*;

public class CrecienteDecreciente{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] arrayInt = new int[tam];
        int cont = 0;
        int save = 0;
        int creciente = 0;
        int decreciente = 0;
        
        System.out.print("Introduce la posicion 1: ");
        arrayInt[0] = sc.nextInt();
        save = arrayInt[0];

        for(int i = 1; i < tam; i++){
            System.out.print("Introduce la posicion "+(i+1)+": ");
            arrayInt[i] = sc.nextInt();
            cont = arrayInt[i];

            if(arrayInt[i] > save ){
                creciente++;
                if(creciente==9){
                    System.out.println("Este array esta en orden creciente.");
                }
            }else if(arrayInt[i] < save){
                decreciente++;
                if(decreciente==9){
                    System.out.println("Este array esta en orden decreciente.");
                }
            }
        }if(creciente != 9 && decreciente != 9){
            System.out.print("Este array no esta ordenado");
        }
    }
}  