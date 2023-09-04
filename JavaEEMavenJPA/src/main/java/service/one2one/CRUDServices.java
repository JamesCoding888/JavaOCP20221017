package service.one2one;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.one2one.IdCard;
import entity.one2one.Programming;
import entity.one2one.User;

public class CRUDServices {

	// Create
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
	
	// Insert 
	public static User insertUserOne2One(EntityManager em, String firstName, String lastName, String idNumber, Date issueDate) {
		EntityTransaction transaction = em.getTransaction();
		IdCard newIdCard = new IdCard();
		// 先保存 IdCard，在保存 User
		newIdCard.setIdNumber(idNumber);
		newIdCard.setIssueDate(issueDate);	
		newIdCard.setValid(true);
		User newUser = new User();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);	
		newUser.setIdCard(newIdCard);				
		try {
			transaction.begin();
			/*
			 	若 User class 的 IdCard 加上 cascade = CascadeType.PERSIST 或 cascade = CascadeType.ALL，
			 	當執行保存 em.persist(newUser)，則自動保存 em.persist(newIdCard) 
			 	因此可省略 em.persist(newIdCard) 此行程式
			 	
			 	@OneToOne(cascade = CascadeType.PERSIST) 				
				private IdCard idCard;
			*/
			em.persist(newIdCard); // Persist the new IdCard
			em.persist(newUser); // Persist the new user			
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}			
		return newUser;
	}
	
	public static Programming insertUserInheritance(EntityManager em, String firstName, String lastName, String programmingLanguage) {
		EntityTransaction transaction = em.getTransaction();
		Programming newProgramming = new Programming();
		newProgramming.setFirstName(firstName);
		newProgramming.setLastName(lastName);
		newProgramming.setProgrammingLanguage(programmingLanguage);
		try {
			transaction.begin();
			em.persist(newProgramming); // Persist the new programming + user
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}			
		return newProgramming;
	}
	
	public static Programming insertUserInheritance_One2One(EntityManager em, String firstName, String lastName, String programmingLanguage, String idNumber, Date issueDate, boolean valid) {
		EntityTransaction transaction = em.getTransaction();
		Programming newProgramming = new Programming();
		newProgramming.setFirstName(firstName);
		newProgramming.setLastName(lastName);
		newProgramming.setProgrammingLanguage(programmingLanguage);
		
		IdCard newIdCard = new IdCard();
		newIdCard.setIdNumber(idNumber);
		newIdCard.setIssueDate(issueDate);
		newIdCard.setValid(valid);
		newProgramming.setIdCard(newIdCard);
		
		try {
			transaction.begin();
			em.persist(newProgramming); // Persist the new programming + user
			em.persist(newIdCard); // Persist the new IdCard
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}			
		return newProgramming;
	}
	
	// Update
	public static User update(EntityManager em, Integer id, String firstName, String lastName, String idNumber, Date issueDate) {
		User user = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			user = em.find(User.class, id);
			user.setFirstName(firstName);
			user.setLastName(lastName);			
			IdCard idCard = user.getIdCard();
			System.out.println(idCard);
			idCard.setIdNumber(idNumber);
			idCard.setIssueDate(new Date());
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	// Query
	public static User queryUserOne2One(EntityManager em, Integer id) {
		User user = em.find(User.class, id);
		System.out.printf("ID: %d | First_Name: %s | Last_Name: %s | Id_Number: %s | Issued_Date: %s | Valid: %s\n", 
						  user.getId(), user.getFirstName(), user.getLastName(), 
						  user.getIdCard().getIdNumber(), user.getIdCard().getIssueDate(), user.getIdCard().isValid());
		return user;
	}
	
	public static Programming queryUserInheritance_One2One(EntityManager em, Integer id) {
		Programming programming = em.find(Programming.class, id);
		System.out.printf("ID: %d | First_Name: %s | Last_Name: %s | PROG_Lang: %s | Id_Number: %s | Issued_Date: %s | Valid: %s\n",
						  programming.getId(), programming.getFirstName(), programming.getLastName(), 
						  programming.getProgrammingLanguage(), programming.getIdCard().getIdNumber(), 
						  programming.getIdCard().getIssueDate(), programming.getIdCard().isValid());
		
		return null;
	}
	
	public static IdCard queryIdCard(EntityManager em, Integer id) {
		IdCard idCard = em.find(IdCard.class, id);
		System.out.printf("ID: %d | Id_Number: %s | Issued_Date: %s | Valid: %s\n", idCard.getId(), idCard.getIdNumber(), idCard.getIssueDate(), idCard.isValid());
		return idCard;
	}
	
	public static void loadUsersByLazy(EntityManager em) {
		em.clear();
		TypedQuery<User> query = em.createQuery("from User", User.class);
		/*
			Hibernate: 
			    select
			        user0_.id as id2_3_,
			        user0_.first_name as first_na3_3_,
			        user0_.id_card_id as id_card_6_3_,
			        user0_.last_name as last_nam4_3_,
			        user0_.PROG_LANG as PROG_LAN5_3_,
			        user0_.DTYPE as DTYPE1_3_ 
			    from
			        user user0_		 
		*/
		List<User> resultList = query.getResultList();
		for(User user : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(user.toString());
			IdCard idCard = user.getIdCard();			
			if(idCard != null) {
				// fetch = FetchType.LAZY
				// 需要時，才會至資料庫載入 IdCard 資料
				/*
					Hibernate: 
					    select
					        idcard0_.id as id1_1_0_,
					        idcard0_.id_number as id_numbe2_1_0_,
					        idcard0_.issue_date as issue_da3_1_0_,
					        idcard0_.valid as valid4_1_0_ 
					    from
					        id_card idcard0_ 
					    where
					        idcard0_.id=?
					
					Hibernate: 
					    select
					        idcard0_.id as id1_1_0_,
					        idcard0_.id_number as id_numbe2_1_0_,
					        idcard0_.issue_date as issue_da3_1_0_,
					        idcard0_.valid as valid4_1_0_ 
					    from
					        id_card idcard0_ 
					    where
					        idcard0_.id=?			 
				*/
				sb.append(", ").append(idCard.toString());
			}
			System.out.println(sb);
		}		
	}
	
	public static void loadUsersByEager(EntityManager em) {
		em.clear();
		TypedQuery<User> query = em.createQuery("from User", User.class);
		/*
			Hibernate: 
			    select
			        user0_.id as id2_3_,
			        user0_.first_name as first_na3_3_,
			        user0_.id_card_id as id_card_6_3_,
			        user0_.last_name as last_nam4_3_,
			        user0_.PROG_LANG as PROG_LAN5_3_,
			        user0_.DTYPE as DTYPE1_3_ 
			    from
			        user user0_
			Hibernate: 
			    select
			        idcard0_.id as id1_1_0_,
			        idcard0_.id_number as id_numbe2_1_0_,
			        idcard0_.issue_date as issue_da3_1_0_,
			        idcard0_.valid as valid4_1_0_ 
			    from
			        id_card idcard0_ 
			    where
			        idcard0_.id=?
			
			Hibernate: 
			    select
			        idcard0_.id as id1_1_0_,
			        idcard0_.id_number as id_numbe2_1_0_,
			        idcard0_.issue_date as issue_da3_1_0_,
			        idcard0_.valid as valid4_1_0_ 
			    from
			        id_card idcard0_ 
			    where
			        idcard0_.id=?	 
		*/
		List<User> resultList = query.getResultList();		
		for(User user : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(user.toString());
			IdCard idCard = user.getIdCard();
		
			if(idCard != null) {
				// fetch = FetchType.EAGER
				// 載入 User 資料時 (i.e., 'List<User> resultList = query.getResultList();')，一併自動載入 IdCard 資料，因此執行底下程式碼，不會再執行一次 IdCard 查詢 SQL 語法	
				sb.append(", ").append(idCard.toString());
			}			
			System.out.println(sb);
		}		
	}
	
	public static void loadUsersInnerJoin(EntityManager em) {
		em.clear();
		TypedQuery<User> query = em.createQuery("from User u inner join fetch u.idCard", User.class);
		// fetch = FetchType.EAGER or fetch = FetchType.LAZY
		// 使用 inner join，不論 FetchType.EAGER or FetchType.LAZY，皆產生相同的 SQL 語法
		/*
			Hibernate: 
			    select
			        user0_.id as id2_3_0_,
			        idcard1_.id as id1_1_1_,
			        user0_.first_name as first_na3_3_0_,
			        user0_.id_card_id as id_card_6_3_0_,
			        user0_.last_name as last_nam4_3_0_,
			        user0_.PROG_LANG as PROG_LAN5_3_0_,
			        user0_.DTYPE as DTYPE1_3_0_,
			        idcard1_.id_number as id_numbe2_1_1_,
			        idcard1_.issue_date as issue_da3_1_1_,
			        idcard1_.valid as valid4_1_1_ 
			    from
			        user user0_ 
			    inner join
			        id_card idcard1_ 
			            on user0_.id_card_id=idcard1_.id		 
		*/
		List<User> resultList = query.getResultList();
		for(User user : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(user.toString());
			IdCard idCard = user.getIdCard();
			if(idCard != null) {
				sb.append(", ").append(idCard.toString());
			}
			System.out.println(sb);
		}		
	}
	
}