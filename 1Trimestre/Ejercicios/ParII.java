import java.util.Scanner;

public class ParII{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
            
        boolean control = true;
        System.out.println("introduzca un numero");   
        
	    while(control){
          System.out.println("introduzca un numero");                                                       // REPITO CODIGO YA QUE SI NO VUELBO A HACER LA PREGUNTA ENTRA EN UN BUCLE INFINITO
        
          System.out.println("si desea cerrar el programa introduzca 0");
           a = sc.nextInt();
          
          if(a/2 == 0){
              System.out.println("Su numero es par");
          }else{
              System.out.println("su numero es impar");
          }
          if(a==0){
              control = false;
          }
		}


	}	
}	