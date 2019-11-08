import java.util.*;

public class DesplazarArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tam = 10;
        int[] array = {1,2,3,4,5,6,7,0,0,0};
        int[] arraySave = array.clone();

        System.out.print("Introduce el numero que quieras introducir en el array: ");
        arraySave[0] = sc.nextInt();

        for(int i = 1; i < tam-1; i++ ){
            arraySave[i] = array[i-1]; 
        }
        System.out.print(Arrays.toString(arraySave));
    }
}