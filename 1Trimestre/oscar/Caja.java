import java.util.Scanner;

public class Caja{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dinerocaja = 0;
		double importe = 0;
		double dinerocliente = 0;
		double devolucion = 0;
		int n500 = 0;
		int n200 = 0;
		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int n5 = 0;
		int n2 = 0;
		int n1 =0;
		int n050 = 0;
		int n020 = 0;
		int n010 = 0;
		int n05 = 0;
		int n02 = 0;
		int n01 = 0;
		//int eleccion = 0;
		//int z = 0;
		//----------------------------------
		//System.out.println("-Introduzca la cantidad de euros de la que dispondra la caja-");
		//dinerocaja = sc.nextInt();
		//---------------------------------
		System.out.println("-Introduzca el importe total-");
		importe = sc.nextDouble();
		System.out.println("-Introduzca el dinero que da el cliente");
		dinerocliente = sc.nextDouble();
		//----------------------------------------------------------------------------------
		if (dinerocliente > importe) {
			devolucion = dinerocliente - importe;
			System.out.println("Su cambio es "+devolucion+" euros");
			}
		while(devolucion >= 500) {
			n500++;
			devolucion = devolucion-500;
		}if (n500 != 0){System.out.println(+n500+" billetes de 500 euros");}
		while(devolucion >= 200) {
			n200++;
			devolucion = devolucion-200;
		}if (n200 != 0){System.out.println(+n200+" billetes de 200 euros");}		
		while(devolucion >= 100) {
			n100++;
			devolucion = devolucion-100;
		}if (n100 != 0){System.out.println(+n100+" billetes de 100 euros");}
		while (devolucion >= 50) {
			n50++;
			devolucion = devolucion-50;	
		}if (n50 != 0){System.out.println(+n50+" billetes de 50 euros");}
		while (devolucion >= 20) {
			n20++;
			devolucion = devolucion-20;	
		}if (n20 != 0){System.out.println(+n20+" billetes de 20 euros");}
		while (devolucion >= 10) {
			n10++;
			devolucion = devolucion-10;	
		}if (n10 != 0){System.out.println(+n10+" billetes de 10 euros");}
		while (devolucion >= 5) {
			n5++;
			devolucion = devolucion-5;	
		}if (n5 != 0){System.out.println(+n5+" billetes de 5 euros");}
		while (devolucion >= 2) {
			n2++;
			devolucion = devolucion-2;	
		}if (n2 != 0){System.out.println(+n2+" monedas de 2 euros");}
		while (devolucion >= 1) {
			n1++;
			devolucion = devolucion-1;	
		}if (n1 != 0){System.out.println(+n1+" monedas de 1 euros");}
		while (devolucion >= 0.50) {
			n050++;
			devolucion = devolucion-0.50;
		}if (n050 != 0){System.out.println(+n050+" monedas de 50 cent");}
		while (devolucion >= 0.20) {
			n020++;
			devolucion = devolucion-0.20;		
		}if (n020 != 0){System.out.println(+n020+" monedas de 20 cent");}
		while (devolucion >= 0.10) {
			n010++;
			devolucion = devolucion-0.10;
		}if (n010 != 0){System.out.println(+n010+" monedas de 10 cent");}
		while(devolucion >= 0.05) {
			n05++;
			devolucion = devolucion-0.05;
		}if (n05 != 0){System.out.println(+n05+" monedas de 5 cent");}
		while (devolucion >= 0.02) {
			n02++;
			devolucion = devolucion-0.02;
		}if (n02 != 0){System.out.println(+n02+" monedas de 2 cent");}
		while (devolucion >= 0.01 || devolucion >= 0.009) {
			n01++;
			devolucion = devolucion-0.01;
		}if (n01 != 0 || n01 < 0){System.out.println(+n01+" monedas de 1 cent");}

		}
	}
	
