package controller.one2many;

import service.one2many.CRUDServices;

public class One2ManyController {

	public static void main(String[] args) {
		// 1. Create
//		CRUDServices.create("mydb");
		
		
		// 2. For R-U-D		
		// Insert
//		CRUDServices.insertOwnerOne2Many();
		
		// Query
//		CRUDServices.loadOwnerOne2ManyByLazy();
//		CRUDServices.loadOwnerOne2ManyByEager();
//		CRUDServices.loadOwnerOne2ManyByLeftJoin();
//		CRUDServices.loadPhoneOne2ManyByEager();
//		CRUDServices.loadPhoneOne2ManyByLazy();
		CRUDServices.loadPhoneMany2OneByInnerJoin();
//		CRUDServices.loadPhoneMany2OneByLazy();
//		CRUDServices.loadPhoneMany2OneByEager();
		
	}
		
}
