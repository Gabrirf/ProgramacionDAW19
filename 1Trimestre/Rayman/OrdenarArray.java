import java.util.*;

public class OrdenarArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        System.out.println("Bienvenido al programa para ordenar arrays");
        int[] arrayInt = CrearArray(10);
        System.out.println("Este es el array creado: "+Arrays.toString(arrayInt));
        System.out.println("Ahora procederemos a ordenarlo, elige como quieres ordenarlo:");
        System.out.println("1. De menor a mayor");
        System.out.println("2. De mayor a menor");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                System.out.println("Has elegido de menor a mayor.");
                int[] arrayMenosMas = MenoraMayor(arrayInt, 10);
                System.out.println("Ya esta el array ordenado.");
                System.out.println(Arrays.toString(arrayMenosMas));
                break;
        
            case 2:
                System.out.println("Has elegido de mayor a menor.");
                int[] arrayMasMenos = MayorMenor(arrayInt, 10);
                System.out.println("Ya esta el array ordenado.");
                System.out.println(Arrays.toString(arrayMasMenos));
                break;
            
            default:
                System.out.println("No has elegido ninguna opcion hasta la proxima ;)");
                break;
        }
        
    }

    public static int[] CrearArray(int size){
        //Scanner sc = new Scanner(System.in);
        int[] arrayCreado = new int[size];
        for(int i = 0; i < size; i++){
            arrayCreado[i] = (int)Math.floor(Math.random()*100+1);
        }
        return arrayCreado;
    }

    public static int[] MenoraMayor(int[] arrayMenor, int n){
        int save = 0;
        for(int i = 0; i < n-1 ; i++){
            for(int cont = 0; cont < n-1-i; cont++){
                if(arrayMenor[cont] > arrayMenor[cont+1] ){
                    save = arrayMenor[cont];
                    arrayMenor[cont] = arrayMenor[cont+1];
                    arrayMenor[cont+1] = save; 
                    //System.out.println(Arrays.toString(arrayMenor)); ****Debugger****
                }
            }
        }
        return arrayMenor;
    }

    public static int[] MayorMenor(int[] arrayMayor, int n){
        int save = 0;
        for(int i = 0; i < n-1; i++){
            for(int cont = 0; cont < n-1-i; cont++){
                if(arrayMayor[cont] < arrayMayor[cont+1]){
                    save = arrayMayor[cont+1];
                    arrayMayor[cont+1] = arrayMayor[cont];
                    arrayMayor[cont] = save;
                    //System.out.println(Arrays.toString(arrayMayor)); ****Debugger****
                }
            }
        }
        return arrayMayor;
    }
    
}


