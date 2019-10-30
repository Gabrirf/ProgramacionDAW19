public class Clase{
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int edad = 10;
		System.out.println(""+a+b);
		System.out.println(""+(a+b));
		System.out.println(args[0]+" "+args[1]);
		if(edad >= 18){
			if( edad >= 80){
				System.out.println("Anciano");
			}else{
				System.out.println("Adulto");
			}
		}else if(edad < 0){
			System.out.println("How it's possible ?? :O");
		}else{
			System.out.println("Baby");
		}
	}
}