/**
    Compile: javac -classpath mysql-connector-java-5.1.48.jar simple/Simple.java
    Execute: java -classpath .:mysql-connector-java-5.1.48.jar simple.Simple
 */
package simple;

import java.sql.*;
import com.mysql.jdbc.Driver;

public class Simple {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
    	
    	String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String dbName = "prueba";
    	String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
        String user = "admin";
        String pass = "admin";
        String driver = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(driver);
		Connection conexion = DriverManager.getConnection(url, user, pass);
		if(conexion != null)
			System.out.println("Conexion establecida");
    }
}