package com.ocp.day18.assertion;

/*
	1) Java assert keyword was introduced in java 1.4.  
 	
 	2) No libraries of assert needed or packages to import
 	
 	3) Java Virtual Machine (JVM) disables assertion validation as default. 
 	   If developer needs to execute assert, will use command-line argument with either "-enableassertions" or "-ea". 
 	
 	4) Run on application of AssertionDemo.java with assert enabled, please go to the setting of Run Configuration and write command-line and click on the button of Run
 	   
 	   Refer to the image of "Run Configurations on Eclipse IDE.png"  



*/

public class AssertionDemo {
	
	public static void main(String[] args) {
		int score = 59;		
		// score < 60 
		// JVM will throw AssertionError with "Fail: score"
		assert score >= 60 : "Fail: " + score;		
		System.out.println("Pass: " + score);
	}
}


/*
	Console: 
		Exception in thread "main" java.lang.AssertionError: Fail: 59
*/