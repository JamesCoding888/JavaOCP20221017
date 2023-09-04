package controller.embed;

import service.embed.CRUDServices;

public class EmbedController {

	public static void main(String[] args) {
		//	Create
		CRUDServices.create("mydb");
		
		//	insert
		CRUDServices.insertEmbed();
		CRUDServices.insertEmbeddedProjectToBillingPeriods();
	
	}
		
	
}
