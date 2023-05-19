package com.ocp.day19.jdbc.delete;
/*

	The code provided is a Java program that demonstrates how to connect to a MySQL database and perform a delete operation on a table. 
	
	It uses JDBC (Java Database Connectivity) to establish the connection and execute the delete statement.
 
*/

import java.sql.Connection;   
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Delete {

	static Connection getDB() {
		String url = "jdbc:mysql://localhost:3306/JavaDB?useUnicode=true&characterEncoding=utf-8";
		String user = "User1";
		String password = "1234";
		
		Connection connection = null;
		try {		
		    Class.forName("com.mysql.cj.jdbc.Driver");  // Register driver
			connection = DriverManager.getConnection(url, user, password);	// Get Connection
			System.out.println("Connection successfully, because instantiate instance of Connection: " + connection);			
			String sql4update = "DELETE FROM JavaDB.JavaTable where badge = 5"; // MySQL - delete statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql4update);  // Create Statement		
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
		Delete.getDB();
	}
}


/*
	Console:
			Start test
			Connection successfully, because instantiate instance of Connection: com.mysql.cj.jdbc.ConnectionImpl@169bb4dd
			Record updated successfully.

*/