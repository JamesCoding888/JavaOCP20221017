package Java11.chapter01_dataTypes.varDemo;

/*
	The following sample code of local variable type inference 
	we design with 1) Can or 2) Cannot, respectively.
*/

import java.util.ArrayList;
public class varCanAndCannot{
	
	// 1) "var" Can
	public void Lambda() {
		var listWithoutExplicitlyTargetType = new ArrayList<>();
		var<String> listWithExplicitlyTargetType = new ArrayList<String>();
	}

	// 2) "var" Cannot
	var cannotImplicitlyInitialisation; 	// MUST be initialization 
	
	var cannotGloablVariable = "var";       // Cannot be global variable

	var cannotNull = null;        		    // NOT null
	
											   
	var cannotLambda = () -> {} ;			// var with lambda expressions must give explicitly target-type
	
	
	public int cannotFunction(var list) {   // cannot use it with fields and in method signatures.
		
	}
	
}
