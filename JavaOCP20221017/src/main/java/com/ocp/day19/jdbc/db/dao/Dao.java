package com.ocp.day19.jdbc.db.dao;
import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.derby.jdbc.ClientDataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.ocp.day19.jdbc.db.entity.Department;
import com.ocp.day19.jdbc.db.entity.Employee;

public class Dao {
	
	public static ClientDataSource clientDataSource;
	
	static {
		clientDataSource = new ClientDataSource();
		clientDataSource.setServerName("localhost");
		clientDataSource.setPortNumber(0000);
		clientDataSource.setDatabaseName("");
		clientDataSource.setUser("");
		clientDataSource.setPassword("");
	}
	
	public List<Department> queryDepartments(){
		List<Department> departments = new ArrayList<>();
		// SELECT syntax from MySQL
		String sql = "SELECT id, name FROM SQL4javaWebEE.department";
		/*
		  	The following example uses a try-with-resources statement to automatically close objects of 
		  	java.sql.Connection, java.sql.Statement, and java.sql.ResultSet
		  	
		  	Note: A try-with-resources statement can have catch and finally blocks just like an ordinary try statement. 
		  		  In a try-with-resources statement, any catch or finally block is run after the resources declared have been closed.
		*/
		try(Connection connection = clientDataSource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql)){
			// O/R Mapping: Object Relational Mapping
			while(resultSet.next()) {
				Department department = new Department();
				// O/R Mapping
				department.setId(resultSet.getInt("id"));
				// O/R Mapping
				department.setName(resultSet.getString("name"));
				// Insert every values into table of department
				departments.add(department);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		return departments;
	}
	
	public List<Employee> queryEmployees(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(clientDataSource);
		String sql = "SELECT id, name, salary, dept_id from employee";
		List<Employee> employees = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Employee.class));
		for(Employee employee : employees) {
			sql = "SELECT id, name from department where id = ?";
			Object[] args = { employee.getDeptId() };
			Department department = (Department)jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper(Employee.class));
			employee.setDepartment(department);
		}
				
		return employees;
	}
}
