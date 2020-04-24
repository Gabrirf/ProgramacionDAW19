package clases;

public class Contacto{
	// Variables
	String nombre;
	String telefono;

	// Constructores
	public Contacto(){
		this("Desconocido", null);
	}
	public Contacto(String nombre){
		this(nombre, null);
	}
	public Contacto(int telefono){
		this("Desconocido", String.valueOf(telefono));
	}
	public Contacto(String nombre, String telefono){
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public Contacto(String nombre, int telefono){
		this(nombre, String.valueOf(telefono));
	}
    // Metodos GET
	public String getNombre(){
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;
	}

	// Metodos SET
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	// Metodos de la clase
	public void llamar(){}
	public void colgar(){}
	public void mostrar(){
		System.out.println("El contacto "+this.nombre+" tiene el numero "+this.telefono);
	}

	// toString
	@Override
	public String toString(){
		return "["+this.nombre+", "+this.telefono+"]";
	}
}     