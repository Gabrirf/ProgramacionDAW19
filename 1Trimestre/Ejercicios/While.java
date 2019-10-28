public class While{
	public static void main(String[] args) {
		int n = 0;
		boolean control = true;
		
		while(control){
		//while(n<10){
			//n++; //n = n + 1 --> n += 1;
			System.out.println("estes se ejecuta "+(++n)+" "); //si pusiera n++ en vez de "n" dicho bucle empezaria desde 0 en vez de desde 1 que es lo que nos combiene en cuanto a eficacia.
			if(n>6){
				control = false;
				//break;
			}
		}														// ++n lo que hace es incrementar desd eel inicio uno directamente para que dicho bucle si empiece desde 0.
	}
}
 		
//bucle con while.
// hay que tener en cuneta el valor que le damos a "n".




