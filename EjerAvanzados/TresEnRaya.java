import java.util.*;

public class TresEnRaya{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        

        int modoJuego = 1;
        String jugador1 = "X";
        String jugador2 = "O";
        String maquina = "O";
        int turno;
        int pos;

        while(modoJuego==1 || modoJuego==2){

            //Variables que deben resetearse cada vez que se juegue
            //Crear tablero (Array Dimensional 3x3 aunque puede ser un array de length=9)
            String[][] tablero = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
            int tiradas=1;
            boolean ganar = false;

            menuEleccion();
            modoJuego = sc.nextInt();

            //Modo UNA PERSONA
            if(modoJuego==1){
                String[] jugadores1 = {jugador1, maquina};

                String turnoAleatorio1 = (jugadores1[new Random().nextInt(jugadores1.length)]);

                System.out.println("\f --> Has seleccionado Modo Un Jugador <--");
                System.out.println("JUGADOR ===> X\nMAQUINA ===> O");
                imprimirTablero(tablero);

                if(turnoAleatorio1.equals("X")){
                    turno = 1;
                }else{
                    turno = 2;
                }

                while(tiradas<10 && ganar==false){
                    //Turno 1
                    if(turno==1){
                        if(tiradas%2!=0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador (X)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador ha ganado!");
                                ganar=true;
                            }
                            tiradas++;
                        }

                        if(tiradas%2==0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Maquina (O)");
                            pos = (int) (Math.floor((Math.random()*9)+1));
                            while(ocupadaPos(tablero, pos)==false){
                                pos = (int) (Math.floor((Math.random()*9)+1));
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Maquina ha ganado!");
                                ganar=true;
                            }

                            tiradas++;
                        }
                    }

                    //Turno 2
                    if(turno==2){
                        if(tiradas%2!=0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Maquina (O)");
                            pos = (int) (Math.floor((Math.random()*9)+1));
                            while(ocupadaPos(tablero, pos)==false){
                                pos = (int) (Math.floor((Math.random()*9)+1));
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Maquina ha ganado!");
                                ganar=true;
                            }

                            tiradas++;
                        }

                        if(tiradas%2==0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador (X)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador ha ganado!");
                                ganar=true;
                            }

                            tiradas++;
                        }
                    }
                }

                if(ganar==false){
                    System.out.println("Tablero LLENO!");
                }
            }

            /* ------------------------------------------------------------------------------------------------------ */

            //Modo DOS PERSONA
            if(modoJuego==2){
                String[] jugadores2 = {jugador1, jugador2};

                String turnoAleatorio2 = (jugadores2[new Random().nextInt(jugadores2.length)]);

                System.out.println("\f --> Has seleccionado Modo Dos Jugadores <--");
                System.out.println("JUGADOR 1 ===> X\nJUGADOR 2 ===> O");
                imprimirTablero(tablero);

                if(turnoAleatorio2.equals("X")){
                    turno = 1;
                }else{
                    turno = 2;
                }

                while(tiradas<10 && ganar==false){
                    //Turno 1
                    if(turno==1){
                        if(tiradas%2!=0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador 1 (X)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador 1 ha ganado!");
                                ganar=true;
                            }
                            tiradas++;
                        }

                        if(tiradas%2==0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador 2 (O)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador 2 ha ganado!");
                                ganar=true;
                            }
                            tiradas++;
                        }
                    }

                    //Turno 2
                    if(turno==2){
                        if(tiradas%2!=0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador 2 (O)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador 2 ha ganado!");
                                ganar=true;
                            }
                            tiradas++;
                        }

                        if(tiradas%2==0 && ganar==false && tiradas<10){
                            System.out.println("Turno de Jugador 1 (X)");
                            System.out.print("Indroduzca posicion (1-9): ");
                            pos = sc.nextInt();
                            while(ocupadaPos(tablero, pos)==false){
                                System.out.print("Posicion Ocupada, introduzca otra posicion: ");
                                pos = sc.nextInt();
                            }
                            tablero = rellenarPos(tablero, pos, tiradas, turno);

                            imprimirTablero(tablero);
                            
                            if(victoria(tablero, turno, tiradas)==true){
                                System.out.println("Jugador 1 ha ganado!");
                                ganar=true;
                            }

                            tiradas++;
                        }
                    }
                }

                if(ganar==false){
                    System.out.println("Tablero LLENO!");
                }
            }
        }        
        System.out.println("Gracias por su tiempo!");
        sc.close();
    }



    //Menu  del Juego
    public static void menuEleccion(){
        System.out.println("BIENVENIDOS A MyTicTacToe!");
        System.out.println("----------------------------");
        System.out.println("Elija Modo de Juego: ");
        System.out.println(" 1. Una Persona\n 2. Dos Personas\n 0. Exit");
        System.out.print("Su eleccion: ");
    }


    //Imprimir Tablero
    public static void imprimirTablero(String[][] tablero){
        for(int i = 0; i<tablero.length; i++){
            System.out.println(" -------------");
            for(int j = 0; j<tablero.length; j++){
                System.out.print(" | "+tablero[i][j]);
                if(j==tablero.length-1){
                    System.out.print(" | ");
                }
            }
            System.out.println("");
            if(i==tablero.length-1){
                System.out.println(" -------------");
            }
        }
    }

    //Funcion para ver si esta ocupada la posicion
    public static boolean ocupadaPos(String[][] tablero, int pos){
        boolean libre = true;
        if(pos==1){
            if(tablero[0][0].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==2){
            if(tablero[0][1].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==3){
            if(tablero[0][2].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==4){
            if(tablero[1][0].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==5){
            if(tablero[1][1].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==6){
            if(tablero[1][2].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==7){
            if(tablero[2][0].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==8){
            if(tablero[2][1].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }else if(pos==9){
            if(tablero[2][2].equals(" ")){
                libre = true;
            }else{
                libre = false;
            }
        }
        return libre;
    }

    //Rellenar posicion
    public static String[][] rellenarPos(String[][] tablero, int pos, int tiradas, int turno){
        String symbol = " ";

        if(tiradas%2!=0){
            if(turno==1){
                symbol = "X";
            }
            if(turno==2){
                symbol = "O";
            }
        }

        if(tiradas%2==0){
            if(turno==1){
                symbol = "O";
            }
            if(turno==2){
                symbol = "X";
            }
        }

        if(pos==1){
            tablero[0][0] = symbol;
        }else if(pos==2){
            tablero[0][1] = symbol;
        }else if(pos==3){
            tablero[0][2] = symbol;
        }else if(pos==4){
            tablero[1][0] = symbol;
        }else if(pos==5){
            tablero[1][1] = symbol;
        }else if(pos==6){
            tablero[1][2] = symbol;
        }else if(pos==7){
            tablero[2][0] = symbol;
        }else if(pos==8){
            tablero[2][1] = symbol;
        }else if(pos==9){
            tablero[2][2] = symbol;
        }

        return tablero;
    }

    //Funcion para comprobar si ha ganado alguien
    public static boolean victoria(String[][] tablero, int turno, int tiradas){
        boolean victoria = false;
        String symbol = " ";

        if(tiradas%2!=0){
            if(turno==1){
                symbol = "X";
            }
            if(turno==2){
                symbol = "O";
            }
        }

        if(tiradas%2==0){
            if(turno==1){
                symbol = "O";
            }
            if(turno==2){
                symbol = "X";
            }
        }

        //Posibilidades Horizontales
        if(tablero[0][0] == tablero[0][1] && tablero[0][0] == tablero[0][2] && tablero[0][0] == symbol){
            victoria = true;
        }
        if(tablero[1][0] == tablero[1][1] && tablero[1][0] == tablero[1][2] && tablero[1][0] == symbol){
            victoria = true;
        }
        if(tablero[2][0] == tablero[2][1] && tablero[2][0] == tablero[2][2] && tablero[2][0] == symbol){
            victoria = true;
        }

        //Posibilidades Verticales
        if(tablero[0][0] == tablero[1][0] && tablero[0][0] == tablero[2][0] && tablero[0][0] == symbol){
            victoria = true;
        }
        if(tablero[0][1] == tablero[1][1] && tablero[0][1] == tablero[2][1] && tablero[0][1] == symbol){
            victoria = true;
        }
        if(tablero[0][2] == tablero[1][2] && tablero[0][2] == tablero[2][2] && tablero[0][2] == symbol){
            victoria = true;
        }

        //Posibilidades Diagonales
        if(tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2] && tablero[0][0] == symbol){
            victoria = true;
        }
        if(tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0] && tablero[0][2] == symbol){
            victoria = true;
        }

        return victoria;
    }
}

/*

for(int i = 0; i<tablero.length; i++){

    for(int j = 0; j<tablero.length; j++){
            
    }

}

*/