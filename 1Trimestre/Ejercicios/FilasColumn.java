import java.util.Scanner;
import java.util.Arrays;

public class FilasColumn{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();

        int[][] array1 = crearAr(n);

        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array1[i]));
        }
        int[] resFil = sumarFil(array1, n);
        int[] resCol = sumarColum(array1, n);
        System.out.println("Suma de Filas : "+Arrays.toString(resFil));
        System.out.println("Suma de Columnas: "+Arrays.toString(resCol));
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

    public static int[] sumarColum(int[][] array1, int n){
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                res[i] = array1[j][i] + res[i];
            }
        }
        return res;
    }

    public static int[] sumarFil(int[][] array1, int n){
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                res[i] = array1[i][j] + res[i];
            }
        }
        return res;
    }
}