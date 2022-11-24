package com.ocp.day9.dao;

/*
 	Introduction of how to create a Singleton Pattern as below
	To create a singleton-class, this class must implement the following properties:
	
	1) Create a private constructor of the class to restrict object created outside of the singleton-class.
	
	2) Create a private attribute (eg., "private static SingleDao SingleDao_Instance = new SingleDao()") of the class type that refers to the single object.
	
	3) Create a public static method (eg., "public static SingleDao getSingleDaoInstance()") that allows us to create and access the object we created. 
	   Inside the method, we will create a condition that prohibits us from creating more than one object.
	   
	   What's this mean by, "allows us to create and access the object we created" ? 
	   It's likely you share a Single Global Instance and provide a Global Point of Access to SingleDao.class.
	  
	   
	   
	   
*/

import java.util.Random;
public class SingleDao {
	// Global Variable
	// Accessibility: Private 
	private int id_number;
	
	// Refer to Introduction of 2)
	private static SingleDao SingleDao_Instance = new SingleDao();
	
	// Refer to Introduction of 1)
	private SingleDao() {
		super();  // this syntax is optional because inherit super-class (i.e., Object.class)
		this.id_number = new Random().nextInt(100_000_000); // Create a randomly number from 0 to 99_999_999
	}		

	// Refer to Introduction of 3) 
	public static SingleDao getSingleDaoInstance() {
		return SingleDao_Instance;
	}
	
	@Override
	public String toString() {
		return "SingleDao { " + " id_number = " + id_number + " }";
	}
}
