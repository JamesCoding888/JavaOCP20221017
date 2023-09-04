package controller.person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import service.person.crud.CRUDServices;

public class PersonController {

	public static void main(String[] args) {

		// 1. Create
		CRUDServices.create("mydb");

		// 2. For R-U-D
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		// Insert
		CRUDServices.insertPersonInheritance(em, "James", "Liao", "C#");
		CRUDServices.insertPersonInheritance(em, "David", "Nyon", "Java");
		CRUDServices.insertPersonInheritance(em, "Tom", "Duck", "C++");
		CRUDServices.insertPerson(em, "person", "Go");
		CRUDServices.insertDeveloper(em, "Ajax");

	
		// Query
//		CRUDServices.queryPersonDataOnly(em, 1);
//		CRUDServices.queryDeveloperDataOnly1(em, 2);
//		CRUDServices.queryDeveloperDataOnly2(em, 2);
//		CRUDServices.queryAllByNative(em);
//		
//		// Delete
//		CRUDServices.delete(em, 1);
	}
}
