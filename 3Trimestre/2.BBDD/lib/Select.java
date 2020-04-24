package lib;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	public static void main(String[] args) throws SQLException {
		conexion.Conectar();
		ResultSet selectAll = conexion.EjecutarSentencia("select * from persona");
				
		while(selectAll.next()){
			int id = selectAll.getInt("id");
            String nombre = selectAll.getString("nombre");
            String apellido = selectAll.getString("apellido");
            Date fecha = selectAll.getDate("fecha");
            System.out.println(id + ") " + nombre +" "+ apellido + " nacido el " + fecha);
		}
		
		String campo = "nombre";
		String condicion = "2";
		ResultSet selectWhere = conexion.EjecutarSentencia("select "+campo+" from persona where id = '"+condicion+"'");
		
		while(selectWhere.next()){
			System.out.println(selectWhere.getString("nombre"));
		}
	}
}
