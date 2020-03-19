package pruebas;

import java.util.concurrent.ThreadLocalRandom;

public class Funciones {

	public static void main(String[] args) {
		
	}
	
	// Función 1
	public static boolean numeroDivisible(int numero) {
		if(numero%3==0) {
			return true;
		}else {
			return false;
		}
	}
	
	// Función 2
	public static boolean numeroIntervalo(int numero) {
		if(numero>=100 && numero<=200) {
			return true;
		}else {
			return false;
		}
	}
	
	// Función 3
	public static int numeroDivisible2(int numero) {
		int numeroDelIntervalo = ThreadLocalRandom.current().nextInt(100, 200 + 1);
		if(numero%3==0 && numero%numeroDelIntervalo==0) {
			return numero/numeroDelIntervalo;
		}else {
			return 0;
		}
	}

	// Función 4
	public static String cadenas(String nombre1, String nombre2, String nombre3){
		String cadena = nombre1+nombre2+nombre3;
		String cadenaNoMayusculas = cadena.replaceAll("[A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z]", "");
		String cadenaNoVocales = cadenaNoMayusculas.replaceAll("[a,e,i,o,u]", "");
		return cadenaNoVocales;
	}

	// Función 5
	public static int sumaNumerosCadena(String cadena){
		char[] cadenaDividida = cadena.toCharArray();
		int suma=0;
		for(int i=0; i<cadenaDividida.length;i++){
			if(Character.isDigit(cadenaDividida[i])){
				suma+= Character.getNumericValue(cadenaDividida[i]);
			}
		}
		return suma;
	}

	//Función 6
	public static double[] modArrayDoubles(double[] factores) {
        double z = 2;
        for(int i=0;i<factores.length;i++){
            if(i%2==0){
                factores[i] = factores[i]*z; 
            }else{
                factores[i] = Math.pow(factores[i],z);   
            }
        }
        return factores;
	}
	
	//Función 7
	public static void recorte(String[] palabra) {
        for (int i = 0; i < palabra.length; i++) {
            for (int y = 0; y < palabra[i].length(); y++) {
                if (y >= 2 && y <= 5) {
                System.out.print(palabra[i].charAt(y));
                }
            }System.out.print(" ");
        }
    }

	//Función 8
	public static boolean trabajosTiempo(String[] alumnos, int[][] tiemposDeTrabajos){
		int tiempoASuperar = 300;
		int sumatorio = 0;
		for(int i = 0; i < alumnos.length; i++){
			sumatorio = 0;
			for(int j = 0; j < alumnos.length; j++){
				sumatorio += tiemposDeTrabajos[j][i];
			}

			if(sumatorio<=tiempoASuperar){
				return false;
			}
		}
		return true;
	}

}
