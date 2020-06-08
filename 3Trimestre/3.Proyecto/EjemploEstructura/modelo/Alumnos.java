package modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.Alumno;

public class Alumnos {
	
	public void insertarAlumno(Alumno alumno) {
		String nombre = alumno.getNombre();
		Date fechaNacimiento = alumno.getFechaNacimiento();

		conexion.EjecutarUpdate("INSERT INTO alumnos (nombre) VALUES ('"+nombre+"');");
	}
	
	public Alumno recogerAlumno(String nombreAlumno) {
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM alumnos WHERE nombre='"+nombreAlumno+"';");
		try {
			if(resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				Date fechaNacimiento = resultado.getDate("fecha_nacimiento");
				Alumno alumnoRecogido = new Alumno(id, nombre, fechaNacimiento);
				return alumnoRecogido;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}
	
	public ArrayList<Alumno> recogerTodosAlumnos(){
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		ResultSet resultado = conexion.EjecutarSentencia("SELECT * FROM alumnos;");
		try {
			while(resultado.next()) {
				int id = resultado.getInt("id");
				String nombre = resultado.getString("nombre");
				Date fechaNacimiento = resultado.getDate("fecha_nacimiento");
				alumnos.add(new Alumno(id, nombre, fechaNacimiento));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alumnos;
	}

}
