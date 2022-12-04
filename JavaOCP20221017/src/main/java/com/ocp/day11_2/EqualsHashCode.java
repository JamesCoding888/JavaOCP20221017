package com.ocp.day11_2;

public class EqualsHashCode {
	public static void main(String[] args) {
		OverrideEqualsHashCodeFunction pen1 = new OverrideEqualsHashCodeFunction("Pencil", 20);
		OverrideEqualsHashCodeFunction pen2 = new OverrideEqualsHashCodeFunction("Rollerball pen", 30);
		OverrideEqualsHashCodeFunction pen3 = new OverrideEqualsHashCodeFunction("Fountain pen", 80);
		
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
	Console for 1) :	
					OverrideEqualsHashCodeFunction [color = Pencil, price = 20]
					OverrideEqualsHashCodeFunction [color = Rollerball pen, price = 30]
					OverrideEqualsHashCodeFunction [color = Fountain pen, price = 80]
					false
					true
					false
					false
					false
					1924010422
					1341443429
					-1885956526


	Console for 2):		
					OverrideEqualsHashCodeFunction [color = Pencil, price = 20]
					OverrideEqualsHashCodeFunction [color = Rollerball pen, price = 30]
					OverrideEqualsHashCodeFunction [color = Fountain pen, price = 80]
					false
					true
					false
					false
					false
					982036583
					1182934204
					-1923228093
*/
