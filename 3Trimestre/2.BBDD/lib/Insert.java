package lib;

import java.sql.Date;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) throws SQLException {

		String tabla = "persona";
		int id = 5; // Must be auto-generated
        String nombre = "Gabri";
        String apellido = "Rodriguez";
        Date fecha = new Date(0);
		
        conexion.Conectar();
		conexion.EjecutarUpdate(
			"INSERT INTO "+tabla+
			" (ID, NOMBRE, APELLIDO, FECHA) VALUES ('"+
	        id+"', '"+nombre+"', '"+apellido+"', '"+fecha+"');"
        );
	}

}
