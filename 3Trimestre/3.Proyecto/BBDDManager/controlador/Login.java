package controlador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import beans.User;

public class Login {
	
	public void checkUser(String user, String password) {
		// Recoger los usuarios
		boolean check = new modelo.Users().checkUserAndPass(user, password);
		if(check) {
			JOptionPane.showMessageDialog(null, "Usuario correcto");
		}else { // Sino error
			JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		}
	}
	
	public boolean checkUserOld(String user, String password) {
		// Recoger los usuarios
		ArrayList<User> usuarios = new modelo.Users().getAllUsers();
		// Comprobar si usuario y contraseña son correctos
		for(User usuario : usuarios) {
			if(user.equals(usuario.getUser()) && password.equals(usuario.getPassword())) {
				JOptionPane.showMessageDialog(null, "Usuario correcto");
			}else { // Sino error
				JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			}
		}
		
		
		
		return true;
	}
	
	public void createTable(String name) {
		ArrayList<String[]> columns = new ArrayList<String[]>();
		String[] column0 = {"id", "int"};
		String[] column1 = {"user", "varchar(25)"};
		String[] column2 = {"password", "varchar(25)"};
		columns.add(column0);
		columns.add(column1);
		columns.add(column2);
		
		new modelo.Table().createTable(name, columns);
	}
	
	public void insertUser(String user, String password) {
		new modelo.Table().insertUser(user,password);
	}
	
	public void deleteUser(String user) {
		new modelo.Table().deleteUser(user);
	}

}
