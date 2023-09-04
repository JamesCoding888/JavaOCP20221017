package service.composite_pk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.composite_pk.Account;
import entity.composite_pk.AccountId;

/*
	In the code, using a composite primary key (consisting of two fields: accountNumber and accountType) to uniquely identify instances of the Account entity. 
	
	This approach is common when you have a table in a database that doesn't have a single unique identifier but relies on a combination of multiple columns to establish uniqueness.
	
	The reason you need to use the AccountId composite primary key when querying data from the database is because the JPA (Java Persistence API) specification requires you to 
	provide the complete primary key when using the find method to retrieve an entity from the database.
	 
	Here's why:
	
		1) Uniqueness: 
		   A primary key must uniquely identify a row in the database table. 
		   In this sample code, the combination of accountNumber and accountType together forms the unique identifier for an Account entity.
	 
	 	2) Mapping: 
	 	   JPA maps Java objects to database records, and the primary key is a fundamental part of this mapping. 
	 	   When you query for an entity using em.find(Account.class, id), the id parameter must contain all the fields that make up the primary key 
	 	   so that JPA can construct a valid SQL query to retrieve the data.
	 	   
	 	3) Data Integrity: 
	 	   By requiring the complete primary key, JPA ensures that you are specifying a precise identifier, which helps maintain data integrity. 
	 	   You can't accidentally omit part of the identifier, which could lead to incorrect data retrieval.
	
	=================================================================================================================================================================================== 
	
	Introduction of sample code:
	 	
	 	In the code, we're working with composite primary keys in JPA by creating an AccountId class that 
	 	represents the composite key and implementing the equals and hashCode methods for proper comparison and hashing of the key values.

		So, in summary, we need to use the AccountId instance when querying data from the Account entity because it's a requirement of JPA 
		to ensure proper mapping, uniqueness, and data integrity for entities with composite primary keys.
	
	===================================================================================================================================================================================
	
	Drawback of using composite primary key:
	
		1) Using a composite primary key for every query can be cumbersome and may not always be the most practical approach, especially for simple queries.
		
		2) In JPA, when you use the find method, you are explicitly requesting an entity by its primary key, and if your entity has a composite primary key, 
		   you need to provide all parts of that key to uniquely identify the entity. This is a design choice made by JPA 
		   to ensure that you're unambiguously identifying the entity you want to retrieve.
	
	===================================================================================================================================================================================
	
	Some strategies we can consider without relying on the composite primary key:
		
		1) Named Queries: 		  
		   You can define named queries using JPQL (Java Persistence Query Language) in your entity class. 
		   These named queries can use other fields in your entity to filter and retrieve data without specifying the complete composite key.
		
		2) Criteria Queries: 
		   JPA provides the Criteria API, which allows you to build dynamic queries using a programmatic approach. 
		   You can construct queries based on various criteria, not just the primary key.
	 
	 	3) Custom Repository Methods: 
	 	   If you are using a framework like Spring Data JPA, you can define custom repository methods with specific query logic that doesn't require the composite key as a parameter.
	 
	    4) Secondary Indexes: 
	       Depending on your database system, you might be able to create secondary indexes on fields other than the primary key, allowing for efficient queries on those fields.
	 	
	 	5) Entity Identifier Mapping: 
	 	   If possible, consider using a single, auto-generated primary key for your entity, even if the natural key is composite. 
	 	   This can simplify querying, but it may not always be suitable for your data model.
	 	   
	 ===================================================================================================================================================================================
	 
	 Conclusion:  
	 	
	 	The choice between using a composite primary key or a simpler primary key, along with how you query your data, should be based on your specific application requirements and data model. 
	 	Composite primary keys are typically used when there is a natural, composite key that uniquely identifies an entity. 
	 	However, they do introduce some complexities, as you've pointed out. 
	 	You should weigh the benefits and drawbacks of using composite keys in your particular use case.
	 	
	 	
*/
public class CompositePrimaryKeysService {

	// Create
	/*
		Hibernate: 
		    
		    create table Composite_ACCOUNT (
		       ACCOUNT_NUMBER varchar(255) not null,
		        ACCOUNT_TYPE varchar(255) not null,
		        ACCOUNT_NAME varchar(255),
		        primary key (ACCOUNT_NUMBER, ACCOUNT_TYPE)
		    ) engine=InnoDB	 			  		
	*/
	
	// Insert
	/*
		Hibernate: 
		    insert 
		    into
		        Composite_ACCOUNT
		        (ACCOUNT_NAME, ACCOUNT_NUMBER, ACCOUNT_TYPE) 
		    values
		        (?, ?, ?)
		Hibernate: 
		    insert 
		    into
		        Composite_ACCOUNT
		        (ACCOUNT_NAME, ACCOUNT_NUMBER, ACCOUNT_TYPE) 
		    values
		        (?, ?, ?)		 
	*/
	public static void persisteByIdClass() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try{		
			transaction.begin();
			// 保存資料 1
			Account account1 = new Account("N001", "NORMAL");
			account1.setAccountName("Jim1");
			em.persist(account1);
			// 保存資料 2
			Account account2 = new Account("T001", "TEMP");
			account2.setAccountName("Jim2");
			em.persist(account2);			
			transaction.commit();					
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}			
		} finally {
			em.close();
			emf.close();
		}
	}
	
	// Query
	/*
		Hibernate: 
		    select
		        account0_.ACCOUNT_NUMBER as ACCOUNT_1_0_0_,
		        account0_.ACCOUNT_TYPE as ACCOUNT_2_0_0_,
		        account0_.ACCOUNT_NAME as ACCOUNT_3_0_0_ 
		    from
		        Composite_ACCOUNT account0_ 
		    where
		        account0_.ACCOUNT_NUMBER=? 
		        and account0_.ACCOUNT_TYPE=?		 
	*/
	public static void queryByCompositeIdClass() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();		
		try{		
			transaction.begin();			
			// 查詢資料 - 使用 Composite PK 
			AccountId id = new AccountId("N001", "NORMAL");
			Account user = em.find(Account.class, id);
			System.out.printf("|AccountName: %s | AccountNumber: %s | AccountType: %s\n", user.getAccountName(), user.getAccountNumber(), user.getAccountType());
			transaction.commit();					
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}			
		} finally {
			em.close();
			emf.close();
		}
	}
	
	
}
