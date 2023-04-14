package com.ocp.day9_1.Varargs;
/*
 	This program we introduce the application of Varargs:
	==============================================================================================================
 	Before Java 1.5, whenever we wanted to pass an arbitrary number of arguments, 
 	we had to pass all arguments in an array or implement N methods (one for each additional parameter):
 	
 	1) public String format() { ... }

	2) public String format(String value) { ... }

	3) public String format(String val1, String val2) { ... }
	
	==============================================================================================================
	After Java 1.5 (including 1.5 version), provides a short-hand for methods that support an arbitrary number of parameters of one type
	1) public String format() {String ... values}
	
	==============================================================================================================
	Overall, this program provides a good example of how varargs can simplify code and allow methods to be more flexible in accepting arguments.

*/
public class VarargsDemo1 {
    // addVarargsIn1DimensionArray method to add up all values
	// Reminder here of following available syntax -> int...values / int... values / int ...values
	// 建立 addVarargsIn1DimensionArray 方法，將 values 加總
	// 以下提醒可接受的語法 -> int...values / int... values / int ...values
    public static int addVarargsIn1DimensionArray(int ... values) { 	
    	// local variable MUST be initiated (區域變數必須初始化)
        int sum = 0;
        // for-loop
        for(int value : values) {
            sum += value;
        }
        return sum;
    }
    
    // addVarargsIn2DimensionArray method to add up all values
 	// 建立 addVarargsIn2DimensionArray 方法，將 values 加總
    public static int addVarargsIn2DimensionArray(int[] ... values) { 	
    	// local variable MUST be initiated (區域變數必須初始化)
        int sum = 0;
        // for-each (加強型 for 回圈)
        for(int[] array : values) {
	        for(int value : array) {
	            sum += value;
	        }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {        
        System.out.println(addVarargsIn1DimensionArray());
        System.out.println(addVarargsIn1DimensionArray(1));
        System.out.println(addVarargsIn1DimensionArray(1, 2));
        System.out.println(addVarargsIn1DimensionArray(1, 2, 3));
        System.out.println(addVarargsIn1DimensionArray(1, 2, 3, 4));
        System.out.println(addVarargsIn1DimensionArray(1, 2, 3, 4, 5));
        
        int[] numbersOf1DimensionArray = {1, 2, 3, 4, 5};             
        System.out.println(addVarargsIn1DimensionArray(numbersOf1DimensionArray));
        
        int[][] numbersOf2DimensionArray = {{1}, {2, 3}, {4, 5, 6}};
        System.out.println(addVarargsIn2DimensionArray(numbersOf2DimensionArray));
    }
}

/*
		Console: 
					0
					1
					3
					6
					10
					15
					15
					21
*/