package controlador;

import java.sql.Date;
import java.util.ArrayList;

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
			/* Llamada a la otra ventana */
			new vista.VistaAlumno(alumnoRecogido);
		}else {
			int opcion = JOptionPane.showConfirmDialog(null, "No se ha encontrado alumno\n ¿Desea guardarlo?");
			if(opcion == 0) {
				/* Insertar alumno */
				Alumno alumno = new Alumno(0, nombre, new Date(System.currentTimeMillis()));
				new Alumnos().insertarAlumno(alumno);
			}
			
		}
		
	}
	
	public void verTodos() {
		/* Cargar los datos */
		ArrayList<Alumno> alumnos = new modelo.Alumnos().recogerTodosAlumnos();
		/* Abrir ventana ver todos */
		new vista.Tabla(alumnos);
	}
	
}
