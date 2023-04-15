package com.ocp.day9_2.polymorphism_2;
/*
		The code attempts to access various instance variables from each of these instances, and print them to the console.
	
		The "salary" instance variable is accessed for each instance, which is inherited from the "Employee" superclass, so it is present in all three instances.

		For the "manager" and "supervisor" instances, the code attempts to access the "budget" and "stock_option" instance variables, respectively, 
		
		which are not present in the "Employee" superclass. This will result in a compiler error, because the variable is not defined in the superclass, and is specific to the subclass.
 
*/
public class Test02 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee supervisor = new Supervisor();
        System.out.println(employee.salary);
        
        /*
           There is NO salary variable from Manager.class, 
           but, due to inheritance between Manager and Employee, 
           programming will invoke the salary variable from Employee.class
        */         
        System.out.println(manager.salary);
        /*
        	There is NO salary variable from Supervisor.class, 
            but, due to inheritance between Supervisor and Employee, 
            programming will invoke the salary variable from Employee.class
        */
        System.out.println(supervisor.salary);
        
        /* 
         	Compiler error, because there is no budget variable from Employee.class
         	Please remove the double-slash at line: 36 and 37        
        */        
//      System.out.println(manager.budget); 
//      System.out.println(supervisor.budget);
        
        /* 
     		Compiler error, because there is no stockoption variable from Employee.class
     		Please remove the double-slash at line: 43      
        */     
//      System.out.println(supervisor.stockoption);
    }
}

/*	
	Console:
				80000
				80000
				80000
*/