package service.embed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.embed.Period;
import entity.embed.ProjectEmbedded;
import entity.many2many.Designer;
import entity.many2many.Project;

public class CRUDServices {

	// Create
	/*
	 	
		Hibernate: 
		    
		    create table project_embedded (
		       id integer not null auto_increment,
		        END_DATE datetime(6),
		        START_DATE datetime(6),
		        primary key (id)
		    ) engine=InnoDB		
		
		=============================================================================================    
		JPA 建立 'T_BILLING_PERIOD' Table，用於存放特定單一 Project-To-Many 存款期程
		
		Hibernate: 
		    
		    create table T_BILLING_PERIOD (
		       PROJECT_ID integer not null,
		        END_DATE datetime(6),
		        START_DATE datetime(6)
		    ) engine=InnoDB
		Hibernate: 
		    
		    alter table T_BILLING_PERIOD 
		       add constraint FKn4o0q6sglrao5nkiy1dkgko0l 
		       foreign key (PROJECT_ID) 
		       references project_embedded (id)		   
	*/
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}

	// Insert
	/*
		Hibernate: 
		    insert 
		    into
		        project_embedded
		        (END_DATE, START_DATE) 
		    values
		        (?, ?) 
	*/
	public static void insertEmbed() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		// Create instance of Period and ProjectEmbedded
		Period period = new Period();
		ProjectEmbedded projectEmbedded = new ProjectEmbedded();
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter startDate = new SpecificDateTimeSetter();
		SpecificDateTimeSetter endDate = new SpecificDateTimeSetter();
		// 新增 startDate
		startDate.setSpecificDateTime(2023, 9, 1, 9, 00, 0, 000); // Set September 1, 2023, 09:00:00.000 as the specific date and time
        Date sd = startDate.getSpecificDateTime();
        period.setStartDate(sd);
		// 新增 endDate
        endDate.setSpecificDateTime(2023, 12, 1, 9, 30, 0, 000); // Set December 1, 2023, 09:30:00.000 as the specific date and time
        Date ed = endDate.getSpecificDateTime();                
        period.setEndDate(ed);
        // 新增至 projectEmbedded
        projectEmbedded.setProjectPeriod(period);
		try {
			transaction.begin();
			em.persist(projectEmbedded);
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
	
	
	public static void insertEmbeddedProjectToBillingPeriods() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		// Create instance of ProjectEmbedded 
		ProjectEmbedded projectEmbedded = new ProjectEmbedded();
		// Create instance of Many Period 
		Period period1 = new Period();
		Period period2 = new Period();
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter startDate = new SpecificDateTimeSetter();
		SpecificDateTimeSetter endDate = new SpecificDateTimeSetter();
		// 新增 Period1 startDate & endDate
		startDate.setSpecificDateTime(2023, 11, 1, 9, 00, 0, 000); // Set September 1, 2023, 09:00:00.000 as the specific date and time
        Date sd = startDate.getSpecificDateTime();
        period1.setStartDate(sd);
        endDate.setSpecificDateTime(2023, 12, 1, 9, 30, 0, 000); // Set December 1, 2023, 09:30:00.000 as the specific date and time
        Date ed = endDate.getSpecificDateTime();                
        period1.setEndDate(ed);
        // 新增 Period2 startDate & endDate
     	startDate.setSpecificDateTime(2023, 10, 1, 9, 00, 0, 000); // Set September 1, 2023, 09:00:00.000 as the specific date and time
        Date sd2 = startDate.getSpecificDateTime();
        period2.setStartDate(sd2);
        endDate.setSpecificDateTime(2024, 1, 1, 9, 30, 0, 000); // Set December 1, 2023, 09:30:00.000 as the specific date and time
        Date ed2 = endDate.getSpecificDateTime();                
        period2.setEndDate(ed2);        
        // 新增 Many Period 至 projectEmbedded
        List<Period> billingPeriods = new ArrayList<Period>();
        billingPeriods.add(period1);
        billingPeriods.add(period2);              
        projectEmbedded.setBillingPeriods(billingPeriods);      
		try {
			// Transaction begin
			transaction.begin();
			// 執行保存，將 EntityManager 管控的 Entity 釋放，但仍可 Roll-back
			em.persist(projectEmbedded);
			// Flush to Database, and cannot Roll-back
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
