package clases;

public class Contacto{
	String nombre;
	String telefono;

	public Contacto(){
		this("Desconocido", null);
	}
	public Contacto(String nombre){
		this(nombre, null);
	}
	public Contacto(String nombre, String telefono){
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public Contacto(String nombre, int telefono){
		this(nombre, String.valueOf(telefono));
	}

	public String getNombre(){
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public void llamar(){}
	public void colgar(){}
}     