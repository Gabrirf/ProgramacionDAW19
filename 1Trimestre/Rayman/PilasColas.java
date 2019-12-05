import java.util.*;

public class PilasColas{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        System.out.println("Bienvenido al Pilas y Colas");
        System.out.println("En este modo le daremos la oportunidad");
        System.out.println("de rotar las posiciones de manera :");
        System.out.println("1. Pilas");
        System.out.println("2. Colas");
        eleccion = sc.nextInt();
        int[] arrayPila = new int[5];
        int i = 0;
        int[] arrayCola = new int[5];
        
        while(eleccion == 1){
            int elegir;
            int introducirNumero;
            System.out.println("Has elegido Pilas.");
            System.out.println("Ahora selecciona una de las dos opciones: ");
            System.out.println("1. Introducir");
            System.out.println("2. Sacar");
            elegir = sc.nextInt();
            if(elegir == 1){
                if(arrayPila[0] != 0 && arrayPila[1] != 0 && arrayPila[2] != 0 && arrayPila[3] != 0 && arrayPila[4] != 0){
                    System.out.println("La pila esta llena");
                }else{
                    System.out.println(Arrays.toString(arrayPila));
                    System.out.println("Introduce el numero a introducir");
                    introducirNumero = sc.nextInt();
                    arrayPila[i] = introducirNumero;
                    i++;
                    System.out.println(Arrays.toString(arrayPila));
                }
            }else if(elegir == 2){
                if(i != 0){
                    arrayPila[i-1] = 0;
                    System.out.println(Arrays.toString(arrayPila));
                    i--;
                }else{
                    System.out.println("No puedes sacar ningun numero porque en el array");
                    System.out.println("no hay ningun valor");
                }
            }
        }
        while(eleccion == 2){
            int elige;
            int introducirNum;
            System.out.println("Has elegido Colas.");
            System.out.println("Ahora selecciona una de las dos opciones: ");
            System.out.println("1. Introducir");
            System.out.println("2. Sacar");
            elige = sc.nextInt();
            if(elige == 1){
                if(arrayCola[0] != 0 && arrayCola[1] != 0 && arrayCola[2] != 0 && arrayCola[3] != 0 && arrayCola[4] != 0){
                    System.out.println("La Cola esta llena");
                }else{
                    System.out.println(Arrays.toString(arrayCola));
                    System.out.println("Introduce el numero a introducir");
                    introducirNum = sc.nextInt();
                    arrayCola[i] = introducirNum;
                    i++;
                    System.out.println(Arrays.toString(arrayCola));
                }
            }else if(elige == 2){
                if(i != 0){
                    i--;
                    for(int c = 0; c < 4 ; c++){
                        arrayCola[c] = arrayCola[c+1];
                    }if(arrayCola[0] != 0 && arrayCola[1] != 0 && arrayCola[2] != 0 && arrayCola[3] != 0 && arrayCola[4] != 0){
                        arrayCola[4] = 0;
                    }
                    System.out.println(Arrays.toString(arrayCola));
                    
                }else{
                    System.out.println("No puedes sacar ningun numero porque en el array");
                    System.out.println("no hay ningun valor");
                }
            }
        }
    }
}