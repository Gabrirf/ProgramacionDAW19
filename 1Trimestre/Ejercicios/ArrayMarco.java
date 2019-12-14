import java.util.Scanner;
import java.util.Arrays;

public class ArrayMarco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de n:");
        int n = sc.nextInt();
        System.out.print("Valor de m:");
        int m = sc.nextInt();

        char[][] arrayMarco = crearMarco(n, m);
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(arrayMarco[i]));
        }
        sc.close();
    }

    public static char[][] crearMarco(int n, int m){
        char[][] arrayM = new char[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(i==0 || i ==n-1 || j == 0 || j==m-1){
                    arrayM[i][j] = '#';
                }else{
                    arrayM[i][j] = ' ';
                }
            }
        }
        return arrayM;
    }
}