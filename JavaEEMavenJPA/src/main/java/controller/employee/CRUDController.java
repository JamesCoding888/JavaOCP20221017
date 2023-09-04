package controller.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import service.employee.crud.CRUDServices;

public class CRUDController {
	public static void main(String[] args) {
			
			// 1. Create
			CRUDServices.create("mydb");
			
			// 2. For R-U-D
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
			EntityManager em = emf.createEntityManager();
			
			// Insert
			CRUDServices.insert(em, "James", "james@hotmail.com");
			CRUDServices.insert(em, "David", "david@hotmail.com");
			CRUDServices.insert(em, "Tom", "tom@hotmail.com");
			
			// Query
			CRUDServices.query(em, 1);
			CRUDServices.queryByNative(em, 1);
			
			// Update
			CRUDServices.update(em, 1);
			CRUDServices.merge(em, 2);
			CRUDServices.query(em, 1);
			CRUDServices.query(em, 2);
	
			// Delete
			CRUDServices.delete(em, 1);
			CRUDServices.query(em, 1);
	}
}
