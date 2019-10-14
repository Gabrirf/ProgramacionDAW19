import java.util.Scanner;

	public class Notas{

		public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);

      	int n;

        System.out.println("NOTA:");

          n= sc.nextInt();

			if( n >= 0 && n < 5){
				System.out.println("SUSPENSO");
			}else if(n==5){
				System.out.println("APROBADO");
			}else if(n==6){
				System.out.println("BIEN");
			}else if(n==7 || n==8){
				System.out.println("NOTABLE");
			}else if(n==9){
				System.out.println("SOBRESALIENTE");
			}else if(n==10){
				System.out.println("MAT. HONOR");
			}else{
				System.out.println("Introduce un numero del 0 al 10.");
			}
		}
	}