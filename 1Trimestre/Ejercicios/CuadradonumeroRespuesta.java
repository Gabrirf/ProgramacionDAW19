import java.util.Scanner; // Esta es una forma mas simplificada de hacerlo y sin ningun if
public class CuadradonumeroRespuesta{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 1;
        int vidas = 5;

        System.out.println("Introduzca un numero: ");
        n = sc.nextInt();
        while(n != 0 && vidas > 0){ // Entrara cuando sea diferente de 0 != significa diferente
        System.out.println("La potencia de "+n+" es "+n*n);
            System.out.println("Introduzca un numero");
            n = sc.nextInt();
            vidas--;
        }if(vidas==0){
            System.out.println("Ha fallado los intentos");
        }else if(n==0){
            System.out.println("El usuario a introducido el boton de salida");
        }
    }
}