package clases;

public class Gripe implements Enfermedad {

	String codigo;

	public Gripe(String codigo){
		this.codigo = codigo;
	}

	public String getCodigo(){
		return this.codigo;
	}

	public void setCodigo(String codigo){
		this.codigo = codigo;
	}

	public boolean contagiar(Persona persona){
		Paciente paciente = (Paciente) persona;
		return paciente.enfermar(this);
	}

	public String toString(){
		return this.codigo;
	}

}