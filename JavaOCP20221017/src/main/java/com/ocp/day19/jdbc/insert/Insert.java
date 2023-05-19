package com.ocp.day19.jdbc.insert;
/*
	The provided code snippet is a Java program that establishes a connection to a MySQL database and performs an insert operation on a table.
	  
*/
import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insert {

	static Connection getDB() {
		String url = "jdbc:mysql://localhost:3306/JavaDB?useUnicode=true&characterEncoding=utf-8";
		String user = "User1";
		String password = "1234";
		
		Connection connection = null;
		try {		
		    Class.forName("com.mysql.cj.jdbc.Driver");  // Register driver
			connection = DriverManager.getConnection(url, user, password);	// Get Connection
			System.out.println("Connection successfully, because instantiate instance of Connection: " + connection);			
			String sql4insert = "INSERT JavaDB.JavaTable (badge, name) VALUES(6, 'James')"; // MySQL - INSERT statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql4insert);  // Create Statement		
			preparedStatement.executeUpdate(); // Execute query	for update statement	
			System.out.println("Record updated successfully.");
			connection.close(); // Close connection
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("No driver");
			e.printStackTrace();		
		} 
		catch (SQLException e) {
			System.out.println("No Connection");
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		System.out.println("Start test");
		Insert.getDB();
	}
}

/*
	Console:
			Start test
			Connection successfully, because instantiate instance of Connection: com.mysql.cj.jdbc.ConnectionImpl@169bb4dd
			Record updated successfully.

*/
