package controlador;

import java.sql.Date;

import javax.swing.JOptionPane;

import beans.Alumno;
import modelo.Alumnos;
import vista.Principal;

public class Central {
	
	public void saludar(String nombre) {

		/* Recoger alumno */
		Alumno alumnoRecogido = new Alumnos().recogerAlumno(nombre);
		if(alumnoRecogido != null) {			
			JOptionPane.showMessageDialog(null, "Hola "+alumnoRecogido.getNombre());
		}else {
			int opcion = JOptionPane.showConfirmDialog(null, "No se ha encontrado alumno\n ¿Desea guardarlo?");
			if(opcion == 0) {
				/* Insertar alumno */
				Alumno alumno = new Alumno(0, nombre, new Date(System.currentTimeMillis()));
				new Alumnos().insertarAlumno(alumno);
			}
			
		}
		
	}
}
