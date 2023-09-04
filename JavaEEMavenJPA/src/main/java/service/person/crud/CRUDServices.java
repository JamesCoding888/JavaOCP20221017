package service.person.crud;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import entity.Developer;
import entity.Person;

public class CRUDServices {

	// Create
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
	
	// Insert 
	public static Person insertPerson(EntityManager em, String firstName, String lastName) {
		EntityTransaction transaction = em.getTransaction();
		Person newPerson = new Person();
		newPerson.setFirstName(firstName);
		newPerson.setLastName(lastName);		
		try {
			transaction.begin();
			em.persist(newPerson); // Persist the new person
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
		return newPerson;
	}
	
	public static Developer insertDeveloper(EntityManager em, String programmingLanague) {
		EntityTransaction transaction = em.getTransaction();
		Developer newDev = new Developer();
		newDev.setProgrammingLanguage(programmingLanague);
				
		try {
			transaction.begin();
			em.persist(newDev); // Persist the new dev
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
		return newDev;
	}
	
	public static Developer insertPersonInheritance(EntityManager em, String firstName, String lastName, String PROG_LANG) {
		EntityTransaction transaction = em.getTransaction();
		Developer newDev = new Developer();
		newDev.setFirstName(firstName);
		newDev.setLastName(lastName);
		newDev.setProgrammingLanguage(PROG_LANG);
		try {
			transaction.begin();
			em.persist(newDev); // Persist the new dev
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
		return newDev;
	}

	// Query		
	// 單筆查詢 Person
	public static void queryPersonDataOnly(EntityManager em, int id) {
		Person person = em.find(Person.class, id);
		if(person instanceof Person) {
			System.out.printf("ID: %d | first_name: %s | last_name: %s\n", 
					person.getId(), person.getFirstName(), person.getLastName());	
		}		
		em.close();
	}
	
	// 單筆查詢 Developer
	public static void queryDeveloperDataOnly1(EntityManager em, int id) {
		Person person = em.find(Person.class, id);
		if(person instanceof Developer) {
			Developer dev = (Developer) person;
			System.out.printf("PROG_LANG: %s\n", dev.getProgrammingLanguage());
		}		
		em.close();
	}
	
	public static void queryDeveloperDataOnly2(EntityManager em, int id) {
		Developer dev = em.find(Developer.class, id);
		if(dev instanceof Developer) {
			System.out.printf("PROG_LANG: %s\n", dev.getProgrammingLanguage());
		}		
		em.close();
	}
	
	// 多筆查詢 Person + Developer
	public static void queryAllByNative(EntityManager em) {
		/*
		 	1) 執行 JPQL 語法時，注意 Java is case-sensitive， 'person' 要改為 'Person'，與 Person class 名稱一致。
		 	   除非使用 nativeQuery (原生的 SQL 語法)，則 'person' 或 'Person' 皆可，因對應的是 Table name
		 	
		 	2) 若使用 JPQL 語法，將 'Person' 改為 'person'，則出現底下錯誤:				
			   org.hibernate.hql.internal.ast.QuerySyntaxException: person is not mapped, is likely due to the fact that the query is case-sensitive when referring to the entity names.
			   In JPQL query, you should use the entity class name (Person and Developer) instead of the table names (person and developer). 
			   Java is case-sensitive, so you should use the correct class names exactly as they are defined.				 
		*/
		TypedQuery<Person> query = em.createQuery("SELECT p FROM Person p", Person.class); // JPQL 語法 "SELECT p FROM Person"
//		Query query = em.createNativeQuery("SELECT * FROM person", Person.class); // "SELECT * FROM person" 語法等同 "SELECT p.* FROM person p" 
		List<Person> personList = query.getResultList();
		em.close();
		for (Person p : personList) {
			if (p instanceof Developer) {
	            Developer dev = (Developer) p;
	            System.out.printf("ID: %d | first_name: %s | last_name: %s | PROG_LANG: %s\n", 
	            		dev.getId(), dev.getFirstName(), dev.getLastName(), dev.getProgrammingLanguage());
	        } else {
	        	System.out.printf("ID: %d | first_name: %s | last_name: %s\n", 
	            		p.getId(), p.getFirstName(), p.getLastName());	
	        }			
		}
	}	
	
	// Delete
	public static void delete(EntityManager em, int id) {
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Person person = em.find(Person.class, id);
			if (person != null) {
				em.remove(person); // Delete the person
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
	}	
}
