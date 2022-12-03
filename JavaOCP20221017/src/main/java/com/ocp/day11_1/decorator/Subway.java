package com.ocp.day11_1.decorator;

/*
 
 
 
 
*/

import java.util.Scanner;
public class Subway {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String bread;

		while(true) {
		
			System.out.println("Currently, we only have following options of bread: 1) Wheat 2) Honey Oat 3) Italian and Parmesan Oregano") ;
			System.out.print("Which type of bread? ");
			
			bread = scan.nextLine();
						
			if(bread.equals("Wheat") ? true : bread.equals("Honey Oat") ? true : bread.equals("Italian and Parmesan Oregano") ? true : false) {
				break;
			}							
		}
				
		Food food = new Bread(bread); // o1 (the innermost object will be the 1st object)
		
		// Flavors 
		/*	
		    Same as following syntax:
			food = new Onion(new Lettuce(new OliveOil(new Tuna(new Egg(new Egg(new Tomato(new Tomato(new Ham(new Ham(new Bread(bread)))))))))));
			          o11       o10         o9           o8       o7      o6      o5         o4         o3      o2      o1 
		*/
		food = new Ham(food);  		  // o2  ...
		food = new Ham(food);		  // o3  ...
		food = new Tomato(food);  	  // o4  ...
		food = new Tomato(food);	  // o5  ...
		food = new Egg(food);  		  // o6  ...
		food = new Egg(food);         // o7  ...
		food = new Tuna(food);  	  // o8  ...
		food = new OliveOil(food);    // o9  ...
		food = new Lettuce(food);	  // o10 (next of the outermost object)
		food = new Onion(food);       // o11 (the outermost object)
					
		// object of food downCasting to Flavors.class
		System.out.println("Meal Combination: " + ((Flavors)food).getName());
		System.out.println("Total Price: $" + ((Flavors)food).getPrice());
		
		// Print out the Meal and Price
		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", food.getName(), food.getPrice() );	
		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", ((AgentOfFood)food).getNameAndPrice(), food.getPrice());
		
		// New function to query the all name and price of meal
		System.out.println(((Flavors)food).getNameAndPrice());
		
		
		scan.close();
	}	
}

/*
 	Console: 
	 		Currently, we only have following options of bread: 1) Wheat 2) Honey Oat 3) Italian and Parmesan Oregano
			Which type of bread? Wheat
			Meal Combination: Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat
			Total Price: $241
			Perfect meal combination: [Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] is ready. Price: $241, thank you.
			Perfect meal combination: [Get all flavors and price: [ Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] = 241 ] is ready. Price: $241, thank you.
			Get all flavors and price: [ Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] = 241

*/