import java.util.Scanner;

public class Acertar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//----------------------------------
		int numero = (int)(Math.random()*10+1);
		int vidas = 3;
		int contpuntos = 0;
		//-------------------------------------
		System.out.print("V");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("m");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("o");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("j");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("u");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("g");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("r");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("c");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("e");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("r");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("t");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("a");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("r");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("u");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("n");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print(" ");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("n");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("u");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("m");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("e");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("r");
		try {Thread.sleep(100);} catch (Exception e) {}
		System.out.print("o ");
		try {Thread.sleep(100);} catch (Exception e) {}


		System.out.println("Tienes 3 vidas para acertar el numero");
		//----------------------------------------------------------

		for (; vidas > 0 ; ) {
			for (int intento = 0; intento == 0; ) {
				System.out.println("Introduce el numero");
				intento = sc.nextInt();
				if (intento == numero && vidas == 3){
					contpuntos = contpuntos + 500;
				}
				if (intento == numero ) {
					System.out.println("Perfe bro has ganado");
					vidas = -1;
					System.out.println("Pulsa 0 para recargar vidas");
					int m = 0;
					contpuntos = contpuntos + 100;
					m = sc.nextInt();
					if (m == 0){
						vidas = 3;
						numero = (int)(Math.random()*10+1);
					}
				}else if (intento > numero){ 
				System.out.println("El numero que buscas es menor wei");
				vidas--;
				System.out.println("Te quedan "+vidas+" vidas");
			    }else if (intento < numero){
			    	System.out.println("El numero que buscas es mayor wei");
			    	vidas--;
			    	System.out.println("Te quedan "+vidas+" vidas");
			    }
			    
			
		}
		
	}	if (vidas == 0){
		System.out.println("Has perdido :(");
		System.out.println("Has conseguido "+contpuntos+" puntos");
		
	}
	}

}
