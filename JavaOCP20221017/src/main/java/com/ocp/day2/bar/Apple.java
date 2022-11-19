package com.ocp.day2.bar;


public class Apple {
    // Visibility: public
	public static void a1() {
        System.out.println("a1()");
    }
	
    // Visibility: default
    static void a2() {
        System.out.println("a2()");
    }

    

    /*     	
     	The type of radius variable by "protected":
    	把變數宣告為 protected 之用處:

		1) This protected variable could be used mutually 
		   父子類別皆能使用
		   
		2) Any .class is Out of the Parent and child's class, 
		   they are NOT able to access into protected variable
		   任何類別與父、子類別無繼承關係者，無法進入 protected variable 存取

    */
    // Visibility: protected
    protected static double pi = Math.PI;
    protected double radius;
    public void show()
    {
       System.out.println("Area of Apple = " + pi * Math.pow(radius, 2));
    }
    
    // Visibility: private
    private static void a3() {
        System.out.println("a3()");
        a1();
        a2();
    }
}
