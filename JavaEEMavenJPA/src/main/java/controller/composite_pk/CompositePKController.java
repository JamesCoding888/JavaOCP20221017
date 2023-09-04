package controller.composite_pk;

import service.composite_pk.CompositePrimaryKeysService;

public class CompositePKController {
	public static void main(String[] args) {
		// Create (建立 Table 的 Hibernate SQL 語法，請參 persisteByIdClass() method)
		
		// Insert
		CompositePrimaryKeysService.persisteByIdClass();		

		// Query
		CompositePrimaryKeysService.queryByCompositeIdClass();
		
		
		
	}
}
