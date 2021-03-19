package clases;

public interface Enfermedad {

	public boolean contagiar(Persona persona);

	public void setCodigo(String codigo);
	public String getCodigo();

}