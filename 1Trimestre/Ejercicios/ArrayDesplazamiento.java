import java.util.Scanner;
import java.util.Arrays;
public class ArrayDesplazamiento{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] ar1 = {1, 2, 3, 4, 5};

        System.out.println("Este es el Array: ");
        System.out.println(Arrays.toString(ar1));

        System.out.println("Introduzca un numero: ");
        int n = sc.nextInt();

        System.out.println("Introduzca una posicion: ");
        int pos = sc.nextInt();

        int[] ar2 = new int[6];

        int cont = 0;

        for(int i = 0; i<6; i++){
            if(i==pos){
                ar2[i]=n;
            }else{
                ar2[i]=ar1[cont];
                cont++;
            }
        }

        System.out.println("El nuevo array quedo asi: ");
        System.out.println(Arrays.toString(ar2));

        sc.close();
    }
}