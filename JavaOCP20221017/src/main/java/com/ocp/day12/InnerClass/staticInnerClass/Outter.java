package com.ocp.day12.InnerClass.staticInnerClass;

/*
 	Please remove the following annotation with '/'* *'/', then you will see the error with red underline
 	請移除底下註解 '/'* *'/' ，即能看到錯誤的紅色底線	
*/

public class Outter {
	
	int globalVariable = 1;
	
	static int staticMemberVariable = 2;
	
	// Generally speaking of the general Inner Class, the static members NOT Allowable !)
	public class GeneralInner{
	
		int globalVariableInGeneralInnerClassDeclaredNonStaticInnerType = 3;
		
		// The field memberVariableCannot CANNOT be declared static in a "non-static inner type", 
		// unless initialized with a constant expression.
//		/*
			static int memberVariableCannot = 4;   
//		*/
		
		public void innerMethod() {
			
			System.out.println("innerMethod");
			System.out.println(this.globalVariableInGeneralInnerClassDeclaredNonStaticInnerType);
			System.out.println(Outter.this.globalVariable);
			System.out.println(new Outter().globalVariable);
			
		}
	}
	
	// generally speaking of Static Inner Class, the static members - Allowable !
	public static class Inner{

		// Unreachable ! Unless "static"
		int globalVariableInStaticInnerClassDeclaredNonStaticInnerType = 5; 
		
		// The field memberVariableCan CAN be declared static in a "static inner type"
		static int memberVariableCan = 6;		
		
		public static void staticInnerMethod() {
			
			System.out.println("I'm in staticInnerMethod");
			
			/*
				System.out.println("Non-static variable, globalVariableInStaticInnerClass is Unreachable: " + Outter.Inner.globalVariableInStaticInnerClassDeclaredNonStaticInnerType);
			*/
			
			
			
			// GeneralInner class Unreachable ! Unless declare it as "public static GeneralInner"
			/*
				new GeneralInner().innerMethod();
			*/ 
				
		}
	}	
}
