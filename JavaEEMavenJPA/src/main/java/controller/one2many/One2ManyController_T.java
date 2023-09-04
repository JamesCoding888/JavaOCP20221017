package controller.one2many;

import service.one2many.CRUDServices_T;

public class One2ManyController_T {

	public static void main(String[] args) {
		// 1. Create
//		CRUDServices_T.create("mydb");
		
		// 2. For R-U-D		
		// Insert
		CRUDServices_T.insertOwnerOne2Many();
		
		// Query 
		// ... 本查詢功能不在實作一次，請參 CRUDServices class
		
	}
		
}
