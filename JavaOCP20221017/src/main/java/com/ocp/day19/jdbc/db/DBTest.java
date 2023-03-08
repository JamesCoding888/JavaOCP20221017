package com.ocp.day19.jdbc.db;

import java.util.List;
import com.ocp.day19.jdbc.db.dao.Dao;
import com.ocp.day19.jdbc.db.entity.Department;
import com.ocp.day19.jdbc.db.entity.Employee;

/*
	
	Of this lesson, we used the external API of ClientDataSource from "Apache Derby Database Engine and Embedded JDBC Driver - 10.14.2.0"
	
	https://mvnrepository.com/artifact/org.apache.derby/derby/10.14.2.0
	
*/
public class DBTest {
	public static void main(String[] args) {
		Dao dao = new Dao();
		System.out.println(dao);
		List<Department> departments = dao.queryDepartments();
		System.out.println(departments);
		
		List<Employee> employees = dao.queryEmployees();
		System.out.println(employees);
		
		for(Employee employee : employees) {
			System.out.printf("ID of employee: %d, Name of employee: %s, Dept ID of employee: %d, Name of Department: %s\n", 
							  employee.getId(), employee.getName(), employee.getDeptId(), employee.getDepartment().getName());
		}
	}
}
