package com.ocp.day19.connection;

/*
 	If you see the warning message of "java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver", please follow the setting below: 
		1. Visit on the website of "https://mvnrepository.com/artifact/mysql/mysql-connector-java"
		2. Select 8.0.26
		3. See the Files of jar
		4. Download it
		5. Copy the file of mysql-connector-java-8.0.26.jar into fold of lib on Eclipse IDE
		6. Right click -> Properties
		7. Java Build Path -> Libraries 
		8. Select Modulepath -> Add JARs…
		9. Select the external .jar that developer expected to install into Modulepath from fold of lib
		10. Select mysql-connector-java-8.0.26.jar
		11. Click on OK
		12. Click on Apply and Close
		13. Done!
		
		refer to the image of "Java Building Path.png" and "location of jar.png"

*/


import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class TestConnection4MySQL {

	static Connection getDB() {
		// Following information shall NOT be uploaded to Github  !!!
		// If needed, please have those critical info to be encrypted!
		String url = "jdbc:mysql://localhost:xxxxx/xxxxx?useUnicode=true&characterEncoding=utf-8";
		String user = "xxxxx";
		String password = "xxxxx";

		Connection connection = null;
		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);		
			System.out.println("Connection successfully, because receive instance of Connection: " + connection);			
			String sql4update = "update SQL4javaWebEE.SQL4javaWebEE set name = 'James' where badge = 1";
			PreparedStatement preparedStatement = connection.prepareStatement(sql4update);					
			preparedStatement.executeUpdate();			
			
		} catch (ClassNotFoundException e) {
			System.out.println("No driver");
			e.printStackTrace();
		
		} catch (SQLException e) {
			System.out.println("No Connection");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		System.out.println("Start test");
		TestConnection4MySQL.getDB();
	}
}

