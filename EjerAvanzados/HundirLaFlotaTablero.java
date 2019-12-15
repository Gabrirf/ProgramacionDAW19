import java.util.*;

public class HundirLaFlotaTablero{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el tamanio vertical del tablero (maximo 10): ");
        int n = sc.nextInt(); //El alto del tablero (La coordenada i)

        System.out.print("Introduzca el tamanio horizontal del tablero (maximo 10):");
        int m = sc.nextInt(); //El ancho del tablero (La coordenada j)

        while(n>10){
            System.out.println("Es demasiado alto!");
            System.out.print("Introduzca el tamanio vertical del tablero (maximo 10): ");
            n = sc.nextInt();
        }

        while(m>10){
            System.out.println("Es demasiado ancho!");
            System.out.print("Introduzca el tamanio horizontal del tablero (maximo 10):");
            m = sc.nextInt();
        }
        
        if(m<=26){
            //Tablero inicial que esta vacio (sin barcos)
            char[][] tablero = crearTablero(n, m);
            imprimirTablero(tablero, n, m);
        }

        sc.close();
    }

    static char[][] crearTablero(int n, int m){
        char[][] tablero = new char[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                tablero[i][j] = '#';
            }
        }
        return tablero;
    }

    static void imprimirTablero(char[][] tablero, int n, int m){
        int[] numeroHor = new int[m];
        int[][] numeroVer = new int[n][1];

        for(int i = 0; i<m; i++){
            numeroHor[i] = i+1;
        }

        System.out.println("    "+Arrays.toString(numeroHor));

        for(int i = 0; i<n; i++){
            for(int j = 0; j<1; j++){
                numeroVer[i][j] = i+1;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.println(Arrays.toString(numeroVer[i])+" "+Arrays.toString(tablero[i]));
        }

    }

}