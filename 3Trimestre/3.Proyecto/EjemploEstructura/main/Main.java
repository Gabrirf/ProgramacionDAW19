package main;

import java.awt.EventQueue;

import bbdd.conexion;
import vista.Principal;

public class Main {
	public static void main(String[] args) {
		/* Conexión con la BBDD */
		conexion.Conectar();
		
		/* LLamada a la vista principal */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
