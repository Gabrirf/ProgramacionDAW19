import java.Util.Scanner;
import java.util.Arrays;

public class AmigoInvisible{
    public static void main(String[] args){
        String[] array = {"Pepe", "Paco", "Irene", "Luis", "Alberto", "Pedro", "Rosa", "Isabel"};
        System.out.println(Arrays.toString(array));
        
        String[] des = desordenar(array);
        System.out.println(Arrays.toString(des));

        System.out.println("Las combinaciones que han tocado son las siguientes: ");
        
        for(int i = 0; i<array.length; i++){
            if(i+1<=des.length){
                System.out.println(" --> "+des[i]+" a "+des[i+1]);
            }
        }

    }

    public static String[] desordenar(String[] array){
        int aux, cont = 0;
        String temp;
        while(cont!=100){
            for(int i = array.length - 1; i > 0; i--){
                aux = (int) Math.floor(Math.random() * (i + 1));
                temp = array[i];
                array[i] = array[aux];
                array[aux] = temp;
            }

            cont++;
        }
        return array;
      }    
}