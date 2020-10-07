package beans;

import java.sql.Date;

public class Alumno {

	private int id;
	private String nombre;
	private Date fechaNacimiento;
	
	public Alumno() {}
	public Alumno(int id, String nombre, Date fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getId() {
		return id;
	}

}
