package modelo;

import java.util.ArrayList;

import bbdd.conexion;

public class Table {
	
	public void createTable(String tableName, ArrayList<String[]> columns) {
		String columnsString = "";
		for(String[] column : columns){
			columnsString += column[0]+" "+column[1]+",";
		}
		columnsString = columnsString.substring(0, columnsString.length()-1);
		
		conexion.EjecutarUpdate("CREATE TABLE "+tableName+"("+columnsString+");");
	}
	
	public void insertUser(String user, String password) {
		conexion.EjecutarUpdate("INSERT INTO usuarios (ID, USER, PASSWORD) VALUES (1, '"+user+"', '"+password+"');");
	}
	
	public void deleteUser(String user) {
		conexion.EjecutarUpdate("DELETE FROM usuarios WHERE USER = '"+user+"';");
	}

}
