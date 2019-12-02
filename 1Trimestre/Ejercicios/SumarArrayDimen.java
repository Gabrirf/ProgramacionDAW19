import java.util.Scanner;
import java.util.Arrays;

public class SumarArrayDimen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();

        int[][] array1 = crearAr(n);
        int[][] array2 = crearAr(n);

        int[][] result = sumarAr(array1, array2, n);

        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array1[i])+" "+Arrays.toString(array2[i])+"    "+Arrays.toString(result[i]));
        }
        sc.close();
    }

    public static int[][] crearAr(int n){
        int[][] array = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                array[i][j] = (int) (Math.floor(Math.random()*10));
            }
        }
        return array;
    }

    public static int[][] sumarAr(int[][] array1, int[][] array2, int n){
        int[][] suma = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                suma[i][j] = array1[i][j] +array2[i][j];
            }
        }
        return suma;
    }
}