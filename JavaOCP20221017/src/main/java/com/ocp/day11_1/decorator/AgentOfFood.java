package com.ocp.day11_1.decorator;
/*
 	====================================================================================================================================
	
	The menu of Order System is almost to be DONE, but suddenly your client request additional function 
	which could query the flavors and price of meal. 
	
	Engineer is NOT willing to update the original structure of programming because the mostly is settled. 
	
	Hereinafter, you could design an abstraction class (i.e., AgentOfFood.class) to create a function that client required to.  
	
	Any reason of solution we choose, is abstraction class? 
	
	Since cannot initiate the object of abstraction class by itself, 
	we need the subclass of abstraction class to invoke the variable/method of abstraction class.
	
	And therefore, we could avoid the original structure of programming from updating, 
	but merely have subclass inherit the abstraction class (i.e., AgentOfFood).	
	
	====================================================================================================================================	
	
	點餐訂單系統專案已接近完工，卻接到客戶要求，需在訂單系統中增加一個功能 (可查詢顧客點的餐點配菜和餐點價格)，
	但基於程式架構已完成，工程師為了不影響訂單系統的程式架構，這時可使用抽象類別 (也就是本程式中的 AgentOfFood.class) 來設計。
	
	那為什麼選用抽象類別，因為抽象類別無法將物件實體化，也就是不可從任意類別中，使用 new AgentOfFood()，
	其原因是，抽象類別出現，係為了由子累別實體化的物件，來呼叫抽象類別中的變數或方法，
	如此，可避免去修改既有程式碼的商業邏輯，而僅僅只需讓底層的類別去繼承抽象類別，這樣既不會改動原來的架構
	
	====================================================================================================================================
	
*/ 
public abstract class AgentOfFood extends Food {
	
	public String getNameAndPrice() {
		return "Get all flavors and price: [ " + getName() +  " ]" + " = " + getPrice() ;
	}
	
}
