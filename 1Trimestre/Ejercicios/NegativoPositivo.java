import java.util.Scanner;

public class NegativoPositivo{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Introduce un numero ");
		int n = sc.nextInt();


		if(n==0){
			System.out.println("Es cero.");
			
		}else{
//
			while(n!=0){

				if(n<0){
				System.out.println("Este numero es negativo.");

				System.out.print("Introduce un numero ");
					n = sc.nextInt();
					
				}else if(n>0){
				System.out.println("Este numero es positivo.");

				System.out.print("Introduce un numero ");
				 n = sc.nextInt();
				}
				
			}
		}
	}
}