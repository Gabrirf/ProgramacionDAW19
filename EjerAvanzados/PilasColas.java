import java.util.Scanner;
import java.util.Arrays;

public class PilasColas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {" ", " ", " ", " ", " "};
        System.out.println("BIENVENIDOS!");
        imprimirAr(array);
        System.out.println("MENU DE SELECCION: ");
        System.out.println("1. Pila\n2. Cola\n0. Exit");
        System.out.print("Elija su opcion: ");
        int elec = sc.nextInt();

        int op = 1;
        int num;

        //Juego
        while(elec == 1 || elec == 2){
            int cont = 0;
            switch(elec){
                case 1://PILA
                    while(op == 1 || op ==2){
                        System.out.println("\n1. Insertar\n2. Retirar\n0. Exit");
                        System.out.print("Elija su opcion:");
                        op = sc.nextInt();
                        switch(op){
                            case 1://Insert
                                if(cont<array.length){
                                    System.out.print("Introduzca su numero: ");
                                    num = sc.nextInt();
                                    imprimirAr(insertarNum(num, array));
                                    cont++;
                                }else{
                                    System.out.println("Esta LLENO!");
                                }
                                break;
                            case 2://Sacar
                                if(cont!=0){
                                    imprimirAr(sacar1(array, cont));
                                    cont--;
                                }else{
                                    System.out.println("Esta VACIO!");
                                }
                                break;
                        }
                    }
                    break;

                case 2://COLA
                    while(op == 1 || op ==2){
                        System.out.println("\n1. Insertar\n2. Retirar\n0. Exit");
                        System.out.print("Elija su opcion:");
                        op = sc.nextInt();
                        switch(op){
                            case 1://Insert
                                if(cont<array.length){
                                    System.out.print("Introduzca su numero: ");
                                    num = sc.nextInt();
                                    imprimirAr(insertarNum(num, array));
                                    cont++;
                                }else{
                                    System.out.println("Esta LLENO!");
                                }
                                break;
                            case 2://Sacar
                                if(cont!=0){
                                    imprimirAr(sacar2(array, cont));
                                    cont--;
                                }else{
                                    System.out.println("Esta VACIO!");
                                }
                                break;
                        }
                    }
                    break;
            }

            if(op != 1 || op !=2){
                elec=0;
            }else{
                System.out.println("MENU DE SELECCION: ");
                System.out.println("1. Pila\n2. Cola\n0. Exit");
                System.out.print("Elija su opcion: ");
                elec = sc.nextInt();
            }
        }
        System.out.println("Gracias por su tiempo!");
        sc.close();

    }

    public static void imprimirAr(String[] array){
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.err.print("]");
        System.out.println(" ");
    }

    public static String[] insertarNum(int num, String[] array){
        String aux;
        for(int i = 0; i<array.length-1; i++){
            aux=array[1+i];
            array[1+i]=array[0];
            array[0]=aux;  
        }
        array[0] = String.valueOf(num);
        return array;
    }

    public static String[] sacar1(String[] array, int cont){
        array[cont-1] = " ";
        return array;
    }

    public static String[] sacar2(String[] array, int cont){
        String aux;
        array[0] = " ";
        for(int i = 0; i<cont-1; i++){
            aux=array[i+1];
            array[i]=aux;
        }
        array[cont-1] = " ";
        return array;
    }

}