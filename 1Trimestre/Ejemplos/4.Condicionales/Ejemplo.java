public class Ejemplo{
	public static void main(String[] args) {
		int edad = 10;
		if(edad < 0){
			System.out.println("How it's possible ?? :O");
		}else if(edad >= 18){
			if( edad >= 80){
				System.out.println("Anciano");
			}else{
				System.out.println("Adulto");
			}
		}else{
			System.out.println("Baby");
		}
	}
}