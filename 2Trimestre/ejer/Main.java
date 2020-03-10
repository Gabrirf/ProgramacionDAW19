import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrera carrera = new Carrera();
        carrera.setDistancia(1000);

        carrera.addGalgo(new Galgo("Felipe", 100, carrera.getDistancia()));
        carrera.addGalgo(new Galgo("Rodolfo", 80, carrera.getDistancia()));
        carrera.addGalgo(new Galgo("Ralf", 120, carrera.getDistancia()));
        carrera.addGalgo(new Galgo("Row", 100, carrera.getDistancia()));

        //MENU
        System.out.println("1. ANADIR\n2. ELIMINAR\n3. LISTAR\n4. COMENZAR\n5. PRUEBA\n0. SALIR");
        int elec = sc.nextInt();
        while(elec==1 || elec==2 || elec==3 || elec==4 || elec==5){
            
            switch(elec){
                case 1:
                    System.out.print("Introduzca nombre del Galgo: ");
                    sc.nextLine();
                    String nombreNew = sc.nextLine();
                    System.out.print("Introduzca la velocidad en m/s: ");
                    int vel = sc.nextInt();
                    carrera.addGalgo(new Galgo(nombreNew, vel, carrera.getDistancia()));
                    carrera.imprimirListaGalgos();
                    break;
                case 2:
                    carrera.imprimirListaGalgos();
                    System.out.println("Introduzca nombre del Galgo: ");
                    sc.nextLine();
                    String nombreDel = sc.nextLine();
                    carrera.deleteGalgo(nombreDel);
                    carrera.imprimirListaGalgos();
                    break;
                case 3:
                case 4:
                case 5:
            }

            System.out.println("1. ANADIR\n2. ELIMINAR\n3. LISTAR\n4. COMENZAR\n5. PRUEBA\n0. SALIR");
            elec = sc.nextInt();

        }

        carrera.imprimirListaGalgos();

        carrera.startCarrera();

        sc.close();
    }
}