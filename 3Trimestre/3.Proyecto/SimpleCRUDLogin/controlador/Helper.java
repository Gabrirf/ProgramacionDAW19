package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;

public class Helper {
	
	public ArrayList ResultSet2ArrayList(ResultSet resultados) {
		// Ya tengo los datos de la BBDD
		// Voy a transformarlos a objetos
		ArrayList<User> arraylist = new ArrayList<User>();
		try {
			while(resultados.next()) {
				int id = resultados.getInt("id");
				String user = resultados.getString("user");
				String password = resultados.getString("password");
				arraylist.add(new User(id, user, password));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		
		return arraylist;
	}
	
	public User resultSet2Object(ResultSet resultado){
		try {
			if(resultado.next()) {
				int id = resultado.getInt("id");
				String username = resultado.getString("user");
				String password = resultado.getString("password");
				User user = new User(id, username, password);
				return user;
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
		}
		return null;
	}

}
