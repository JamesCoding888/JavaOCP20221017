package controller.one2one;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.Persistence;
import service.one2one.CRUDServices;

public class One2OneController {

	public static void main(String[] args) {

		// 1. Create
//		CRUDServices.create("mydb");

		// 2. For R-U-D
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		// Insert
//		CRUDServices.insertUserOne2One(em, "Ted", "Wang","123456789", new Date());
//		CRUDServices.insertUserInheritance(em, "Tim", "Liao", "C#");
//		CRUDServices.insertUserInheritance_One2One(em, "Ted", "Go", "Java", "682932742", new Date(), true);
		
		// Update
//		CRUDServices.update(em, 1, "Moris", "Chang", "B12345678", new Date());
		
		// Query
//		CRUDServices.queryUserOne2One(em, 1);		
//		CRUDServices.queryIdCard(em, 1);
		/*
			查詢結果，Hibernate 產製的 SQL 語法，若 IdCard @OneToOne(fetch = FetchType.LAZY) 
			比 @OneToOne(fetch = FetchType.EAGER) 多一次查詢。
			
			因 @OneToOne(fetch = FetchType.EAGER) 使用 Left Outer Join
		*/		
//		CRUDServices.queryUserInheritance_One2One(em, 3);  
		
		/*
		 	執行此 method 不受 FetchType.EAGER 或 FetchType.LAZY 的設定
		 	
		 	
		 	TBD 待整理
		 	
		 	
		*/
//		CRUDServices.loadUsersByLazy(em);
//		CRUDServices.loadUsersByEager(em);
		CRUDServices.loadUsersInnerJoin(em);
	}
}
