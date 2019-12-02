import java.util.Arrays;
import java.util.Scanner;

public class ArrayTrasp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca n: ");
        int n = sc.nextInt();

        int[][] array = crearArray(n);

        System.out.println("Este es el array creado: ");
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] arrayT = trasponerAr(array, n);

        System.out.println("Este es el array traspuesto: ");
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(arrayT[i]));
        }

        sc.close();
    }

    public static int[][] crearArray(int n){
        int[][] arrayIn = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arrayIn[i][j] = i;
            }
        }
        return arrayIn;
    }

    public static int [][] trasponerAr(int[][] array, int n){
        int[][] arrayT =  new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arrayT[j][i] = array [i][j];
            }
        }
        return arrayT;
    }
}