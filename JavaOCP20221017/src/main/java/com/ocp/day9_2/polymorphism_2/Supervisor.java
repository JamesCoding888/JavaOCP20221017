package com.ocp.day9_2.polymorphism_2;
/*
		This is an example of another Java subclass named "Supervisor" that also extends the "Employee" superclass. 
		
		The "Supervisor" class has its own instance variable named "stock_option", 
		
		which represents the employee stock option (ESO) granted to the supervisor as part of their compensation package. 
		
		The variable is assigned a value of 120,000. 
*/
// Super-class (父類別): Employee 
// Sub-class (子類別): Supervisor
public class Supervisor extends Employee {
	/*
		An employee stock option (ESO) is a grant to 
		an employee (here is only for Supervisor) giving the right to buy a certain number of 
		shares in the company's stock for a set price.
		
		員工認股權: 由公司授予僱員作為員工 (這裏係指)薪酬待遇的一部分
	*/
	public int stock_option = 120_000;

	// Override the method of jobDescription of Employee
	// 改寫 Employee.class 中的 jobDescription 方法
	@Override
	public void jobDescription() {
		System.out.println("Business Strategy");
	}
}
