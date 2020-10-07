package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bbdd.conexion;
import beans.User;

public class Users {
	
	public ArrayList<User> getAllUsers() {
		ResultSet resultados = conexion.EjecutarSentencia("SELECT * FROM usuarios");
		ArrayList<User> usuarios = new controlador.Helper().ResultSet2ArrayList(resultados);
		return usuarios;
	}
	
	public boolean checkUserAndPass(String user, String password) {
		ResultSet usuarioBD = conexion.EjecutarSentencia("SELECT * FROM usuarios WHERE USER='"+user+"' AND PASSWORD='"+password+"'");
		
		try {
			return usuarioBD.next();
		} catch (SQLException e) {
			return false;
		}
	}
	

}
