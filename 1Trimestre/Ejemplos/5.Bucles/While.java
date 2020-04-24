public class While{
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		boolean control = true;

		while(n1 < 10){
			//n++; // n = n + 1 --> n += 1;
			System.out.println("Este se ejecuta por "+(++n1)+" vez");
		}
		while(control){
			System.out.println("Este se ejecuta por "+(++n2)+" vez");
			if(n2 > 6){
				control = false;
			}
		}
	}
}