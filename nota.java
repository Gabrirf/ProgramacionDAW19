import java.util.Scanner;

public class nota{
	public static void main(String[] args){
		Scanner nota = new Scanner(System.in);
	
		float num1 = 0;


		
		System.out.println("Damee una nota: ");
		num1 = nota.nextFloat();
		
		if(num1<1){
			System.out.println( "ni para respirar sirves");
		}else if(num1<2){
			System.out.println("para barrendero sirves");
		}else if(num1<3){
			System.out.println("mal vamos bro");
		}else if(num1<4){
			System.out.println("cagada");
		}else if(num1<5){
			System.out.println("insuficiente");
		}else if(num1< 6){
			System.out.println("suficiente");
		}else if(num1<7){
			System.out.println( "bien");
		}else if(num1<8){
			System.out.println( "notable");
		}else if(num1<9){
			System.out.println( "notable");		
		}else if (num1 == (float)9.9){
			System.out.println("No puedes pasaaaar");
		}else if(num1<10){
			System.out.println("sobre");
		}else if(num1<11){
			System.out.println("te has follado el examen");
		}
	}
}