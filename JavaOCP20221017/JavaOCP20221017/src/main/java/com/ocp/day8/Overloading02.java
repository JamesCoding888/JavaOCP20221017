package com.ocp.day8;

// The following sample code by changing the number of parameters
// 此範例講述方法重載 (引數長度不同)
public class Overloading02 {

	// Gloabl Variables 
	String food;
	Integer quantity;
	final double price = 70.12; // fixed price of food - Constant Variable 
	double totalPrice;
	long E_INVOICE_NUMBER;
	int date;
	
	// Menu - 墨西哥飲食 (Mexican cuisine)
	public void menu(String food) {
		this.food = food;
	}
	
	public void menu(Integer quantity) {
		this.quantity = quantity;
		this.totalPrice = quantity * price;
	}
	
	public void menu() {
		System.out.printf("Dear Customer, here your are. %.2f dollars\n", totalPrice);
	}

	
	// Type of E_INVOICE_NUMBER: final, since the number of E-invoice shall be unit without duplication 
	// 因為電子發票的號碼，不可重複，具有唯一性之常數
	public void menu(final long E_INVOICE_NUMBER, int date) {
		this.E_INVOICE_NUMBER = E_INVOICE_NUMBER;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "{ { Your order of " + food + " are " + '$' + totalPrice + " dollars }" + ',' + " { E_INVOICE_NUMBER: " + E_INVOICE_NUMBER + ", Date: " + date + " 日 " + "} }";
	}
	
	public static void main(String[] args) {
		Overloading02 overloading = new Overloading02();
		overloading.menu("Burrito"); // "Burrito" is Mexican Food
		overloading.menu(10);        //  Place an order for 10 		
		overloading.menu(21908888, 19);
		System.out.println(overloading.toString());	
	}
}

/*
	Console:
		{ { Your order of Burrito are $701.2 dollars }, { E_INVOICE_NUMBER: 21908888, Date: 19 日 } }
*/
