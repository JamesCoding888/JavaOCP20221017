package Java11.chapter01_dataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*
 	Java 10 introduces a new language feature called var (which is, local variable type inference). 
 	The var allows developer to define a variable with var type but without giving a specific type of variable.
 	
 	Let's check-out the following sample code for your practice.
 	
 	1) var_Practice01: JRE will automatically detect the data-type of variable 
	
	
	Reference from "https://developer.oracle.com/learn/technical-articles/jdk-10-local-variable-type-inference"
	 
*/

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

class varCannot{
	
	var cannotImplicitlyInitialisation;
	
	var cannotNull = null;
	
	var cannotLambda = () -> {} ;
	
	
	public int cannot(var list) {
		
	}
	
	public void Lambda() {
		var list = new ArrayList<>();	
	}
	
}
class Var_Practice01{
	
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
	/*  	     
		var variable = "var type"; // "var" type is NOT able to be global, but ONLY local !
	*/
	public static void main(String[] args) {
		System.out.println("***** Demo of Primitive type for var *****");
		Var_Practice01 var_Practice01 = new Var_Practice01();		 
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
		
		System.out.println("***** CANNOT use local variable type inference *****");
		
		
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
			***** CANNOT use local variable type inference *****



*/