import java.util.Scanner;

public class PiedraPapelTijeraExamen{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean fin = true;
        int op;

        System.out.println("\nBienvenidos al Juego de Piedra, Papel o Tijeras!");
        System.out.println("-------------------------------------------------");

        if (args.length > 0) {
            op = Integer.parseInt(args[0]);
        }else{
            System.out.println("\n 1. OneShot\n 2. Clasico\n 3. Custom\n 0. Salir");
            System.out.print("\nElija una opcion: ");
            op = sc.nextInt();
        }

        while(op!=0 && fin==true){

            switch(op){

                case 1: //ONESHOT

                    int scoreMaq = 0;
                    int scoreUs = 0;

                    int [] ar = {1,2,3};
                    // 1--piedra / 2--papel / 3--tijeras

                    int random = (int) (Math.random() * ar.length) + 1;

                    System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                    System.out.print("\nElija una opcion: ");
                    int elec1 = sc.nextInt();

                    while(elec1!=1 && elec1!=2 && elec1!=3){
                        System.out.println("\nEsta opcion NO ES VALIDA!");

                        System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                        System.out.print("\nElija una opcion VALIDA: ");
                        elec1 = sc.nextInt();
                    }

                    while(elec1==random){

                        System.out.println("Ha sido empate!");

                        if(random==1){
                            System.out.println("Los dos sacasteis PIEDRA.");
                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        }

                        if(random==2){
                            System.out.println("Los dos sacasteis PAPEL.");
                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        }

                        if(random==3){
                            System.out.println("Los dos sacasteis TIJERA.");
                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                        }

                        System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                        System.out.print("\n Elija una opcion: ");
                        elec1 = sc.nextInt();

                    }

                    switch(elec1){

                        case 1:

                            if(random == 2){
                                System.out.println("Perdiste, la maquina saco PAPEL");
                                scoreMaq++;
                            }

                            if(random == 3){
                                System.out.println("Ganaste, la maquina saco TIJERAS");
                                scoreUs++;
                            }

                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);

                            break;

                        case 2:

                            if(random == 1){
                                System.out.println("Ganaste, la maquina saco PIEDRA");
                                scoreUs++;
                            }

                            if(random == 3){
                                System.out.println("Perdiste, la maquina saco TIJERAS");
                                scoreMaq++;
                            }

                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);
                            
                            break;
                        
                        case 3:

                            if(random == 1){
                                System.out.println("Perdiste, la maquina saco PIEDRA");
                                scoreMaq++;
                            }

                            if(random == 2){
                                System.out.println("Ganaste, la maquina saco PAPEL");
                                scoreUs++;
                            }

                            System.out.println("USUARIO: "+scoreUs+" | MAQUINA: "+scoreMaq);

                            break;
        
                    }

                    if(scoreUs>scoreMaq){
                        System.out.println("HAS GANADO!");
                    }else{
                        System.out.println("HAS PERDIDO!");
                    }

                    break;

                case 2: //CLASICO

                    int scoreMaq2 = 0;
                    int scoreUs2 = 0;
                    int nRondas = 0;

                    while(nRondas<3){

                        int [] ar2 = {1,2,3};
                        // 1--piedra / 2--papel / 3--tijeras

                        int random2 = (int) (Math.random() * ar2.length) + 1;

                        System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                        System.out.print("\nElija una opcion: ");
                        int elec2 = sc.nextInt();

                        while(elec2!=1 && elec2!=2 && elec2!=3){
                            System.out.println("\nEsta opcion NO ES VALIDA!");

                            System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                            System.out.print("\nElija una opcion VALIDA: ");
                            elec2 = sc.nextInt();
                        }

                        while(elec2==random2){

                            System.out.println("Ha sido empate!");

                            if(random2==1){
                                System.out.println("Los dos sacasteis PIEDRA.");
                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);
                            }

                            if(random2==2){
                                System.out.println("Los dos sacasteis PAPEL.");
                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);
                            }

                            if(random2==3){
                                System.out.println("Los dos sacasteis TIJERA.");
                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);
                            }

                            System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                            System.out.print("\n Elija una opcion: ");
                            elec2 = sc.nextInt();

                        }

                        switch(elec2){

                            case 1:

                                if(random2 == 2){
                                    System.out.println("Perdiste 1 punto, la maquina saco PAPEL");
                                    scoreMaq2++;
                                    nRondas++;
                                }

                                if(random2 == 3){
                                    System.out.println("Ganaste 1 punto, la maquina saco TIJERAS");
                                    scoreUs2++;
                                    nRondas++;
                                }

                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);

                                break;

                            case 2:

                                if(random2 == 1){
                                    System.out.println("Ganaste 1 punto, la maquina saco PIEDRA");
                                    scoreUs2++;
                                    nRondas++;
                                }

                                if(random2 == 3){
                                    System.out.println("Perdiste 1 punto, la maquina saco TIJERAS");
                                    scoreMaq2++;
                                    nRondas++;
                                }

                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);
                                
                                break;
                            
                            case 3:

                                if(random2 == 1){
                                    System.out.println("Perdiste 1 punto, la maquina saco PIEDRA");
                                    scoreMaq2++;
                                    nRondas++;
                                }

                                if(random2 == 2){
                                    System.out.println("Ganaste 1 punto, la maquina saco PAPEL");
                                    scoreUs2++;
                                    nRondas++;
                                }

                                System.out.println("USUARIO: "+scoreUs2+" | MAQUINA: "+scoreMaq2);
                                
                                break;
            
                        }
                        if(nRondas==3){
                            System.out.println("Se han acabado las 3 Rondas");
                            if(scoreUs2>scoreMaq2){
                                System.out.println("HAS GANADO!");
                            }else{
                                System.out.println("HAS PERDIDO!");
                            }
                        }else{
                            System.out.println("Te quedan "+(3-nRondas)+" rondas.");
                        }
                    }

                    
                    break;



                case 3: //CUSTOM

                    System.out.print("Introduzca numero de rondas: ");
                    int n = sc.nextInt();

                    int aux=0;

                    int scoreMaq3 = 0;
                    int scoreUs3 = 0;
                    

                    while(aux<n){

                        int [] ar3 = {1,2,3};
                        // 1--piedra / 2--papel / 3--tijeras

                        int random3 = (int) (Math.random() * ar3.length) + 1;

                        System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                        System.out.print("\nElija una opcion: ");
                        int elec3 = sc.nextInt();

                        while(elec3!=1 && elec3!=2 && elec3!=3){
                            System.out.println("\nEsta opcion NO ES VALIDA!");

                            System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                            System.out.print("\nElija una opcion VALIDA: ");
                            elec3 = sc.nextInt();
                        }

                        while(elec3==random3){

                            System.out.println("Ha sido empate!");

                            if(random3==1){
                                System.out.println("Los dos sacasteis PIEDRA.");
                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);
                            }

                            if(random3==2){
                                System.out.println("Los dos sacasteis PAPEL.");
                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);
                            }

                            if(random3==3){
                                System.out.println("Los dos sacasteis TIJERA.");
                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);
                            }

                            System.out.println("\n 1. Piedra \n 2. Papel \n 3. Tijeras");

                            System.out.print("\n Elija una opcion: ");
                            elec3 = sc.nextInt();

                        }

                        switch(elec3){

                            case 1:

                                if(random3 == 2){
                                    System.out.println("Perdiste 1 punto, la maquina saco PAPEL");
                                    scoreMaq3++;
                                    aux++;
                                }

                                if(random3 == 3){
                                    System.out.println("Ganaste 1 punto, la maquina saco TIJERAS");
                                    scoreUs3++;
                                    aux++;
                                }

                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);

                                break;

                            case 2:

                                if(random3 == 1){
                                    System.out.println("Ganaste 1 punto, la maquina saco PIEDRA");
                                    scoreUs3++;
                                    aux++;
                                }

                                if(random3 == 3){
                                    System.out.println("Perdiste 1 punto, la maquina saco TIJERAS");
                                    scoreMaq3++;
                                    aux++;
                                }

                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);
                                
                                break;
                            
                            case 3:

                                if(random3 == 1){
                                    System.out.println("Perdiste 1 punto, la maquina saco PIEDRA");
                                    scoreMaq3++;
                                    aux++;
                                }

                                if(random3 == 2){
                                    System.out.println("Ganaste 1 punto, la maquina saco PAPEL");
                                    scoreUs3++;
                                    aux++;
                                }

                                System.out.println("USUARIO: "+scoreUs3+" | MAQUINA: "+scoreMaq3);
                                
                                break;            
                        }
                        if(aux==n){
                            System.out.println("Se han acabado todas Rondas");

                            if(scoreUs3>scoreMaq3){
                                System.out.println("HAS GANADO!");
                            }else if(scoreUs3<scoreMaq3){
                                System.out.println("HAS PERDIDO!");
                            }else if(scoreUs3==scoreMaq3){
                                System.out.println("HAS EMPATADO!");
                            }
                            
                        }else{
                            System.out.println("Te quedan "+(n-aux)+" rondas.");
                        }
                    }
                    break;
                
                default:
                    System.out.println("OPCION NO VALIDA!");
                    

            }

            System.out.println("\n\n¿Quieres volver a jugar? (S/n)");
            char resp = sc.next().toLowerCase().charAt(0);

            if(resp == 'n'){
                fin=false;
            }

            if(fin==true){
                System.out.println("\n 1. OneShot\n 2. Clasico\n 3. Custom\n 0. Salir");
                System.out.print("\nElija una opcion: ");
                op = sc.nextInt();
            }

        }
        sc.close();
    }
}