import java.util.Scanner;

public class caja_super2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dinero[] = new int [9];
		int precio, pago, cambio, falta;
		int i = 0;

		System.out.print("¿Cuanto vale el producto? ");
		precio = sc.nextInt();

		System.out.print("¿Cuanto dinero da el cliente? ");
		pago = sc.nextInt();

		cambio = pago - precio;
		falta = precio - pago;

		if (pago < precio){
			System.out.println("\nFalta dinero en el pago señor, le faltan: " + falta);
		}
		else if (pago > precio){
			System.out.println("\nSu cambio es de: " + cambio); // Decimos cuanto es el cambio

			while (cambio > 0){				//entramos en el bucle
				while(cambio - 500 >=0){	//vamos restando, si se puede, la cantidad indicada
					cambio = cambio - 500;	//le restamos el dinero al cambio
					dinero[0]++;	//le estamos dando una posicion en la array, y va sumando las veces que pasa
				}
				while(cambio - 200 >=0){
					cambio = cambio - 200;
					dinero[1]++;
				}
				while(cambio - 100 >=0){
					cambio = cambio - 100;
					dinero[2]++;
				}
				while(cambio - 50 >=0){
					cambio = cambio - 50;
					dinero[3]++;
				}
				while(cambio - 20 >=0){
					cambio = cambio - 20;
					dinero[4]++;
				}
				while(cambio - 10 >=0){
					cambio = cambio - 10;
					dinero[5]++;
				}
				while(cambio - 5 >=0){
					cambio = cambio - 5;
					dinero[6]++;
				}
				while(cambio - 2 >=0){
					cambio = cambio - 2;
					dinero[7]++;
				}
				while(cambio - 1 >=0){
					cambio = cambio - 1;
					dinero[8]++;
				}

			}

			for(i = 0;i < 9;i++){		
				if (i==0){		//En esta parte decimos la posicion de array para imprimir cuantas veces ha pasado
					System.out.println(dinero[i]+ " billetes de 500");		
				}else if(i==1){
					System.out.println(dinero[i]+ " billetes de 200");
				}
				else if(i==2){
					System.out.println(dinero[i]+ " billetes de 100");
				}
				else if(i==3){
					System.out.println(dinero[i]+ " billetes de 50");
				}else if(i==4){
					System.out.println(dinero[i]+ " billetes de 20");
				}
				else if(i==5){
					System.out.println(dinero[i]+ " billetes de 10");
				}
				else if(i==6){
					System.out.println(dinero[i]+ " billetes de 5");
				}
				else if(i==7){
					System.out.println(dinero[i]+ " monedas de 2");
				}
				else if(i==8){
					System.out.println(dinero[i]+ " monedas de 1");
				}
			}
		}
		else if (cambio == 0){
			System.out.println("\nEl pago ha sido exacto, no hay cambio");
		}
		
	}
}