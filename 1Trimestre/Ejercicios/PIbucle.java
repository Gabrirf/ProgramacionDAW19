import java.util.Scanner;

public class PIbucle{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.print("Introduce un numero ");
		int n = sc.nextInt();

//
			while(n!=0){
				
				if(n%2==0){
					System.out.println(n+" es par.");
				}else{
					System.out.println(n+" es impar.");
				}
				System.out.print("Introduce un numero ");
					n = sc.nextInt();
				
			}
			System.out.println("Es cero.");

		}
	
}