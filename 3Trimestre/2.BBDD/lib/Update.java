package lib;

import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws SQLException {
		String tabla = "persona";
		String campo = "apellido";
		String id = "2";
		String valor = "Rivera";
		
		conexion.Conectar();
		conexion.EjecutarUpdate("UPDATE "+tabla+" SET "+campo+" = '"+valor+"' Where ID = '"+id+"'");
	}
}
