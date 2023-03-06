package Java11.chapterXX_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 	Which action can be used to load a databae driver by using JDBC 3.0?
 	A. Use the java.lang.Class.forName method to load the driver class. 
 	B. Add the driver class to the META-INF/services folder of the JAR file.
 	C. Include the JDBC driver class in a jdbc.properties file.
 	D. Use the DriverManager.getDrvier method to load the driver class.
*/

public class DatabaseApplication {

	private static final String port = "3306";
	private static final String schema = "test";
	private static final String username = "root";
	private static final String password = "1234";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		java.lang.Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(String.format("jdbc:mysql://localhost:%s/%s", port, schema), username, password);
				

	}
}
