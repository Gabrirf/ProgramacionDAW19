public class Ejercicio1 {
    public static void main(String[] args){
        
        /* Par o impar */

        int numero = Integer.parseInt(args[0]);
        boolean par;

        if(numero % 2 == 0){
            par = true;
        }else{
            par = false;
        }

        par = numero % 2 == 0;

        System.out.println("El numero "+numero+" es par: "+par);
    }
}