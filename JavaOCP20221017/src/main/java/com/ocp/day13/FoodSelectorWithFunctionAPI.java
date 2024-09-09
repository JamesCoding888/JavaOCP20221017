package com.ocp.day13;

import java.util.Scanner;
import java.util.function.Function;

enum Food{
	SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large"),
    EXTRA_LARGE("Extra Large"),
    INVALID_FOOD_CODE("Invalid Food Code");	
	
	// Fields for the label and price        
    private final String detailString;	
	
    private Food(String detailString) {
		this.detailString = detailString;		
	}
	
    public static Food getByCode(Integer foodCode) {
        switch (foodCode) {
            case 1:
                return Food.SMALL;
            case 2:
                return Food.MEDIUM;
            case 3:
                return Food.LARGE;
            case 4:
                return Food.EXTRA_LARGE;
            case 0:            	
            	System.exit(0);
            default:
                return Food.INVALID_FOOD_CODE;            	
        }
    }
	public String getDetail() {
		return detailString;
	}
	
}
public class FoodSelectorWithFunctionAPI {
	static Scanner scan = new Scanner(System.in);
	static Integer foodCode;
	public static void main(String[] args) {		
		while(true) {
			System.out.print("請選擇飲料大小 (1:Small, 2:Medium, 3:Large, 4:Extra_Large, 0:Terminate): ");		
			Function<Integer, String> functionAction = (Integer foodCode) -> {
				return Food.getByCode(foodCode).getDetail();
			};
			foodCode = Integer.valueOf(scan.nextInt());
			String detail = functionAction.apply(foodCode);
			System.out.printf("Your selection of size is \"%s\"\n", detail);			
		}		
	}
}
