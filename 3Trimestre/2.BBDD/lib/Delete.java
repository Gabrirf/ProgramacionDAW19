package lib;

import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) throws SQLException {
		String tabla = "persona";
		String id = "3";
		
		conexion.Conectar();
		conexion.EjecutarUpdate("delete from "+tabla+" where ID = '"+id+"'");
	}
}
