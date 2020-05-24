import java.util.Arrays;
import java.util.Scanner;

public class EjemploArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = args.length;
        int[] n = new int[size];
        for(int i=0; i<size; i++){
            n[i] = Integer.parseInt(args[i]);
            System.out.println((i+1)+". "+n[i]);
        }
        System.out.println(Arrays.toString(n));
    }
}