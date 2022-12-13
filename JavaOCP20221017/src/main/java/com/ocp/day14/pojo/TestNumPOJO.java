package com.ocp.day14.pojo;

public class TestNumPOJO {
	
	public static void main(String[] args) {
		
		NumPOJO numPOJO1 = new NumPOJO();
		NumPOJO numPOJO2 = new NumPOJO(100, 30.28);
		System.out.println(numPOJO1);
		System.out.println(numPOJO2);		
		
	}
}


/*	 
    Console of 1) Override the method of "public int hashCode(){ ... }":
	 
		com.ocp.day14.pojo.NumPOJO@3c1
		com.ocp.day14.pojo.NumPOJO@5444b6c3
	
	Console of 2) Override the method of "public int hashCode(){ ... }":
		
		com.ocp.day14.pojo.NumPOJO@3e0
		com.ocp.day14.pojo.NumPOJO@5444b6e2
	
	Console of 3) Override the method of "public int hashCode(){ ... }":
		
		com.ocp.day14.pojo.NumPOJO@1a47
		com.ocp.day14.pojo.NumPOJO@1e4d

*/
