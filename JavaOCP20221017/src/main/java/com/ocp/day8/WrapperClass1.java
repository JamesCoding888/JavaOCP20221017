package com.ocp.day8;
// This lesson we introduce the Wrapper Class
// 本節介紹包覆類別
public class WrapperClass1 {
    public static void main(String[] args) {  
  
    	// boolean: 
    	// The boolean data type has only two possible values: true and false. 
    	// Use this data type for simple flags that track true/false conditions. 
    	// This data type represents one bit of information, but its "size" isn't something that's precisely defined.

    	// char: The char data type is a single 16-bit Unicode character. 
    	// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
    	/*
    		How to Print Max Value of Character? See the following link 
    		https://stackoverflow.com/questions/23413497/how-to-print-max-value-of-character
    	*/
    	
    	char maxOfCharacter = Character.MAX_VALUE;
    	char minOfCharacter = Character.MIN_VALUE;    	
    	byte maxOfByte = Byte.MAX_VALUE;
    	byte minOfByte = Byte.MIN_VALUE;
    	short maxOfShort = Short.MAX_VALUE;
    	short minOfShort = Short.MIN_VALUE;
        int maxOfInteger = Integer.MAX_VALUE;
        int minOfInteger = Integer.MIN_VALUE;
        long maxOfLong = Long.MAX_VALUE;
        long minOfLong = Long.MIN_VALUE;
        float maxOfFloat = Float.MAX_VALUE;
        float minOfFloat = Float.MIN_VALUE;
        double maxOfDouble = Double.MAX_VALUE;
        double minOfDouble = Double.MIN_VALUE;
                      
        System.out.println("maxOfCharacter: " + Character.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MAX_VALUE + 0);
        System.out.println("minOfCharacter: " + Character.MIN_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MIN_VALUE + 0);
        System.out.println("maxOfCharacter: " + maxOfCharacter);
        System.out.println("minOfCharacter: " + minOfCharacter);
        System.out.println("maxOfByte: " + maxOfByte);
        System.out.println("minOfByte: " + minOfByte);
        System.out.println("maxOfShort: " + maxOfShort);
        System.out.println("minOfShort: " + minOfShort);
        System.out.println("minOfLong: " + minOfLong);
        System.out.println("maxOfFloat: " + maxOfFloat);
        System.out.println("minOfFloat: " + minOfFloat);
        System.out.println("maxOfInteger: " + maxOfInteger);
        System.out.println("minOfInteger: " + minOfInteger);
        System.out.println("maxOfLong: " + maxOfLong);
        System.out.println("minOfLong: " + minOfLong);
        System.out.println("maxOfFloat: " + maxOfFloat);
        System.out.println("minOfFloat: " + minOfFloat);
        System.out.println("maxOfDouble: " + maxOfDouble);
        System.out.println("minOfDouble: " + minOfDouble);
        String scoreOfChinese = "100"; // 國文成績
        String scoreOfMath = "90";  // 數學成績
        // Notice here that the String variables add-up will be concatenated
        // 請留意，當 String 變數相加，則會是連一串
        System.out.println(scoreOfChinese + scoreOfMath);
        // If you need to add-up both of numbers, please transfer type of String to be type of int
        // 欲將數字相加，需使用 Integer.parseInt(String variable) 轉成 int 型別的數字變數
        int number1 = Integer.parseInt(scoreOfChinese);
        int number2 = Integer.parseInt(scoreOfMath);
        System.out.println(number1 + number2);
        // The string concatenation operator plus number1 and number2, 
        // which, when given a String operand and an integral operand, will convert the integral operand to a String representing its value in decimal form, 
        // and then produce a newly created String that is the concatenation of the two strings        
        // 注意，當在 int 變數 (i.e., number1 和 number2) 之前，加上字串，將會使 number1 和 number2 變為 String 型別，最後再產生一個 String 的型別將兩個字串變數做串連
        System.out.println("number1 + number2: " + number1 + number2);
        // How about change-up of integral operand and String operand ?
        // 如果將 int 運算數 和 String 運算數對調呢 ？ 
        System.out.println(number1 + number2 + "number1 + number2: ");        
    }
}


/*
	Console:
		maxOfCharacter: ￿
		￿
		65535
		minOfCharacter:  
		 
		0
		maxOfCharacter: ￿
		minOfCharacter:  
		maxOfByte: 127
		minOfByte: -128
		maxOfShort: 32767
		minOfShort: -32768
		minOfLong: -9223372036854775808
		maxOfFloat: 3.4028235E38
		minOfFloat: 1.4E-45
		maxOfInteger: 2147483647
		minOfInteger: -2147483648
		maxOfLong: 9223372036854775807
		minOfLong: -9223372036854775808
		maxOfFloat: 3.4028235E38
		minOfFloat: 1.4E-45
		maxOfDouble: 1.7976931348623157E308
		minOfDouble: 4.9E-324
		10090
		190
		number1 + number2: 10090
		190number1 + number2: 

 

*/