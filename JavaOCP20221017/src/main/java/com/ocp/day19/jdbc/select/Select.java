package com.ocp.day19.jdbc.select;
/*

	The code provided is a Java program that connects to a MySQL database, executes a SELECT query, and prints the retrieved data.
 
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/JavaDB?useUnicode=true&characterEncoding=utf-8";
		String user = "User1";
		String password = "1234";

		// Establish Connection
		Connection connection = DriverManager.getConnection(url, user, password);
		// Create Statement
		Statement statement = connection.createStatement();
		// MySQL statement for SELECT
		String sql4select = "SELECT JavaTable.badge, JavaTable.name FROM JavaDB.JavaTable";

		// A table of data representing a database result set, which is usually generated 
		// by executing a statement that queries the database.
		ResultSet resultSet = statement.executeQuery(sql4select);
		// Moves the cursor forward one row from its current position
		// while-loop to iterate through the result set
		while (resultSet.next()) {
			int id = resultSet.getInt("badge");
			String name = resultSet.getString("name");
			System.out.printf("| %2d | %-5s |\n", id, name);
		}

		// Close all resources
		resultSet.close();
		statement.close();
		connection.close();
	}
}

/*
	Console: 
	
			|  1 | Happy |
			|  2 | james |
			|  3 | jamessss |
			|  4 | Happy |


*/