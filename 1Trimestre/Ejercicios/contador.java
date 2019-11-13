import java.util.Scanner;

public class contador{
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		while (num1 < 10){
			System.out.println(num1 + "," + num2 + "," + num3);
			num3++;

			if (num3 == 10){	//Vamos sumando el num2 cuando num3 llega a 9 
				num2++;			// y reestablecemos num3 a 0
				num3 = 0;
			}
			
			if (num2 == 10 ){	//vamos sumando num3 cuando num2 es igual a 9
				num1++;			// y reestablecemos num2 y num3 
				num2 = 0;
				num3 = 0;
			}
		}
	}
}