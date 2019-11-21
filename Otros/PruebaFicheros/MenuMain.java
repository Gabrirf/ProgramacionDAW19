import java.util.Scanner;
import paquete1.Funciones;

public class MenuMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nBIENVENIDOS!");
        System.out.println(" 1. Duplicar\n 2. Maximo entre 2\n 3. Minimo entre 2\n 4. Maximo de un Array\n 5. Minimo de un Array\n 0. Salir");
        System.out.print("Elija una opcion: ");
        int op = sc.nextInt();
        System.out.println(" ");

        while(op==1 || op==2 || op==3 || op==4 || op==5){

            switch(op){
                case 1:
                    System.out.print("Introduzca un numero:");
                    int n = sc.nextInt();
                    System.out.println("El resultado es: "+Funciones.duplicar(n));
                    break;
    
                case 2:
                    System.out.print("Introduzca 1er numero: ");
                    int a = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("Introduzca 2o numero: ");
                    int b = sc.nextInt();
    
                    System.out.println("El mayor es: "+Funciones.mayor(a, b));
                    break;
    
                case 3:
                    System.out.print("Introduzca 1er numero: ");
                    a = sc.nextInt();
                    System.out.println(" ");
                    System.out.print("Introduzca 2o numero: ");
                    b = sc.nextInt();
    
                    System.out.println("El menor es: "+Funciones.menor(a, b));
                    break;
    
                case 4:
    
                    System.out.print("Cuantos numero deseas examinar: ");
                    int lon = sc.nextInt();
                    System.out.println(" ");
    
                    int[] ar = new int[lon];
                    
                    System.out.println("Escribe "+lon+" numeros: ");
    
                    for(int i=0; i<ar.length; i++ ) {
                        ar[i] = sc.nextInt();
                    }
    
                    System.out.println("El mayor de los numeros introducidos es: "+Funciones.maxAr(ar));
    
                    break;
    
                case 5:
                    System.out.print("Cuantos numero deseas examinar: ");
                    lon = sc.nextInt();
                    System.out.println(" ");
    
                    ar = new int[lon];
                    
                    System.out.println("Escribe "+lon+" numeros: ");
    
                    for(int i=0; i<ar.length; i++ ) {
                        ar[i] = sc.nextInt();
                    }
    
                    System.out.println("El mayor de los numeros introducidos es: "+Funciones.minAr(ar));
                    break;

            }

            System.out.println("\nBIENVENIDOS!");
            System.out.println(" 1. Duplicar\n 2. Maximo entre 2\n 3. Minimo entre 2\n 4. Maximo de un Array\n 5. Minimo de un Array\n 0. Salir");
            System.out.print("Elija una opcion: ");
            op = sc.nextInt();
            System.out.println(" ");
            
        }
        System.out.println("Gracias por su tiempo!");
        sc.close();
    }
}