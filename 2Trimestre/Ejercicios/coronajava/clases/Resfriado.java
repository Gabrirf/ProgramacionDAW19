package clases;

public class Resfriado implements Enfermedad {

	String codigo;

	public Resfriado(String codigo){
		this.codigo = codigo;
	}

	public String getCodigo(){
		return this.codigo;
	}

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	public boolean contagiar(Persona persona){
		return false;
	}

}