package com.ocp.day11_1.decorator;

public class Subway {

	public static void main(String[] args) {

		// Bread
		Food food = new Bread("Italian and Parmesan Oregano");
		
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
				

		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", food.getName(), food.getPrice() );	
		System.out.printf("Perfect meal combination: [%s ] is ready. Price: $%d, thank you.\n", ((AFood)food).getNameAndPrice(), food.getPrice());
	}	
}

/*
 	Console: 
 			Perfect meal combination: [Onion + Ham + Olive oil + Tune + Egg + Egg + Tomato + Tomato + Lettuce + Lettuce + Italian and Parmesan Oregano ] is ready. Price: $241, thank you.
			Perfect meal combination: [Onion(22) ] is ready. Price: $241, thank you.

*/