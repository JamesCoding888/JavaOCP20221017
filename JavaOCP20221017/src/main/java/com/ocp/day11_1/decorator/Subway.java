package com.ocp.day11_1.decorator;




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
				
		Food food = new Bread(bread);
		
		// Flavors 
		food = new Ham(food);
		food = new Ham(food);		
		food = new Tomato(food);
		food = new Tomato(food);		
		food = new Egg(food);
		food = new Egg(food);
		food = new Tuna(food);
		food = new OliveOil(food);
		food = new Lettuce(food);		
		food = new Onion(food);
		
		// object of food downCasting to Flavors.class
		System.out.println("Meal Combination: " + ((Flavors)food).getName());
		System.out.println("Total Price: $" + ((Flavors)food).getPrice());
		
		// Print out the Meal and Price
		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", food.getName(), food.getPrice() );	
		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", ((AFood)food).getNameAndPrice(), food.getPrice());
		
		scan.close();
	}	
}

/*
 	Console: 
	 		Currently, we only have following options of bread: 1) Wheat 2) Honey Oat 3) Italian and Parmesan Oregano
			Which type of bread? W h e a t
			Currently, we only have following options of bread: 1) Wheat 2) Honey Oat 3) Italian and Parmesan Oregano
			Which type of bread? Wheat
			Meal Combination: Onion + Ham + Olive oil + Tune + Egg + Egg + Tomato + Tomato + Lettuce + Lettuce + Wheat
			Total Price: $241
			Perfect meal combination: [Onion + Ham + Olive oil + Tune + Egg + Egg + Tomato + Tomato + Lettuce + Lettuce + Wheat ] is ready. Price: $241, thank you.
			Perfect meal combination: [Onion(22) ] is ready. Price: $241, thank you.

*/