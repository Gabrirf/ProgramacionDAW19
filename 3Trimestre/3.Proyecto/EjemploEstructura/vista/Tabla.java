package vista;

import java.awt.BorderLayout;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

import beans.Alumno;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public Tabla(ArrayList<Alumno> alumnos) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		/* Crear la tabla con su modelo */
		DefaultTableModel dtm = new DefaultTableModel();
		table = new JTable(dtm);
		contentPane.add(table, BorderLayout.CENTER);
		/* Crear las columnas */
		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("FechaNacimiento");
		/* Rellenar los datos con el array de alumnos */
		for(Alumno alumno : alumnos) {
			Object[] fila = new Object[3];
			fila[0] = alumno.getId();
			fila[1] = alumno.getNombre();
			fila[2] = alumno.getFechaNacimiento();
			dtm.addRow(fila);			
		}
		
		
		setVisible(true);
	}

}
