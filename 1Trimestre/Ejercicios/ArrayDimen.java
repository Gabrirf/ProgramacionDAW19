import java.util.Scanner;
import java.util.Arrays;

public class ArrayDimen{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();
        
        //int[][] arrayIn = new int[n][n];

        //int[][] arrayFin = crearAr(n, arrayIn);
        int[][] arrayFin = crearAr(n);

        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(arrayFin[i]));
        }
        sc.close();
    }

    //public static int[][] crearAr(int n, int[][] arrayIn){
    public static int[][] crearAr(int n){
        int[][] arrayIn = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arrayIn[i][j] = i+j;
            }
        }
        return arrayIn;
    }

}