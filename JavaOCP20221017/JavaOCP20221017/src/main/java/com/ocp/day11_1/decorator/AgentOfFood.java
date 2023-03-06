package com.ocp.day11_1.decorator;
/*
 	====================================================================================================================================
	
	For a purpose of designing the abstraction class here, please imagine that your project (e.g., Menu of Order System) 
	is almost to be DONE, but suddenly your client request additional function which could query the flavors and price of meal. 
	
	Engineer is NOT willing to update the original structure of programming because the mostly is settled. 
	Hereinafter, you could design an abstraction class (i.e., AgentOfFood.class) to create a function that client required to.  
	
	Any reason of solution we choose, is abstraction class? Since cannot initiate the object of abstraction class by itself, 
	we need the subclass of abstraction class to invoke the variable/method of abstraction class.
	
	And therefore, we could avoid the original structure of programming from updating, 
	but merely have subclass inherit the abstraction class (i.e., AgentOfFood).
	
	For the sake of designing an abstraction class, you may have many requirements from different clients, 
	then you merely manage the package of abstraction class without any impact on the original design.
	
	====================================================================================================================================	
	
	設計此抽象類別之用意，請讀者想像一個情境，假設您目前執行的專案為『點餐訂單系統』且已接近完工，卻接到客戶要求，
	需在訂單系統中增加一個功能 (可查詢顧客點的餐點配菜和餐點價格)，但基於程式架構已完成，工程師為了不影響訂單系統的程式架構，
	這時可使用抽象類別 (也就是本程式中的 AgentOfFood.class) 來設計。
	
	那為什麼選用抽象類別，因為抽象類別無法將物件實體化，也就是不可從任意類別中，使用 new AgentOfFood()，
	其原因是，抽象類別係為了由子類別實體化的物件，來呼叫抽象類別中的變數或方法，
	如此，可避免設計者去修改既有程式碼的商業邏輯，而僅僅只需讓底層的類別去繼承抽象類別，這樣既保有原來的架構，後期在維護上也能因應不同的客戶之需求，建立其它的抽象類別之功能。
	最後設計者只需管理抽象類別包，都不需動到底層的架構
	
	====================================================================================================================================
	
*/ 
public abstract class AgentOfFood extends Food {
	
	public String getNameAndPrice() {
		return "Get all flavors and price: [ " + getName() +  " ]" + " = " + getPrice() ;
	}
	
}
