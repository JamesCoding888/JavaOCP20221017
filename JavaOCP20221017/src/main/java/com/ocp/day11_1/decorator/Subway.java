package com.ocp.day11_1.decorator;

/*
 	Of this lecture - Decorator Pattern (a menu of Subway Order System). 
 	We design a Scanner object for customer to choose three fixed option of bread (i.e., Wheat, Honey Oat, or Italian and Parmesan Oregano). 
 	
 	Well, let's go back to the topic regarding Decorator Pattern. 
 	Firstly, you will see the many different initiated objects from o1 to o11. 
 	Please read the line at 40 and 48-57. Each of initiated object will be the argument of the next Constructor. 
 	It's likely all of them are wrapped up as decoration of furniture at house. 
 	For an instance of your house, you may need a big door, chairs, a oval table, a set of sofa, two Televisions, and many bulbs...etc. 
 	Those of furniture of house, it seems that you can add or remove whenever you want. 
 	For this said, you are hangry now, and need to order a meal of subway. 
 	You could choose what kind of bread you need, and also what flavors you would like to decorate into the bread. 
 	Just in case of the reason you like to remove one of flavors (e.g., egg), then make an annotation of it. 
 	
 	By the way, if you forgot how operation of Scanner and nextLine() could be, please refer to the previously package at com.ocp.day6.ScannerPractice
 	
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
			Which type of bread? W h e a t
			Currently, we only have following options of bread: 1) Wheat 2) Honey Oat 3) Italian and Parmesan Oregano
			Which type of bread? Wheat
			Meal Combination: Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat
			Total Price: $241
			Perfect meal combination: [Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] is ready. Price: $241, thank you.
			Perfect meal combination: [Get all flavors and price: [ Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] = 241 ] is ready. Price: $241, thank you.
			Get all flavors and price: [ Onion + Lettuce + Olive oil + Tuna + Egg + Egg + Tomato + Tomato + Ham + Ham + Wheat ] = 241

*/