package com.ocp.day14.pojo;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestNumPOJO {
	public static void main(String[] args) {
		
		Set<NumPOJO> listkedHashSet1 = new LinkedHashSet<>();
		listkedHashSet1.add(new NumPOJO(100, 0.5));
		listkedHashSet1.add(new NumPOJO(100, 0.5));
		listkedHashSet1.add(new NumPOJO(500, 0.2));
		listkedHashSet1.add(new NumPOJO(1000, 0.1));
        System.out.println("NumPOJO :" + listkedHashSet1);
 
        double sum1 = listkedHashSet1.stream()
                         		     .mapToDouble((NumPOJO numPOJO) -> numPOJO.getCash() * numPOJO.getRate())
                         		     .sum();
        System.out.println("NumPOJO :" + sum1);
		
        Set<NumNonPOJOWithoutHashCode> listkedHashSet2 = new LinkedHashSet<>();
		listkedHashSet2.add(new NumNonPOJOWithoutHashCode(100, 0.5));
		listkedHashSet2.add(new NumNonPOJOWithoutHashCode(100, 0.5));
		listkedHashSet2.add(new NumNonPOJOWithoutHashCode(500, 0.2));
		listkedHashSet2.add(new NumNonPOJOWithoutHashCode(1000, 0.1));

		// Please remove all methods of "public int hashCode(){ ... }
        // Please see the console of following println, you will find the result is violation of specification of Set
		System.out.println("NumNonPOJOWithoutHashCode: " + listkedHashSet2);
        double sum2 = listkedHashSet2.stream()
                         		     .mapToDouble((NumNonPOJOWithoutHashCode numNonPOJOWithoutHashCode) -> numNonPOJOWithoutHashCode.getCash() * numNonPOJOWithoutHashCode.getRate())
                         		     .sum();
        System.out.println("NumNonPOJOWithoutHashCode: " + sum2);
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
	
	Console of 4) Override the method of "public int hashCode(){ ... }":
				
		com.ocp.day14.pojo.NumPOJO@349b
		com.ocp.day14.pojo.NumPOJO@5444f5ad
	
	Console of 5) With overriding hashCode or NOT 
		
		NumPOJO :[num [cash=100, rate=0.5], num [cash=500, rate=0.2], num [cash=1000, rate=0.1]]
		NumPOJO :250.0
		NumNonPOJOWithoutHashCode: [num [cash=100, rate=0.5], num [cash=100, rate=0.5], num [cash=500, rate=0.2], num [cash=1000, rate=0.1]]
		NumNonPOJOWithoutHashCode: 300.0
	


*/
