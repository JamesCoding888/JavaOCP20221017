package Java11.chapter01_dataTypes;

/*
 	Java 10 introduces a new language feature called var (which is, local variable type inference). 
 	The var allows developer to define a variable with var type but without giving a specific type of variable.
 	
 	Let's check-out the following sample code for your practice.
 	
 	1) var_Practice01: JRE will automatically detect the data-type of variable 
	
	
	Reference from "https://developer.oracle.com/learn/technical-articles/jdk-10-local-variable-type-inference"
	 
*/

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
	
	public static void main(String[] args) {
		
		Var_Practice01 var_Practice01 = new Var_Practice01();
		System.out.println("***** Demo of Primitive type for var *****"); 
		var_Practice01.PrimitiveType(); 
				
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


*/