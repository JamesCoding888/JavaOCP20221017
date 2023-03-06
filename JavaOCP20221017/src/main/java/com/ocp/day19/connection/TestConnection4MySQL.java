package com.ocp.day19.connection;

/*
 	1. Establish JDBC Driver, e,g., Class.forName("com.mysql.cj.jdbc.Driver"):  

		Starting from JDBC 4.0, the driver manager can automatically detect and load the appropriate JDBC driver for your application without 
		the need to explicitly call Class.forName().
				
		In earlier versions of JDBC 4.0, "Class.forName()" was required to load the JDBC driver class and register it with the DriverManager. 				
				
		However, this was not necessary with JDBC 4.0 and later versions. 
		Instead, the driver class can be automatically located and loaded based on the contents of the META-INF/services/java.sql.Driver file in the driver's JAR file.
				
		This feature is known as "automatic driver loading" and provides a more convenient way to manage JDBC drivers in your application. 
		It allows your application to automatically discover and use the appropriate JDBC driver, without having to worry about explicitly loading and registering it.
			 	
	 	Regarding the info above, please visit the following link "https://docs.oracle.com/javadb/10.8.3.0/ref/rrefjdbc4_0summary.html"
	 	
	2. META-INF/services/java.sql.Driver:
		
		The META-INF/services/java.sql.Driver file is a file that is included in the JAR file of a JDBC driver. 
		This file contains the name of the driver class that implements the java.sql.Driver interface, which is used by the Java DriverManager to automatically discover and load the driver at runtime.

		The format of the META-INF/services/java.sql.Driver file is simple. It consists of one line that contains the fully qualified name of the driver class that implements the java.sql.Driver interface. 
		For example, the contents of the file might look like this:
			
			com.example.jdbc.Driver
		
		When the DriverManager is asked to establish a connection to a database, it scans the classpath for JAR files that contain the META-INF/services/java.sql.Driver file. 
		If it finds a file with the correct name, it reads the name of the driver class from the file and loads that class using the current thread's context class loader. Once the class is loaded, 
		the DriverManager instantiates an instance of the driver and registers it with itself.
	
		This feature is useful because it allows JDBC drivers to be loaded and registered automatically, without requiring the application code to explicitly load and register the driver using Class.forName().
	
	
	3. META-INF/services/com.mysql.cj.jdbc.Driver:
		
		The META-INF/services/com.mysql.cj.jdbc.Driver file is a file that is included in the JAR file of the MySQL Connector/J JDBC driver. This file contains the name of the driver class that implements the com.mysql.cj.jdbc.Driver interface, 
		which is used by the Java DriverManager to automatically discover and load the MySQL Connector/J JDBC driver at runtime.
	
		The contents of the META-INF/services/com.mysql.cj.jdbc.Driver file in the MySQL Connector/J JDBC driver JAR file is:
		
			com.mysql.cj.jdbc.Driver
		
		When the DriverManager is asked to establish a connection to a MySQL database using the MySQL Connector/J JDBC driver, it scans the classpath for JAR files that contain the META-INF/services/com.mysql.cj.jdbc.Driver file. 
		If it finds a file with the correct name, it reads the name of the driver class (com.mysql.cj.jdbc.Driver) from the file and loads that class using the current thread's context class loader. 
		Once the class is loaded, the DriverManager instantiates an instance of the driver and registers it with itself.
		
		This feature is useful because it allows the MySQL Connector/J JDBC driver to be loaded and registered automatically, without requiring the application code to explicitly load and register the driver using Class.forName().
		
		
	4. JDBC 4.0:
	 
	 	JDBC 4.0 was introduced in Java SE 6 (JDK 1.6) and is also supported in later versions of Java, 
	 	including Java SE 7 (JDK 1.7), Java SE 8 (JDK 1.8), Java SE 9 (JDK 9), Java SE 10 (JDK 10), 
	 	Java SE 11 (JDK 11), Java SE 12 (JDK 12), Java SE 13 (JDK 13), Java SE 14 (JDK 14), 
	 	Java SE 15 (JDK 15), Java SE 16 (JDK 16), and Java SE 17 (JDK 17).

		Note that while JDBC 4.0 was introduced in Java SE 6, some JDBC drivers may not fully support all of the features introduced in JDBC 4.0. 
		It is always a good idea to check the documentation for your specific JDBC driver (i.e., Oracle, MSSQL, MySQL, Sysbase and etc...) 
		to see which JDBC version it supports and which features are available.
	 
	 
	5. Java Database Connectivity
	
		1) Register driver 
		2) Get Connection
		3) Create Statement
		4) Execute query
		5) Close connection
		
	 
	6. If you see the warning message of "java.lang.ClassNotFoundException: com.mysql.cj.jdbc.Driver", please follow the setting below:
 
		1) Visit on the website of "https://mvnrepository.com/artifact/mysql/mysql-connector-java"
		2) Select 8.0.26
		3) See the Files of jar
		4) Download it
		5) Copy the file of mysql-connector-java-8.0.26.jar into fold of lib on Eclipse IDE
		6) Right click -> Properties
		7) Java Build Path -> Libraries 
		8) Select Modulepath -> Add JARs…
		9) Select the external .jar that developer expected to install into Modulepath from fold of lib
		10) Select mysql-connector-java-8.0.26.jar
		11) Click on OK
		12) Click on Apply and Close
		13) Done!
		
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
			Class.forName("com.mysql.cj.jdbc.Driver");  // Register driver
			connection = DriverManager.getConnection(url, user, password);	// Get Connection
			System.out.println("Connection successfully, because instantiate instance of Connection: " + connection);			
			String sql4update = "update SQL4javaWebEE.SQL4javaWebEE set name = 'James' where badge = 1"; // MySQL - update statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql4update);  // Create Statement		
			preparedStatement.executeUpdate(); // Execute query	for update statement	
			connection.close(); // Close connection
			
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

/*
	Console:
			Start test
			Connection successfully, because receive instance of Connection: com.mysql.cj.jdbc.ConnectionImpl@795509d9
	
*/