package controller.pk;

import service.pk.CRUDServices;

public class PKGeneratedController {
	public static void main(String[] args) {
		// Create
		CRUDServices.create("mydb");
		
		
		// Insert
		CRUDServices.insertIdentity();
		CRUDServices.insertTable();
		CRUDServices.insertSequence();
		CRUDServices.insertAuto();
		
	}
		
}
