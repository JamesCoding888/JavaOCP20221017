package controller.many2many;

import service.many2many.CRUDServices;

public class Many2ManyController {

	public static void main(String[] args) {
		// 1. Create
//		CRUDServices.create("mydb");
		
		// 2. For R-U-D		
		// Insert		
//		CRUDServices.insertMany2Many();	
//		CRUDServices.bindProject();
		
		// Query
//		CRUDServices.queryDesigner(1);
//		CRUDServices.queryDesigners();
		CRUDServices.loadProject();
	}
		
}
