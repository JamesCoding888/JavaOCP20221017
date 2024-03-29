package com.ocp.day8;


/*
 	This lesson we introduce the Primitive type
 	本節介紹基本 "基本資料型別"
	
	A primitive data type specifies the size and type of variable values, 
	and it has no additional methods. 
	基本型別 (或稱原始型別) 指定變數值的大小和類型，無其它方法。
	
	There are eight primitive data types in Java (Java 中有八種原始資料型別):    		
	Data Type		Size			Description
	byte			1 byte			Stores whole numbers from -128 to 127
	short			2 bytes			Stores whole numbers from -32,768 to 32,767
	int				4 bytes			Stores whole numbers from -2,147,483,648 to 2,147,483,647
	long			8 bytes			Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	float			4 bytes			Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
	double			8 bytes			Stores fractional numbers. Sufficient for storing 15 decimal digits
	boolean			1 bit			Stores true or false values
	char			2 bytes			Stores a single character/letter or ASCII (American Standard Code for Information Interchange, 美國信息交換標準編碼) values
									Introduction of ASCII -> https://zh.wikipedia.org/wiki/ASCII
	
	
	<A kindly reminder>
	1) boolean: 
				
				The boolean data type has only two possible values: true and false. 
	    	 	Use this data type for simple flags that track true/false conditions. 
	    	 	This data type represents 1-bit of Size.
	    	 	There are some subtle differences between programming languages (e.g., C and Java), for your information.
	    	 	For C language, Boolean variable is stored as 16-bit (2-byte) values.
	    	    
	    	 	
				boolean 資料型別，只有兩種值: true 和 false
	    	 	使用此資料型別，作為簡易偵測條件之 '真' 和 '否' 
	    	    boolean 資料型別在 Java 中，只佔 1 bit 記憶體空間
	    	    我們需特別注意編程語言（例如 C 和 Java）之間的一些細微差別
	    	    關於 C 語言之 boolean 資料型別則佔 16-bit (2-byte) 記憶體	    	    
	    	    
	
	2) char: 
				The char data type is a single 16-bit Unicode character. 
	   	     	It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
	   		 	char 資料型別，係單個 16 位元 Unicode 字符。
	   		 	統一編碼的最小值為 '\u0000'（或 0），最大值為 '\uffff'（或 65,535)。
	   		 
	   		   		   
*/
public class PrimitiveClass {
    public static void main(String[] args) {  
       	
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

        /* 
            Please refer to the following link of introduction for how to present the Max value of Character
            印出 Character 大小，需加 '0'
            Link -> https://stackoverflow.com/questions/23413497/how-to-print-max-value-of-character
            
            Character 字元大小計算方式:
         				  16    15    14   13   12   11   10     9  8  7  6  5  4 3 2 1 0	    													
        	計算結果 ->  65536 32768 16384 8192 4096 2048 1024 512 256 128 64 32 16 8 4 2 1 
			計算方式 ->  2^x (x = 16, 15, ..., 3, 2, 1, 0)         
         */
                
        System.out.println(Character.MAX_VALUE);      // ?
        System.out.println(Character.MIN_VALUE);      // blank
        System.out.println(Character.MAX_VALUE + 0);  // 65535
        System.out.println(Character.MIN_VALUE + 0);  // 0
        System.out.println("maxOfCharacter: " + Character.MAX_VALUE); // Question Mark
        System.out.println("minOfCharacter: " + Character.MIN_VALUE); // Question Mark
        System.out.println("maxOfCharacter: " + maxOfCharacter);
        System.out.println("minOfCharacter: " + minOfCharacter);
        System.out.println("===================================================================================================");                     
        System.out.println("maxOfByte: " + maxOfByte);
        System.out.println("minOfByte: " + minOfByte);
        System.out.println("===================================================================================================");
        System.out.println("maxOfShort: " + maxOfShort);
        System.out.println("minOfShort: " + minOfShort);       
        System.out.println("maxOfInteger: " + maxOfInteger);
        System.out.println("minOfInteger: " + minOfInteger);
        System.out.println("maxOfLong: " + maxOfLong);
        System.out.println("minOfLong: " + minOfLong);
        System.out.println("maxOfFloat: " + maxOfFloat);
        System.out.println("minOfFloat: " + minOfFloat);
        System.out.println("maxOfDouble: " + maxOfDouble);
        System.out.println("minOfDouble: " + minOfDouble);
        System.out.println("===================================================================================================");
        String scoreOfEnglish = "100"; // 英文成績
        String scoreOfMath = "90";  // 數學成績
        // Notice here that add up both of String variables will be concatenated
        // 請留意，當 String 變數相加，則會是連成一串
        System.out.println(scoreOfEnglish + scoreOfMath);
        // If you need to add up both of numbers, please transfer type of String to be type of int
        // 欲將數字相加，需使用 Integer.parseInt(String variable) 轉成 int 型別的數字變數
        int number1 = Integer.parseInt(scoreOfEnglish);
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
			￿
 
			65535
			0
			maxOfCharacter: ￿
			minOfCharacter:  
			maxOfCharacter: ￿
			minOfCharacter:  
			===================================================================================================
			maxOfByte: 127
			minOfByte: -128
			===================================================================================================
			maxOfShort: 32767
			minOfShort: -32768
			maxOfInteger: 2147483647
			minOfInteger: -2147483648
			maxOfLong: 9223372036854775807
			minOfLong: -9223372036854775808
			maxOfFloat: 3.4028235E38
			minOfFloat: 1.4E-45
			maxOfDouble: 1.7976931348623157E308
			minOfDouble: 4.9E-324
			===================================================================================================
			10090
			190
			number1 + number2: 10090
			190number1 + number2: 

*/