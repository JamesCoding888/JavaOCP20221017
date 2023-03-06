package com.ocp.day19.jdbc.select;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:xxxxx/xxxxx?useUnicode=true&characterEncoding=utf-8";
		String user = "xxxxx";
		String password = "xxxxx";

		// Establish Connection
		Connection connection = DriverManager.getConnection(url, user, password);
		// Create Statement
		Statement statement = connection.createStatement();
		// MySQL statement for SELECT
		String sql4select = "SELECT s4jwe.badge, s4jwe.name FROM SQL4javaWebEE s4jwe";

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
	
			|  1 | James |
			|  2 | marry |
			|  3 | david |
			|  4 | jack  |
			|  5 | Musk  |
			|  6 | Marry |
			|  7 | Jason |
			|  8 | Ted   |
			|  9 | Stock |
			| 10 | Tiger |

*/