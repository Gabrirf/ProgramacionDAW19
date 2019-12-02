import java.util.Scanner;
import java.util.Arrays;

public class ArrayDimenSimetria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca n: ");
        int n = sc.nextInt();

        boolean simetria =true;

        int[][] array = crearArray(n);

        System.out.println("Este es el array creado de forma aleatoria: ");
        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(array[i]));
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(array[i][j]!=array[j][i]){
                    simetria=false;
                }
            }
        }

        if(simetria == true){
            System.out.println("Es SIMETRICO!");
        }else{
            System.out.println("NO es SIMETRICO!");
        }

        sc.close();

    }

    public static int[][] crearArray(int n){
        int[][] arrayIn = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arrayIn[i][j] = (int) (Math.floor(Math.random()*10));
            }
        }
        return arrayIn;
    }
}