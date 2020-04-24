public class Aritmeticos{
	public static void main(String[] args) {
		
		/* Operaciones básicas */
		int numero = 5;
		int negativo = -numero;
		int suma = suma + numero;
		int resta = resta - numero;
		int mult = mult * numero;
		int division = division / numero;
		int resto = resto % numero;

		/* Operaciones incrementales */
		// suma = suma + 1;
		suma++; // Primero cogemos el valor, luego sumamos
		++suma; // Primero sumamos, luego cogemos el valor
		// resta = resta - 1;
		resta--; // Primero cogemos el valor, luego restamos
		--resta; // Primero restamos, luego cogemos el valor

		/* Operaciones incrementales simplificadas */
		suma += 5;
		resta -= 5;
		mult *= 5;
		division /= 5;
		resto %= 5;

	}
}