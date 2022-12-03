package com.ocp.day11_1.decorator;
/*
 	====================================================================================================================================
	The project is almost to be DONE, but suddenly your client request additional function which could query the flavors and price of meal. 
	Engineer is NOT willing to update the original structure of programming because the mostly is settled. 
	Hereinafter, you could design an abstraction class (i.e., AgentOfFood.clas) to create a function that client required to.  
	====================================================================================================================================	
	有一天食物訂單系統專案已接近完工，卻接到客戶要求，需在訂單系統中增加一個功能 (可查詢顧客點的餐點配料和餐點價格)，但基於程式架構已完成，
	工程師為了在不影響訂單系統的程式架構，這時可使用抽象類別 (AgentOfFood.class) 來設計。
	====================================================================================================================================
	
*/ 
public abstract class AgentOfFood extends Food {
	
	public String getNameAndPrice() {
		return "Get all flavors and price: [ " + getName() +  " ]" + " = " + getPrice() ;
	}
	
}
