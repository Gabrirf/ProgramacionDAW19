import java.util.Scanner;
import java.util.Arrays;

public class MultiplicarArrayDimen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();

        System.out.print("Valor de m:");
        int m = sc.nextInt();

        int[][] array1 = crearAr1(n, m);
        int[][] array2 = crearAr2(n, m);

        System.out.println("Array 1: ");
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array1[i]));
        }

        System.out.println("Array 2: ");
        for(int i = 0; i<m; i++){
            System.out.println(Arrays.toString(array2[i]));
        }

        int[][] res = multiplicar(array1, array2, n, m);
        System.out.println("El resultado es: ");
        for(int i = 0; i<m; i++){
            System.out.println(Arrays.toString(res[i]));
        }
        sc.close();
        
    }

    public static int[][] crearAr1(int n, int m){
        int[][] array = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                array[i][j] = (int) (Math.floor(Math.random()*10));
            }
        }
        return array;
    }
    
    public static int[][] crearAr2(int n, int m){
        int[][] array = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                array[j][i] = (int) (Math.floor(Math.random()*10));
            }
        }
        return array;
    }

    public static int[][] multiplicar(int[][] array1, int[][] array2, int n, int m){
        int[][] res = new int[1][m];
        //int cont = 0;
        for(int i = 0; i<n; i++){
            //res[0][i] = cont;
            //cont = 0;
            for(int u = 0; u<m; u++){
                res[0][u] = res[0][u] + (array1[i][u]*array2[u][i]);
            }
        }
        return res;
    }
}