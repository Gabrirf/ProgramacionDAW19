import java.util.Scanner;
import java.util.Arrays;

public class ArrayIdentidad{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();

        int[][] arrayFin = crearAr(n);

        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(arrayFin[i]));
        }
        sc.close();
    }

    public static int[][] crearAr(int n){
        int[][] array = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    array[i][j] = 1;
                }else{
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}