import java.util.*;

public class PiedraPapelTijera2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu = 0;
        int rondaps = 0;
        int marcadorh = 0;
        int marcadorm = 0;
        int ronda = 1;
        int eleccion = 0;
        int piedra = 1;
        int papel = 2;
        int tijera = 3;
        int menuu = 1;
        int retry = 0;

        while (menuu == 1) {
            System.out.println("************************************************");
            System.out.println("* Bienvenido al juego de Piedra Papel o Tijera *");
            System.out.println("************************************************");
            System.out.println("Elija una de las siguientes opciones de juego:");
            System.out.println("1. One Shot");
            System.out.println("2. Clasico");
            System.out.println("3. Personalizado");
            System.out.println("0. Salir");
            menu = sc.nextInt();

            if (menu != 1 && menu != 2 && menu != 3 && menu != 0) {
                System.out.println("Introduce una opcion del menu valida");
                menuu = 1;

            } else {
                menuu = 2;
            }
        }

        // --------------------------MODO ONE
        // SHOT---------------------------------------------------------------------
        while (menu == 1) {
            boolean opcion1 = true;
            while (opcion1) {
                System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                System.out.println("Ronda " + ronda);
                System.out.println("Elija un movimiento:");
                System.out.println("        1. Piedra");
                System.out.println("        2. Papel");
                System.out.println("        3. Tijera");
                eleccion = sc.nextInt();
                if (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("Selecciona una de las opciones");
                } else if (eleccion == 1) { // PIEDRA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == piedra) {
                        System.out.println("Piedra vs Piedra --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == papel) {
                        System.out.println("Piedra vs Papel --> Gana papel");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Piedra vs Tijera --> Gana piedra");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                } else if (eleccion == 2) { // PAPEL
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == papel) {
                        System.out.println("Papel vs Papel --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Papel vs Piedra --> Gana papel");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    } else {
                        System.out.println("Papel vs Tijera --> Gana tijera");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    }
                } else if (eleccion == 3) { // TIJERA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == tijera) {
                        System.out.println("Tijera vs Tijera --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Tijera vs Piedra --> Gana piedra");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Tijera vs Papel --> Gana tijera");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                }
                if (marcadorh == 1) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado el jugador");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                } else if (marcadorm == 1) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado la maquina");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                }

            }
        }
        // ----------------------------------MODO
        // CLASICO---------------------------------------------------------------------
        while (menu == 2) {
            boolean opcion1 = true;
            while (opcion1) {
                System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                System.out.println("Ronda " + ronda);
                System.out.println("Elija un movimiento:");
                System.out.println("        1. Piedra");
                System.out.println("        2. Papel");
                System.out.println("        3. Tijera");
                eleccion = sc.nextInt();
                if (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("Selecciona una de las opciones");
                } else if (eleccion == 1) { // PIEDRA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == piedra) {
                        System.out.println("Piedra vs Piedra --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == papel) {
                        System.out.println("Piedra vs Papel --> Gana papel");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Piedra vs Tijera --> Gana piedra");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                } else if (eleccion == 2) { // PAPEL
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == papel) {
                        System.out.println("Papel vs Papel --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Papel vs Piedra --> Gana papel");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    } else {
                        System.out.println("Papel vs Tijera --> Gana tijera");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    }
                } else if (eleccion == 3) { // TIJERA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == tijera) {
                        System.out.println("Tijera vs Tijera --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Tijera vs Piedra --> Gana piedra");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Tijera vs Papel --> Gana tijera");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                }
                if (marcadorh > marcadorm && ronda == 4) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado el jugador");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                } else if (marcadorm > marcadorh && ronda == 4) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado la maquina");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                }

            }
        }
        // ----------------------------------------MODO
        // PERSONALIZADO---------------------------------------------------------
        while (menu == 3) {
            boolean opcion1 = true;
            System.out.println("Introduzca el numero de rondas que desea jugar:");
            rondaps = sc.nextInt();
            while (opcion1) {
                System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                System.out.println("Ronda " + ronda);
                System.out.println("Elija un movimiento:");
                System.out.println("        1. Piedra");
                System.out.println("        2. Papel");
                System.out.println("        3. Tijera");
                eleccion = sc.nextInt();
                if (eleccion != 1 && eleccion != 2 && eleccion != 3) {
                    System.out.println("Selecciona una de las opciones");
                } else if (eleccion == 1) { // PIEDRA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == piedra) {
                        System.out.println("Piedra vs Piedra --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == papel) {
                        System.out.println("Piedra vs Papel --> Gana papel");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Piedra vs Tijera --> Gana piedra");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                } else if (eleccion == 2) { // PAPEL
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == papel) {
                        System.out.println("Papel vs Papel --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Papel vs Piedra --> Gana papel");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    } else {
                        System.out.println("Papel vs Tijera --> Gana tijera");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    }
                } else if (eleccion == 3) { // TIJERA
                    int maquina = (int) (Math.random() * 3 + 1);
                    if (maquina == tijera) {
                        System.out.println("Tijera vs Tijera --> Empate");
                        System.out.println("Se repite la ronda");
                    } else if (maquina == piedra) {
                        System.out.println("Tijera vs Piedra --> Gana piedra");
                        System.out.println("Punto para la maquina");
                        marcadorm++;
                        ronda++;
                    } else {
                        System.out.println("Tijera vs Papel --> Gana tijera");
                        System.out.println("Punto para el jugador");
                        marcadorh++;
                        ronda++;
                    }
                }
                if (marcadorh > marcadorm && ronda == rondaps + 1) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado el jugador");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                } else if (marcadorm > marcadorh && ronda == rondaps + 1) {
                    System.out.println("Resultado final:");
                    System.out.println("Humano: " + marcadorh + " | Maquina: " + marcadorm);
                    System.out.println("Ha ganado la maquina");
                    System.out.println("¿Quieres volver a jugar? Pulsa 1 para repetir y 2 para salir.");
                    retry = sc.nextInt();
                    if (retry == 2) {
                        opcion1 = false;
                        menu = 0;

                    } else if (retry == 1) {
                        marcadorh = 0;
                        marcadorm = 0;
                        ronda = 1;
                    }
                }

            }
        }
        // ---------------------------------------------SALIR-------------------------------------------------------
        if (menu == 0) {
            System.out.println("Hasta luego companeiro :)");
        }
    }
}