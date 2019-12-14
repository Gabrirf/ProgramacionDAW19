import java.util.Scanner;
import java.util.Arrays;

public class ArrayTrasMN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca n: ");
        int n = sc.nextInt();

        System.out.println("Introduzca m:");
        int m = sc.nextInt();

        int[][] array = crearArray(n, m);
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] arrayT = trasponerAr(array, n, m);
        for(int i = 0; i<m; i++){
            System.out.println(Arrays.toString(arrayT[i]));
        }

        sc.close();
    }

    public static int[][] crearArray(int n, int m){
        int[][] arrayIn = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arrayIn[i][j] = (int) (Math.floor(Math.random()*10));
            }
        }
        return arrayIn;
    }

    public static int [][] trasponerAr(int[][] array, int n, int m){
        int[][] arrayT =  new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arrayT[j][i] = array [i][j];
            }
        }
        return arrayT;
    }
}