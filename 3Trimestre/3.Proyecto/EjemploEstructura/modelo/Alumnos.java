package modelo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* Transformacion */
		return null;
	}

}
