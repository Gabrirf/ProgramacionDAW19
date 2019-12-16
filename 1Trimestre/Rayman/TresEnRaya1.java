import java.util.*;

public class  TresEnRaya1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenidos al Tres en Raya, vamos a comenzar a jugar");
        System.out.println("contra la IA, empezaremos eligiendo nuestra posicion en el tablero");
        System.out.println("La eleccion del jugador sera una X y la de la maquina un O.");

        //------------------------------TABLERO--------------------------------------
        String maquina = "O";
        String persona = "X";
        String[][] arrayTres = {{"*","*","*"},{"*","*","*"},{"*","*","*"}};

        for(int i = 0; i < arrayTres.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayTres[i].length; j++){
                System.out.print(arrayTres [i] [j]);
            }
            System.out.print("]");
            System.out.println();
        }

        System.out.println("La eleccion de la posicion la haremos de tal manera");
        System.out.println("Primero elegiremos las columnas que tenemos estas posiciones");
        System.out.println("Fila [1");
        System.out.println("Fila [2");
        System.out.println("Fila [3");
        System.out.println("Y a continuacion la columna");
        System.out.println("[1,2,3]");

        //-------------------------JUEGO---------------------------------
        int[] arrayFichas = {1,3};
        int f = 0;
        int c = 0;
        boolean juego = true;

        while(juego){
            boolean comprobar = true;
            while(comprobar){
                System.out.println("Empezara el jugador eligiendo una fila");
                f = sc.nextInt();
                System.out.println("Ahora elige una fila");
                c = sc.nextInt();
                f--;
                c--;
                if(arrayTres[f][c] != "*"){
                    System.out.println("Esta posicion esta elegida");
                    System.out.println("Por favor elige de nuevo");
                }else{
                    comprobar = false;
                    arrayTres[f][c] = persona;
                }                
            }

            for(int i = 0; i < arrayTres.length; i++){
                System.out.print("[");
                for(int j = 0; j < arrayTres[i].length; j++){
                    System.out.print(arrayTres [i] [j]);
                }
                System.out.print("]");
                System.out.println();
            }
            //------TODAS LAS POSIBILIDADES-------------------
            if(arrayTres[0][0] == persona && arrayTres[0][1] == persona && arrayTres[0][2] == persona ||
               arrayTres[1][0] == persona && arrayTres[1][1] == persona && arrayTres[1][2] == persona ||
               arrayTres[2][0] == persona && arrayTres[2][1] == persona && arrayTres[2][2] == persona ||
               arrayTres[0][0] == persona && arrayTres[1][0] == persona && arrayTres[2][0] == persona ||
               arrayTres[0][1] == persona && arrayTres[1][1] == persona && arrayTres[2][1] == persona ||
               arrayTres[0][2] == persona && arrayTres[1][2] == persona && arrayTres[2][2] == persona ||
               arrayTres[0][0] == persona && arrayTres[1][1] == persona && arrayTres[2][2] == persona ||
               arrayTres[0][2] == persona && arrayTres[1][1] == persona && arrayTres[2][0] == persona){
                System.out.println("Ha ganado el jugador");
                juego = false;
            }else{
                System.out.println("Es el turno de la maquina");
                
                System.out.println();
                System.out.println("Ahora elige la posicion la maquina");

                boolean comprobarm = true;
                while(comprobarm){
                    int n = (int)Math.floor(Math.random()*3);
                    int m = (int)Math.floor(Math.random()*3);                   
                    if(arrayTres[n][m] != "*"){
                    }else{
                        comprobarm = false;
                        arrayTres[n][m] = maquina;
                    }                
                }
                for(int i = 0; i < arrayTres.length; i++){
                    System.out.print("[");
                    for(int j = 0; j < arrayTres[i].length; j++){
                        System.out.print(arrayTres [i] [j]);
                    }
                    System.out.print("]");
                    System.out.println();
                }
                //------TODAS LAS POSIBILIDADES-------------------
            if(arrayTres[0][0] == maquina && arrayTres[0][1] == maquina && arrayTres[0][2] == maquina ||
               arrayTres[1][0] == maquina && arrayTres[1][1] == maquina && arrayTres[1][2] == maquina ||
               arrayTres[2][0] == maquina && arrayTres[2][1] == maquina && arrayTres[2][2] == maquina ||
               arrayTres[0][0] == maquina && arrayTres[1][0] == maquina && arrayTres[2][0] == maquina ||
               arrayTres[0][1] == maquina && arrayTres[1][1] == maquina && arrayTres[2][1] == maquina ||
               arrayTres[0][2] == maquina && arrayTres[1][2] == maquina && arrayTres[2][2] == maquina ||
               arrayTres[0][0] == maquina && arrayTres[1][1] == maquina && arrayTres[2][2] == maquina ||
               arrayTres[0][2] == maquina && arrayTres[1][1] == maquina && arrayTres[2][0] == maquina){
               System.out.println("Ha ganado la maquina");
               juego = false;                 
            }

            }
        }
    }
}