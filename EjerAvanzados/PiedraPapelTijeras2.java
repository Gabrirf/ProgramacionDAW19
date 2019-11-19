import java.util.Scanner;


public class PiedraPapelTijeras2{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        //variables
        int op=0;
        int nRondas=0;
        boolean jugar = true;
        int cont = 0;
        int elec, scoreUs = 0, scoreMaq = 0;

        //Bienvenida
        System.out.println("\nBienvenidos al Juego de Piedra, Papel o Tijeras!");
        System.out.println("---------------------------------------------------");

        //Menu principal (considera la existencia de args)
        if(args.length>0){
            op = Integer.parseInt(args[0]);
        }else{
            System.out.println("\n 1. OneShot\n 2. Clasico\n 3. Custom\n 0. Salir");
            System.out.print("\nElija una opcion: ");
            op = input.nextInt();
        }

        //nRondas por cada modo de Juego
        if(op == 1){
            nRondas=1;
        }else if(op == 2){
            nRondas=3;
        }else if(op == 3){
            System.out.println("\nHas elegido el modo de Juego Custom!");
            System.out.print("Elija el numero de rondas que desea jugar: ");
            nRondas = input.nextInt();
        }else{
            jugar = false;
            System.out.println("Gracias por su tiempo!");
        }
        
        //Bucle principal para repetir juego
        while(jugar==true){

            //reset de scores y contador de rondas
            scoreUs = 0;
            scoreMaq = 0;
            cont = 0;
        

            //Bucle que genera el juego. Dependiendo del nRondas sera un modo u otro
            while(cont!=nRondas && jugar==true){

                System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");
                System.out.print("\nElija una opcion: ");
                elec = input.nextInt();

                //generamos eleccion de la maquina con un Array y un random de posicion
                int[] ar = {1,2,3}; // 1--piedra / 2--papel / 3--tijeras
                int random = (int) (Math.random() * ar.length) + 1;

                //Estudio de opciones no validas
                while(elec!=1 && elec!=2 && elec!=3){
                    System.out.println("\nOPCION NO ES VALIDA!");
                    System.out.println(" 1. Piedra \n 2. Papel \n 3. Tijeras");
                    System.out.print("\nElija una opcion: ");
                    elec = input.nextInt();
                }

                //Estudio de si es EMPATE
                while(elec==random){
                    if(random==1){
                        System.out.println("Los dos sacasteis PIEDRA.");
                        System.out.println("Ha sido empate!");
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                    }
                    if(random==2){
                        System.out.println("Los dos sacasteis PAPEL.");
                        System.out.println("Ha sido empate!");
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                    }
                    if(random==3){
                        System.out.println("Los dos sacasteis TIJERA.");
                        System.out.println("Ha sido empate!");
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                    }
                    System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");
                    System.out.print("\nElija una opcion: ");
                    elec = input.nextInt();
                }

                //Switch para ver quien gana
                switch(elec){
                    case 1: //ELECCION de Us: Piedra
                        if(random == 2){
                            System.out.println("Perdiste, la maquina saco PAPEL");
                            scoreMaq++;
                            cont++;
                        }
                        if(random == 3){
                            System.out.println("Ganaste, la maquina saco TIJERAS");
                            scoreUs++;
                            cont++;
                        }
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        break;
                    case 2: //ELECCION de Us: Papel
                        if(random == 1){
                            System.out.println("Ganaste, la maquina saco PIEDRA");
                            scoreUs++;
                            cont++;
                        }
                        if(random == 3){
                            System.out.println("Perdiste, la maquina saco TIJERAS");
                            scoreMaq++;
                            cont++;
                        }
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        break;
                    case 3: //ELECCION de Us: Tijeras
                        if(random == 1){
                            System.out.println("Perdiste, la maquina saco PIEDRA");
                            scoreMaq++;
                            cont++;
                        }
                        if(random == 2){
                            System.out.println("Ganaste, la maquina saco PAPEL");
                            scoreUs++;
                            cont++;
                        }
                        System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        break;
                }
                if(cont!=nRondas){
                    System.out.println("Te quedan "+(nRondas-cont)+" rondas.");
                }
        
            }

            //Resultado final
            if(cont==nRondas){
                System.out.println("Se han acabado todas Rondas");
                if(scoreUs>scoreMaq){
                    System.out.println("\nHAS GANADO!");
                }else if(scoreUs<scoreMaq){
                    System.out.println("\nHAS PERDIDO!");
                }else{
                    System.out.println("\nHAS EMPATADO!");
                }
            }

            //Pregunta para repetir el juego
            System.out.println("\n\n¿Quieres volver a jugar? (S/n)");
            char resp = input.next().toLowerCase().charAt(0);
            if(resp == 'n'){
                jugar=false;
            }
            if(jugar==true){
                System.out.println("\n 1. OneShot\n 2. Clasico\n 3. Custom\n 0. Salir");
                System.out.print("\nElija una opcion: ");
                op = input.nextInt();
            }

            //nRondas por cada modo de Juego
            if(op == 1){
                nRondas=1;
            }else if(op == 2){
                nRondas=3;
            }else if(op == 3){
                System.out.println("\nHas elegido el modo de Juego Custom!");
                System.out.print("Elija el numero de rondas que desea jugar: ");
                nRondas = input.nextInt();
            }else{
                jugar = false;
                System.out.println("Gracias por su tiempo!");
            }

        }
        input.close();
    }

}