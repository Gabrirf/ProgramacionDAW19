package main;

import java.awt.EventQueue;
import java.sql.ResultSet;
import java.sql.SQLException;

import bbdd.conexion;
import vista.Login;

public class Main {

	public static void main(String[] args) throws SQLException{
		/* Conecto con la base de datos */
		conexion.Conectar();
		
		/* Arranco la interfaz gr�fica */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
