package clases;

public class Persona {
	String nombre;
	boolean vivo;

	public Persona(String nombre){
		this.nombre = nombre;
		this.vivo = true;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public boolean disparar(Pistola pistola){
		this.vivo = !pistola.disparar();
		return !this.vivo;
	}
}