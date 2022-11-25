package com.ocp.day9_2.polymorphism_2;

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
         	Please remove the double-slash at line: 25 and 26        
        */        
//      System.out.println(manager.budget); 
//      System.out.println(supervisor.budget);
        
        /* 
     		Compiler error, because there is no stockoption variable from Employee.class
     		Please remove the double-slash at line: 31      
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