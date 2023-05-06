package com.ocp.day13;
/*
	
	The code we provided demonstrates the usage of various functional interfaces in Java.
	
	The code demonstrates different ways to define and use lambda expressions and functional interfaces in Java.	 
	
*/
import java.util.function.BiFunction; 
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionDemo {

	public static void main(String[] args) {
		
		/*
			@FunctionalInterface
			public interface Function<T, R> {
			    // Applies this function to the given argument.
			     
			    // @param t the function argument
			    // @return the function result
			     
			    R apply(T t);
		*/
		Function<String, Integer> functionInStandardSyntax = (String string) -> { return string.split(" ").length; };
		Function<String, Integer> functionInShorthandSyntax = string -> string.split(" ").length;
		Integer lengthFromStandardSyntax = functionInStandardSyntax.apply("Happy Ending 2022");
		Integer lengthFromShorthandSyntax = functionInShorthandSyntax.apply("Happy Ending 2022");
		System.out.println("lengthFromStandardSyntax: " + lengthFromStandardSyntax);
		System.out.println("lengthFromShorthandSyntax: " + lengthFromShorthandSyntax);
		
		
		
		/*
		   @FunctionalInterface
		   public interface BiFunction<T, U, R> {

				// Applies this function to the given arguments.
				     
				// @param t the first function argument
				// @param u the second function argument
				// @return the function result			     
				R apply(T t, U u);			
			}
	    */
		BiFunction<String, Integer, Double> biFunction4Area = (String name, Integer length) -> {
			
			double area = 0.0;
			
			switch(name) {				
				case "Square":
					area = Math.pow(length, 2);
					break;
				
				case "Circular":
					// Circular area formula
					area = (Math.PI) * (Math.pow(length, 2));
					break;
			}
			
			return area;
		};
		
		System.out.println("Area of Square: " + biFunction4Area.apply("Square", 10));
		System.out.println("Circular area: " + biFunction4Area.apply("Circular", 10));

		BiFunction<Double, Double, Double> biFunction4BMI = (Double height, Double weight) -> {
			Double BMI = 0.0;
			BMI =  weight / Math.pow(height / 100, 2);
			return BMI;
		};
		
		BiFunction<Double, Double, Double> biFunction4BMIShorthand = (Double height, Double weight) -> (weight / Math.pow(height / 100, 2));
		
		System.out.println("BMI: " + biFunction4BMI.apply(180.0, 80.0));
		System.out.println("BMI: " + biFunction4BMIShorthand.apply(180.0, 80.0));
		
		
		/*	 		
	 		Since interface of BinaryOperator inherits interface of BiFunction, developer could implement the abstraction method of BiFunction 
	 		even BinaryOperator originally have neither.
	 		
	 		By the way, if you expected to override the method of interface from BinaryFunction, suggested to use object type of BinaryOperator, 
	 		then you could override the abstraction method from both of interface, at same time.
	 			 		
	 		請讀者留意，BinaryOperator 介面無此抽象方法 "R apply(T t, U u);"，但因 BinaryOperator 繼承 BiFunction 介面，因此可覆寫其抽象方法。	 		
	 		順帶一提，若實作 BinaryFunction 介面的抽象方法，建議物件型別改用 BinaryOperator，如此可同時擁有覆寫 BinaryOperator 和 BinaryFunction 介面中的抽象方法 
		*/
		
		BinaryOperator<Double> binaryOperator = (height, weight) -> weight / Math.pow(height / 100, 2);			
		System.out.println("BMI: " + binaryOperator.apply(180.0, 80.0));
		


    	/*
    	 	@FunctionalInterface
			public interface UnaryOperator<T> extends Function<T, T> {

	     		//Returns a unary operator that always returns its input argument.
	     
	     		// @param <T> the type of the input and output of the operator
	     		// @return a unary operator that always returns its input argument
	     
	    		static <T> UnaryOperator<T> identity() {
	        		return t -> t;
	    		}
			}
		*/
		UnaryOperator<Double> unaryOperatorStandardSyntax = (Double value) -> { return value; };
		UnaryOperator<Double> unaryOperatorShorthand = (Double string) -> string;
		
		System.out.println("unaryOperatorStandardSyntax: " + unaryOperatorStandardSyntax.apply(180.0));
		System.out.println("unaryOperatorShorthand: " + unaryOperatorShorthand.apply(80.0));
		
		/*
		 	@FunctionalInterface
			public interface IntBinaryOperator {
	    
			     //	Applies this operator to the given operands.
			     
			     // @param left the first operand
			     // @param right the second operand
			     // @return the operator result
			     
			    int applyAsInt(int left, int right);
			}

		*/
		IntBinaryOperator intBinaryOperatorStandardSyntax = (int x, int y) -> { return (x + y); };		
		IntBinaryOperator intBinaryOperatorShorthand = (int x, int y) -> x + y;
		
		System.out.println("intBinaryOperatorStandardSyntax: " + intBinaryOperatorStandardSyntax.applyAsInt(180, 80));
		System.out.println("intBinaryOperatorShorthand: " + intBinaryOperatorShorthand.applyAsInt(180, 80));
		
		/*
			@FunctionalInterface
			public interface DoubleBinaryOperator {
    
		    // Applies this operator to the given operands.
		     
		    // @param left the first operand
		    // @param right the second operand
		    // @return the operator result
		
    		double applyAsDouble(double left, double right);
		*/
		DoubleBinaryOperator doubleBinaryOperatorStandardSyntax = (double x, double y) -> { return (x + y); };
		DoubleBinaryOperator doubleBinaryOperatorShorthand = (double x, double y) -> x + y;
		
		System.out.println("doubleBinaryOperatorStandardSyntax: " + doubleBinaryOperatorStandardSyntax.applyAsDouble(180.0, 80.0));
		System.out.println("doubleBinaryOperatorShorthand: " + doubleBinaryOperatorShorthand.applyAsDouble(180.0, 80.0));
		
		
		/*
			 public final class Math {
			    //	Returns the greater of two {@code double} values.  That
			    //	is, the result is the argument closer to positive infinity. If
			    //	the arguments have the same value, the result is that same
			    //	value. If either value is NaN, then the result is NaN.  Unlike
			    //	the numerical comparison operators, this method considers
			    //	negative zero to be strictly smaller than positive zero. If one
			    //	argument is positive zero and the other negative zero, the
			    //	result is positive zero.
			     
			    //	@param   a   an argument.
			    //	@param   b   another argument.
			    //	@return  the larger of {@code a} and {@code b}.
			    
			    @IntrinsicCandidate
			    public static double max(double a, double b) {
			        if (a != a)
			            return a;   // a is NaN
			        if ((a == 0.0d) &&
			            (b == 0.0d) &&
			            (Double.doubleToRawLongBits(a) == negativeZeroDoubleBits)) {
			            // Raw conversion ok since NaN can't map to -0.0.
			            return b;
			        }
			        return (a >= b) ? a : b;
			    }
			 }
        */
        DoubleBinaryOperator doubleBinaryOperatorInMax = Math::max;
        DoubleBinaryOperator doubleBinaryOperatorInMin = Math::min;
        System.out.println("Maximum value: " + doubleBinaryOperatorInMax.applyAsDouble(180, 80));
        System.out.println("Minimum value: " + doubleBinaryOperatorInMin.applyAsDouble(180, 80));
	}
}


/*
	Console:
			lengthFromStandardSyntax: 3
			lengthFromShorthandSyntax: 3
			Area of Square: 100.0
			Circular area: 314.1592653589793
			BMI: 24.691358024691358
			BMI: 24.691358024691358
			BMI: 24.691358024691358
			unaryOperatorStandardSyntax: 180.0
			unaryOperatorShorthand: 80.0
			intBinaryOperatorStandardSyntax: 260
			intBinaryOperatorShorthand: 260
			doubleBinaryOperatorStandardSyntax: 260.0
			doubleBinaryOperatorShorthand: 260.0
			Maximum value: 180.0
			Minimum value: 80.0
*/
