import java.util.Scanner;
import java.util.Arrays;

public class ArrayElemento{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        System.out.print("Introduzca tamano del array: ");
        int tam = sc.nextInt();

        int pos;

        String[] array = crearArray(tam);

        imprimirArray(array);

        int n;

        while(seguir==true){
            // MENU DE SELECCION
            System.out.println("\n1. Add element\n2. Delete Element\n3. Add Custom\n4. Delete Custom\n0. Exit");
            System.out.print("Elija su opcion: ");
            int opcion = sc.nextInt();

            if(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4){
                seguir = false;
            }

            switch(opcion){

                case 1:
                    System.out.print("Introduzca numero: ");
                    n = sc.nextInt();
                    array = insertarNormal(array, n);
                    imprimirArray(array);
                    break;
                case 2:
                    array = deleteNormal(array);
                    imprimirArray(array);
                    break;
                case 3:
                    System.out.print("Introduzca numero: ");
                    n = sc.nextInt();
                    System.out.print("Introduzca posicion: ");
                    pos = sc.nextInt();
                    array = insertarCustom(array, pos, n);
                    imprimirArray(array);
                    break;
                case 4:
                    System.out.print("Introduzca posicion: ");
                    pos = sc.nextInt();
                    array = deleteCustom(array, pos);
                    imprimirArray(array);
                    break;
            }
        }

        sc.close();
    }

    //Funcion para Crear ARRAY INICIAL
    public static String[] crearArray(int tam){
        String[] array = new String[tam];
        for(int i = 0; i<tam; i++){
            array[i] = String.valueOf(i);
        }
        return array;
    }

    //Funcion para imprimir ARRAY
    public static void imprimirArray(String[] array){
        System.out.print("[ ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
            //String.valueOf(num)
        }
        System.err.print("]");
        System.out.println(" ");
    }

    //Primera Opcion del MENU (Añadir predeterminado)
    public static String[] insertarNormal(String[] array, int n){
        String[] arrayR = new String[array.length+1];
        for(int i = 0; i<array.length+1; i++){
            if(i==array.length){
                arrayR[array.length]=String.valueOf(n);
            }else{
                arrayR[i] = array[i];
            }
        }
        return arrayR;
    }

    //Segunda opcion del MENU (Eliminar predeterminado)
    public static String[] deleteNormal(String[] array){
        String[] arrayR = new String[array.length-1];
        for(int i = 0; i<array.length-1; i++){
                arrayR[i] = array[i];
        }
        return arrayR;
    }

    //Tercera opcion del MENU (Añadir personalizado)
    public static String[] insertarCustom(String[] array, int pos, int n){
        String[] arrayR = new String[array.length+1];
        String aux;
        for(int i = 0; i<array.length; i++){
            if(i>=pos){
                aux = array[i];
                if(i==pos){
                    arrayR[i]=String.valueOf(n);
                }
                arrayR[i+1]=aux;
            }else{
                arrayR[i] = array[i];
            }
        }
        return arrayR;
    }

    //Cuarta opcion del MENU (Añadir personalizado)
    public static String[] deleteCustom(String[] array, int pos){
        String[] arrayR = new String[array.length-1];
        String aux;
        for(int i = 0; i<arrayR.length; i++){
            if(i>=pos){
                aux = array[i];
                if(i==pos){
                    arrayR[i]=array[i+1];
                }
                arrayR[i+1]=aux;
            }else{
                arrayR[i] = array[i];
            }
        }
        return arrayR;
    }

}