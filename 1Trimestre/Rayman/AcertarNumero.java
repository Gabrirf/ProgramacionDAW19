import java.util.Scanner;

public class AcertarNumero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int aleatorio = (int)(Math.random()*10+1); //Con esto creamos una variables entre uno y 10 para nuestro juego
        int minumero = 0;
        int retry = 0;
        int acertado = 0;
        System.out.println("Hola bienvenido a la busqueda del numero perdido.");
        System.out.println("Tenemos los numeros del 1 al 10 y hay que encontrar cual es el numero clave");
        System.out.println("Asi que mucha suerte y ten cuidado que solo tienes 3 vidas. :)"); 
        boolean vida = true;

        for(int vidas = 2; vidas >= 0  && vida; vidas-- ){
            System.out.println("Introduce un numero: ");
            minumero = sc.nextInt();
            System.out.println("Te quedan "+(vidas)+" vidas.");
            if(minumero == aleatorio){
                System.out.println("Enhorabuena has acertado :)");
                System.out.println("¿Quieres volver a intentarlo? Si quieres volver a jugar pulsa 1.");
                acertado = sc.nextInt();
                if(acertado == 1){
                    aleatorio = (int)(Math.random()*10+1);
                    vidas = 3;
                    vida = true;
                }else if (acertado != 1){
                    vida = false;
                }                
            }else if(vidas == 0){
                System.out.println("Opps.. Se te han acabado las vidas, si quieres intentarlo de nuevo pulsa 1");
                retry = sc.nextInt();
                if(retry == 1){
                    aleatorio = (int)(Math.random()*10+1);
                    vidas = 3;
                    vida = true;
                }
            }
        }
        System.out.println("Hasta la proxima");
        //retry = sc.nextInt();
        //if(retry == 1){
    }
}