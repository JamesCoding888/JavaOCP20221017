package controller.composite_pk_embed;

import service.composite_pk_embed.CompositePrimaryKeysEmbedService;

public class CompositePEmbeddableController {
	public static void main(String[] args) {
		// Create (建立 Table 的 Hibernate SQL 語法，請參 persisteByIdClass() method)
		
		// Insert
		CompositePrimaryKeysEmbedService.persistByEmbeddableIdClass();		

		// Query
		CompositePrimaryKeysEmbedService.queryByCompositeEmbeddableIdClass();
		
		
		
	}
}
