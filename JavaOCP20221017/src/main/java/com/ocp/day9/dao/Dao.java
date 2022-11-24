package com.ocp.day9.dao;
/*
 	What is Dao (Data Access Object)?  
 	
 	"The Data Access Object (DAO) pattern is a structural pattern that 
 	allows us to isolate the application/business layer from 
 	the persistence layer (usually a relational database but 
 	could be any other persistence mechanism) using an abstract API."
 	
 	"資料訪問對象 (DAO) 模式是一種程式架構中的模式，它允許開發者使用 "一個抽象 API"，將 "應用層" 或 "業務層" 從 "持久層" 隔離開來。
 	
 	何謂持久層呢?
 	通常係指 "關聯式資料庫"，但也可以是指任何其它 "持久化" 的機制
 	
 	
 	Reference: https://www.baeldung.com/java-dao-pattern
*/

import java.util.Random;
public class Dao {
	// Global Variable
	// Accessibility: Private
	// This id_number is so-called a "Field" from Table of Schema and "Type" is int,  in Database [e.g., Transact-SQL (MS-SQL) , PL/SQL (Oracle) ... etc]
	private int id_number;
	
	// Default Constructor
	public Dao() {
		super();  // this syntax is optional because inherit super-class (i.e., Object.class)  
		this.id_number = new Random().nextInt(100_000_000); // Create a randomly number from 0 to 99_999_999
	}
	
	@Override
	public String toString() {
		return "Dao { " + " id_number = " + id_number + " }";
	}
}
