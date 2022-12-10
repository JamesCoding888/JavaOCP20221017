package com.ocp.day14.currency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// The type EnumForUSCurrency cannot be the superclass of SubClass; 
// a superclass must be a class.
class SubClass extends EnumForUSCurrency{
	
	
}
public class TestCoin {
	
	public static void main(String[] args) {
        
		EnumForUSCurrency coinInPenny = EnumForUSCurrency.PENNY;
		EnumForUSCurrency coinInNickle = EnumForUSCurrency.NICKLE;
		EnumForUSCurrency coinInDime = EnumForUSCurrency.DIME;		
		EnumForUSCurrency coinInQuarter = EnumForUSCurrency.QUARTER;
		
		List<EnumForUSCurrency> list = new ArrayList<>(); 
		list.add(coinInPenny);
		list.add(coinInNickle);
		list.add(coinInDime);		
		list.add(coinInQuarter);	
		if(list.isEmpty()) {
			// If there is no any coinObject to be initiated, then execute the follows
			System.out.println("Currency Out of Service");
		} else {
			list.stream().forEach(coinObject -> {

				switch (coinObject.getValue()) {
				case 1:
					System.out.println("penny: " + coinObject.getValue());
					break;
				case 5:
					System.out.println("nickle: " + coinObject.getValue());
					break;
				case 10:
					System.out.println("dime: " + coinObject.getValue());
					break;
				case 25:
					System.out.println("quarter: " + coinObject.getValue());
					break;
				default:
					break;
				};
			});
		} 
    }
}

/*
		Console:
				penny: 1
				nickle: 5
				dime: 10
				quarter: 25
*/
