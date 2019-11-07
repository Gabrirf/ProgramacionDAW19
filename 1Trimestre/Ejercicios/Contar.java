import java.util.Scanner;



public class Contar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n ;
        int contp = 0;
        int contn = 0;
        int cont = 0;
        int contc = 0;


        while(cont<10){
            cont ++;
            System.out.println("Introduzca un numero: "); // preguntamos antes de pedir el numero dentro del bucle porque es un numero 
                                                            // determinado de veces. si fuese por control de usuario lo pondriamos al principio
            n = sc.nextInt();
            if(n<0){
                contn ++;
            }else if(n > 0){
                contp ++;
            }else{
                contc ++;
            }
        }
        System.out.println("sus numeros positivos son: "+ contp + " sus numeros negativos son: " + contn +" Los 0 introducidos son: "+ contc);
        sc.close();
    }
}