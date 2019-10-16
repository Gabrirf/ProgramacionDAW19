import java.util.Scanner;

public class Cfecha{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Day:");
		int d=sc.nextInt();

		System.out.println("Month:");
		int m=sc.nextInt();

		System.out.println("Year:");
		int y=sc.nextInt();

		if(d>=1 && d<=30 && m>=1 && m<=12){
			System.out.println("Good Date");
		}else{
			System.out.println("Bad Date");
		}
	}
}