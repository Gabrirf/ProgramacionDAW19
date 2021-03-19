package utils;

public class CP{
	int numero;
	float coeficiente;

	public CP(int numero, float coeficiente){
		this.numero = numero;
		this.coeficiente = coeficiente;
	}

	public int getNumero(){
		return this.numero;
	}

	public float getCoeficiente(){
		return this.coeficiente;
	}

	public String toString(){
		return "[ "+numero+", "+coeficiente+" ]";
	}
}