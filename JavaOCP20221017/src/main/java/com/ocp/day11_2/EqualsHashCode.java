package com.ocp.day11_2;
/*
	The given code snippet is a Java program that demonstrates the usage of the equals() and hashCode() methods in Java.
	 
*/
public class EqualsHashCode {
	public static void main(String[] args) {
		OverrideEqualsHashCode pen1 = new OverrideEqualsHashCode("Pencil", 20);
		OverrideEqualsHashCode pen2 = new OverrideEqualsHashCode("Rollerball pen", 30);
		OverrideEqualsHashCode pen3 = new OverrideEqualsHashCode("Fountain pen", 80);
		
		System.out.println(pen1);
		System.out.println(pen2);
		System.out.println(pen3);
		System.out.println(pen1 == pen2);
		System.out.println(pen1.equals(pen1));
		System.out.println(pen1.equals(pen2));
		System.out.println(pen1.equals("Java"));
		System.out.println(pen1.equals(pen3));
		System.out.println(pen1.hashCode());
		System.out.println(pen2.hashCode());
		System.out.println(pen3.hashCode());
	}
}


/*
	Console of 1) :	
					OverrideEqualsHashCode [color = Pencil, price = 20]
					OverrideEqualsHashCode [color = Rollerball pen, price = 30]
					OverrideEqualsHashCode [color = Fountain pen, price = 80]
					false
					true
					false
					false
					false
					1924010422
					1341443429
					-1885956526


	Console of 2):		
					OverrideEqualsHashCode [color = Pencil, price = 20]
					OverrideEqualsHashCode [color = Rollerball pen, price = 30]
					OverrideEqualsHashCode [color = Fountain pen, price = 80]
					false
					true
					false
					false
					false
					982036583
					1182934204
					-1923228093
			
					
	Console of 3):				
					OverrideEqualsHashCode [color = Pencil, price = 20]
					OverrideEqualsHashCode [color = Rollerball pen, price = 30]
					OverrideEqualsHashCode [color = Fountain pen, price = 80]
					false
					true
					false
					false
					false
					-1907976736
					-931664533
					-616219772


*/
