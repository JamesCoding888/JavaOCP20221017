package com.ocp.day2.bar;
// This lesson we introduce the application of protected variable 
// 建立 Apple.class 範例，係為了講授 protected 的變數之運用

class Area extends Apple {

	private int value;

	public Area(double r, int v){
		// Use the protected variable of radius from Apple.class
		// 使用父類別 (Apple.class) 的 protected radius 變數  
		radius = r;    
	    value = v;
	    System.out.println("radius variable (from Apple.class) = " + radius + ", value = " + value);
	}
}

public class Fruit{
	public static void main(String args[]) {
		Area area = new Area(1, 10);
		area.show();
	}
}


/*
	Console:
			radius variable (from Apple.class) = 1.0, value = 10
			Area of Apple = 3.141592653589793

*/	