package Java11.chapter01_dataTypes.varDemo;

/*
 	==============================================================================================================
 	
 	Java 10 introduces a new language feature called var (which is, local variable type inference). 
 	
 	The var allows developer to define a variable with var type but without giving a specific type of variable.
 	
 	JRE will automatically detect the data-type of variable.
 	
 	==============================================================================================================
 	
 	Let's check-out the following sample codes for your practice:
 	
 	1) var for Primitive type and Object type, please refer to VarDemo.java at package: Java11.chapter01_dataTypes.varDemo
	
	2) var Can and Cannot, please refer to varCanAndCannot.java at package: Java11.chapter01_dataTypes.varDemo 
		
	 
*/


import java.util.ArrayList; 
import java.util.HashMap;
import java.util.List;

class User{
	
	// value of id is unable to be override, and accessibility Only current User.class 
	private final long id;  
	private String name;	
	public List<String> list = new ArrayList<String>();
		
	public User(long id, String name) {
		this.id = id;
		this.name = name;		
	}
	
	@Override
	public String toString() {
		return " [ id: " + id + " , " + "name: " + name + " | " +  list + " ] "; 
	}
}


class Var_PrimitiveType{
	
	public void PrimitiveType() {
		
		// char
		var char_variable = 'a';

		// short
		var short_variable = (short) 100;

		// Short
		var Short_variable = Short.valueOf((short)100);		

		// int
		var int_variable = 100;

		// Integer
		var Integer_variable = (Integer) 100;

		// long
		var long_variable = (long)100;
		
		// Long
		var Long_variable = Long.valueOf(Integer.valueOf(100));
		
		// float
		var float_variable = (float) 100.92;

		// Float
		var Float_variable = Float.valueOf((float)100.92);

		// double
		var double_variable = 100.95;

		// Double
		var Double_variable = (Double) 100.0;

		// String
		var String_variable = "David";

		// boolean
		var boolean_variable = false;

		System.out.println(char_variable);
		System.out.println(short_variable);
		System.out.println("JRE automatically detects the type of variable is: " + Short_variable.getClass().getName() + "; Value is: " + Short_variable);
		System.out.println(int_variable);
		System.out.println("JRE automatically detects the type of variable is: " + Integer_variable.getClass().getName() + "; Value is: " + Integer_variable);
		System.out.println(long_variable);
		System.out.println("JRE automatically detects the type of variable is: " + Long_variable.getClass().getName() + "; Value is: " + Long_variable);
		System.out.println(float_variable);
		System.out.println("JRE automatically detects the type of variable is: " + Float_variable.getClass().getName() + "; Value is: " + Float_variable);		
		System.out.println(double_variable);
		System.out.println("JRE automatically detects the type of variable is: " + Double_variable.getClass().getName() + "; Value is: " + Double_variable);
		System.out.println("JRE automatically detects the type of variable is: " + String_variable.getClass().getName() + "; Value is: " + String_variable);
		System.out.println(boolean_variable);
		

	}
}

public class VarDemo {
	
	public static void main(String[] args) {
		
		System.out.println("***** Demo of Primitive type for var *****");
		Var_PrimitiveType var_Practice01 = new Var_PrimitiveType();		 
		var_Practice01.PrimitiveType();
		
		
		System.out.println("***** Demo of Object type for var *****");								
		var userHashMap = new HashMap<User, Boolean>();
		var user1 = new User(1, "David");
		var user2 = new User(2, "Marry");
		var user3 = new User(3, "Tim");
		userHashMap.put(user1,  user1.list.add("Math"));
		userHashMap.put(user1,  user1.list.add("Science"));
		userHashMap.put(user1,  user1.list.add("Tech"));
		userHashMap.put(user2,  user2.list.add("English"));
		userHashMap.put(user2,  user2.list.add("Art"));
		userHashMap.put(user3,  user3.list.add("History"));
		System.out.println(userHashMap);
		
		
	}
}

/*
	Console:
			***** Demo of Primitive type for var *****
			a
			100
			JRE automatically detects the type of variable is: java.lang.Short; Value is: 100
			100
			JRE automatically detects the type of variable is: java.lang.Integer; Value is: 100
			100
			JRE automatically detects the type of variable is: java.lang.Long; Value is: 100
			100.92
			JRE automatically detects the type of variable is: java.lang.Float; Value is: 100.92
			100.95
			JRE automatically detects the type of variable is: java.lang.Double; Value is: 100.0
			JRE automatically detects the type of variable is: java.lang.String; Value is: David
			false
			***** Demo of Object type for var *****
			{ [ id: 1 , name: David | [Math, Science, Tech] ] =true,  [ id: 3 , name: Tim | [History] ] =true,  [ id: 2 , name: Marry | [English, Art] ] =true}




*/