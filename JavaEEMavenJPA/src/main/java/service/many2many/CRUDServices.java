package service.many2many;

import java.util.ArrayList;
import java.util.Arrays;
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
import entity.many2many.Project.ProjectType;
import entity.one2one.IdCard;
import service.embed.SpecificDateTimeSetter;


public class CRUDServices {

	// Create
	/*
		Hibernate: 
		    
		    create table person_many (
		       DTYPE varchar(31) not null,
		        id integer not null auto_increment,
		        first_name varchar(255),
		        last_name varchar(255),
		        prog_lang varchar(255),
		        id_card_id integer,
		        primary key (id)
		    ) engine=InnoDB
		Hibernate: 
		    
		    create table person_project (
		       project_id integer not null,
		        designer_id integer not null
		    ) engine=InnoDB
		Hibernate: 
		    
		    create table project (
		       id integer not null auto_increment,
		        end_date datetime(6),
		        project_type varchar(255),
		        start_date datetime(6),
		        title varchar(255),
		        primary key (id)
		    ) engine=InnoDB
		Hibernate: 
		    
		    alter table person_many 
		       add constraint FK1yla88ij0ci4mbypgkscyhaca 
		       foreign key (id_card_id) 
		       references id_card (id)
		Hibernate: 
		    
		    alter table person_project 
		       add constraint FKbptk3m22oahhg6yletw7mv3of 
		       foreign key (designer_id) 
		       references project (id)
		Hibernate: 
		    
		    alter table person_project 
		       add constraint FKcb0682fxd4idjr270yh43sona 
		       foreign key (project_id) 
		       references person_many (id)				 
	*/
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
	
	
	// insert
	/*
		Hibernate: 
		    insert 
		    into
		        project
		        (end_date, project_type, start_date, title) 
		    values
		        (?, ?, ?, ?)
		Hibernate: 
		    insert 
		    into
		        project
		        (end_date, project_type, start_date, title) 
		    values
		        (?, ?, ?, ?)
		Hibernate: 
		    insert 
		    into
		        id_card
		        (id_number, issue_date, valid) 
		    values
		        (?, ?, ?)
		
		Hibernate: 
		    insert 
		    into
		        person_many
		        (first_name, id_card_id, last_name, prog_lang, DTYPE) 
		    values
		        (?, ?, ?, ?, 'Designer')
		Hibernate: 
		    insert 
		    into
		        person_project
		        (project_id, designer_id) 
		    values
		        (?, ?)
		Hibernate: 
		    insert 
		    into
		        person_project
		        (project_id, designer_id) 
		    values
		        (?, ?)		
	*/
	public static void insertMany2Many() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		// 新增 project
		Project project1 = new Project();
		project1.setStartDate(new Date());
		/*
		project1.setProjectType("Finance");
//		*/
		// 使用 Enum 型態的欄位
		/*
		project1.setProjectType(Project.ProjectType.SHORT);
		*/			
		project1.setTitle("Fido - Transaction");
		project1.setEndDate(new Date());
		Project project2 = new Project();		
		project2.setStartDate(new Date());
		/*
		project2.setProjectType("AI");
		*/
		// 使用 Enum 型態的欄位
//		/*
		project2.setProjectType(Project.ProjectType.LONG);
//		*/
		project2.setTitle("ChatGPT - OpenAPI");
		project2.setEndDate(new Date());
		List<Project> pList = new ArrayList<>();
		pList.add(project1);
		pList.add(project2);
		
		// 新增 IdCard
		IdCard idCard = new IdCard();
		idCard.setIdNumber("999999");
		idCard.setIssueDate(new Date());
		idCard.setValid(true);
		
		// 新增 designer
		Designer designer1 = new Designer();
		designer1.setFirstName("James");
		designer1.setLastName("Gruicci");		
		designer1.setProjects(pList);	
		designer1.setProgLang(".NET");		
		designer1.setIdCard(idCard);
		try {
			transaction.begin();
			// 保存
			em.persist(project1);
			em.persist(project2);			
			// 如果 designer 有包含 idCard 時，先執行保存 idCard 在執行保存 designer
			em.persist(idCard); 
			em.persist(designer1);			
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

	// bindProject
	public static void bindProject() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		List<Designer> rows = em.createQuery("from Designer where prog_lang = :lang", Designer.class)
				.setParameter("lang", ".NET").getResultList();

		// 取得 Period instance 給 Project 使用
		Period projectPeriod = new Period();
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter startDate = new SpecificDateTimeSetter();
		SpecificDateTimeSetter endDate = new SpecificDateTimeSetter();
		// 設定 project startDate
		startDate.setSpecificDateTime(2019, 8, 1, 9, 00, 0, 000);
		Date sd = startDate.getSpecificDateTime();
		projectPeriod.setStartDate(sd);
		// 設定 project endDate
		endDate.setSpecificDateTime(2019, 12, 31, 9, 30, 0, 000);
		Date ed = endDate.getSpecificDateTime();
		projectPeriod.setEndDate(ed);
		// 取得 Period instance 給 billing 使用
		Period billingPeriod1 = new Period();
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter billingstartDate1 = new SpecificDateTimeSetter();
		SpecificDateTimeSetter billingendDate1 = new SpecificDateTimeSetter();
		// 設定 billing startDate
		billingstartDate1.setSpecificDateTime(2020, 1, 1, 9, 00, 0, 000);
		Date sd4Billing1 = billingstartDate1.getSpecificDateTime();
		billingPeriod1.setStartDate(sd4Billing1);
		// 設定 billing endDate
		billingendDate1.setSpecificDateTime(2020, 1, 31, 9, 30, 0, 000);
		Date ed4Billing1 = billingendDate1.getSpecificDateTime();
		billingPeriod1.setEndDate(ed4Billing1);
		// 取得 Period instance 給 billing 使用
		Period billingPeriod2 = new Period();
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter billingstartDate2 = new SpecificDateTimeSetter();
		SpecificDateTimeSetter billingendDate2 = new SpecificDateTimeSetter();
		// 設定 billing startDate
		billingstartDate2.setSpecificDateTime(2020, 2, 1, 9, 00, 0, 000);
		Date sd4Billing2 = billingstartDate2.getSpecificDateTime();
		billingPeriod2.setStartDate(sd4Billing2);
		// 設定 billing endDate
		billingendDate2.setSpecificDateTime(2020, 2, 31, 9, 30, 0, 000);
		Date ed4Billing2 = billingendDate2.getSpecificDateTime();
		billingPeriod2.setEndDate(ed4Billing2);

		//
		List<Period> billingPeriods = Arrays.asList(billingPeriod1, billingPeriod2);
		Project project = new Project();
		project.setTitle("Java Project");
		project.setProjectType(ProjectType.LONG);
		project.setStartDate(sd);
		project.setEndDate(ed);
		// ProjectEmbeded 的功能應寫在 Entity Project 中，才會與書本一致。本範例採分開，將 billingPeriod 的資料存放於 T_BILLING_PERIOD Table 中
		ProjectEmbedded projectEmb = new ProjectEmbedded();
		projectEmb.setBillingPeriods(billingPeriods);

		for (Designer d : rows) {
			// Test - Check if the entity of designer being found
			System.out.println("Get result of rows: " + d.getFirstName());
			project.getDesigners().add(d);
		}

		try {
			transaction.begin();
			em.persist(project);
			em.persist(projectEmb);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
	}	
	
	// Query	
	public static void queryDesigner(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		/*
			Hibernate: 
			    select
			        designer0_.id as id2_5_0_,
			        designer0_.first_name as first_na3_5_0_,
			        designer0_.id_card_id as id_card_6_5_0_,
			        designer0_.last_name as last_nam4_5_0_,
			        designer0_.prog_lang as prog_lan5_5_0_,
			        idcard1_.id as id1_1_1_,
			        idcard1_.id_number as id_numbe2_1_1_,
			        idcard1_.issue_date as issue_da3_1_1_,
			        idcard1_.valid as valid4_1_1_ 
			    from
			        person_many designer0_ 
			    left outer join
			        id_card idcard1_ 
			            on designer0_.id_card_id=idcard1_.id 
			    where
			        designer0_.id=? 
			        and designer0_.DTYPE='Designer'
			
							
		*/		
		Designer d = em.find(Designer.class, id);
		System.out.printf("ID: %d | FirstName: %s | LastName: %s | Prog_Lang: %s | Id_Num: %s | IssuedDate: %s\n", 
				d.getId(), 
				d.getFirstName(), 
				d.getLastName(), 
				d.getProgLang(), 
				d.getIdCard().getIdNumber(), 
				d.getIdCard().getIssueDate());
				/*
					Hibernate: 
							    select
							        projects0_.project_id as project_1_6_0_,
							        projects0_.designer_id as designer2_6_0_,
							        project1_.id as id1_9_1_,
							        project1_.end_date as end_date2_9_1_,
							        project1_.project_type as project_3_9_1_,
							        project1_.start_date as start_da4_9_1_,
							        project1_.title as title5_9_1_ 
							    from
							        person_project projects0_ 
							    inner join
							        project project1_ 
							            on projects0_.designer_id=project1_.id 
							    where
							        projects0_.project_id=?			 
				*/
				d.getProjects()
						.forEach(
								p -> System.out.printf("ID: %d | ProjectType: %s | Title: %s | StartDate: %s | EndDate: %s\n",
								p.getId(), p.getProjectType(), p.getTitle(), p.getStartDate(), p.getEndDate())
						);
		em.close();
		emf.close();
	}
	
	
	public static void queryDesigners() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();		
		// JPQL: 找出所有 Designer 物件及與其關聯的 Project 物件
		TypedQuery<Designer> query = em.createQuery("from Designer d LEFT JOIN FETCH d.projects", Designer.class); 
		/*
			Hibernate: 
			    select
			        designer0_.id as id2_5_0_,
			        project2_.id as id1_9_1_,
			        designer0_.first_name as first_na3_5_0_,
			        designer0_.id_card_id as id_card_6_5_0_,
			        designer0_.last_name as last_nam4_5_0_,
			        designer0_.prog_lang as prog_lan5_5_0_,
			        project2_.end_date as end_date2_9_1_,
			        project2_.projectType as projectT3_9_1_,
			        project2_.start_date as start_da4_9_1_,
			        project2_.title as title5_9_1_,
			        projects1_.project_id as project_1_6_0__,
			        projects1_.designer_id as designer2_6_0__ 
			    from
			        person_many designer0_ 
			    left outer join
			        person_project projects1_ 
			            on designer0_.id=projects1_.project_id 
			    left outer join
			        project project2_ 
			            on projects1_.designer_id=project2_.id 
			    where
			        designer0_.DTYPE='Designer'
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
		List<Designer> rows = query.getResultList();
		for(Designer d : rows) {
			StringBuilder sb = new StringBuilder();
			sb.append(d.toString());
			List<Project> projs = d.getProjects();									
			for(Project p : projs) {
				sb.append(", ").append(p.toString());				
			}
			System.out.println(sb);		
		}
		// JPQL: 找出所有 ProjectEmbedded 物件及與其關聯的 Period 物件
		TypedQuery<ProjectEmbedded> query2 = em.createQuery("from ProjectEmbedded pje LEFT JOIN FETCH pje.billingPeriods", ProjectEmbedded.class); 
		/*
			Hibernate: 
			    select
			        projectemb0_.id as id1_10_,
			        projectemb0_.END_DATE as END_DATE2_10_,
			        projectemb0_.START_DATE as START_DA3_10_,
			        billingper1_.PROJECT_ID as PROJECT_1_11_0__,
			        billingper1_.END_DATE as END_DATE2_11_0__,
			        billingper1_.START_DATE as START_DA3_11_0__ 
			    from
			        project_embedded projectemb0_ 
			    left outer join
			        T_BILLING_PERIOD billingper1_ 
			            on projectemb0_.id=billingper1_.PROJECT_ID		 
		*/
		List<ProjectEmbedded> rows2 = query2.getResultList();
		for(ProjectEmbedded pje : rows2) {
			StringBuilder sb = new StringBuilder();
			sb.append(pje.toString());
			List<Period> billingPeriods = pje.getBillingPeriods();									
			for(Period b : billingPeriods) {
				sb.append(", ").append(b.toString());				
			}
			System.out.println(sb);		
		}
		em.close();
		emf.close();
	}
	
	
	
	public static void loadProject() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();	
		// 取得 SpecificDateTimeSetter instance
		SpecificDateTimeSetter startDate = new SpecificDateTimeSetter();
		// 設定 project startDate
		startDate.setSpecificDateTime(2019, 1, 1, 9, 00, 0, 000);
		Date sd = startDate.getSpecificDateTime();	
		TypedQuery<Project> query = 
				em.createQuery("from Project p where p.startDate > :startDate", Project.class)
		          .setParameter("startDate", sd);
		/*
			Hibernate: 
			    select
			        project0_.id as id1_9_,
			        project0_.end_date as end_date2_9_,
			        project0_.projectType as projectT3_9_,
			        project0_.start_date as start_da4_9_,
			        project0_.title as title5_9_ 
			    from
			        project project0_ 
			    where
			        project0_.start_date>?		 
		*/		
		List<Project> rows = query.getResultList();
		for(Project p : rows) {
			/*
				Hibernate: 
				    select
				        designers0_.designer_id as designer2_6_0_,
				        designers0_.project_id as project_1_6_0_,
				        designer1_.id as id2_5_1_,
				        designer1_.first_name as first_na3_5_1_,
				        designer1_.id_card_id as id_card_6_5_1_,
				        designer1_.last_name as last_nam4_5_1_,
				        designer1_.prog_lang as prog_lan5_5_1_,
				        idcard2_.id as id1_1_2_,
				        idcard2_.id_number as id_numbe2_1_2_,
				        idcard2_.issue_date as issue_da3_1_2_,
				        idcard2_.valid as valid4_1_2_ 
				    from
				        person_project designers0_ 
				    inner join
				        person_many designer1_ 
				            on designers0_.project_id=designer1_.id 
				    left outer join
				        id_card idcard2_ 
				            on designer1_.id_card_id=idcard2_.id 
				    where
				        designers0_.designer_id=?
				
				Hibernate: 
				    select
				        designers0_.designer_id as designer2_6_0_,
				        designers0_.project_id as project_1_6_0_,
				        designer1_.id as id2_5_1_,
				        designer1_.first_name as first_na3_5_1_,
				        designer1_.id_card_id as id_card_6_5_1_,
				        designer1_.last_name as last_nam4_5_1_,
				        designer1_.prog_lang as prog_lan5_5_1_,
				        idcard2_.id as id1_1_2_,
				        idcard2_.id_number as id_numbe2_1_2_,
				        idcard2_.issue_date as issue_da3_1_2_,
				        idcard2_.valid as valid4_1_2_ 
				    from
				        person_project designers0_ 
				    inner join
				        person_many designer1_ 
				            on designers0_.project_id=designer1_.id 
				    left outer join
				        id_card idcard2_ 
				            on designer1_.id_card_id=idcard2_.id 
				    where
				        designers0_.designer_id=?
				
				Hibernate: 
				    select
				        designers0_.designer_id as designer2_6_0_,
				        designers0_.project_id as project_1_6_0_,
				        designer1_.id as id2_5_1_,
				        designer1_.first_name as first_na3_5_1_,
				        designer1_.id_card_id as id_card_6_5_1_,
				        designer1_.last_name as last_nam4_5_1_,
				        designer1_.prog_lang as prog_lan5_5_1_,
				        idcard2_.id as id1_1_2_,
				        idcard2_.id_number as id_numbe2_1_2_,
				        idcard2_.issue_date as issue_da3_1_2_,
				        idcard2_.valid as valid4_1_2_ 
				    from
				        person_project designers0_ 
				    inner join
				        person_many designer1_ 
				            on designers0_.project_id=designer1_.id 
				    left outer join
				        id_card idcard2_ 
				            on designer1_.id_card_id=idcard2_.id 
				    where
				        designers0_.designer_id=?
				
				Hibernate: 
				    select
				        designers0_.designer_id as designer2_6_0_,
				        designers0_.project_id as project_1_6_0_,
				        designer1_.id as id2_5_1_,
				        designer1_.first_name as first_na3_5_1_,
				        designer1_.id_card_id as id_card_6_5_1_,
				        designer1_.last_name as last_nam4_5_1_,
				        designer1_.prog_lang as prog_lan5_5_1_,
				        idcard2_.id as id1_1_2_,
				        idcard2_.id_number as id_numbe2_1_2_,
				        idcard2_.issue_date as issue_da3_1_2_,
				        idcard2_.valid as valid4_1_2_ 
				    from
				        person_project designers0_ 
				    inner join
				        person_many designer1_ 
				            on designers0_.project_id=designer1_.id 
				    left outer join
				        id_card idcard2_ 
				            on designer1_.id_card_id=idcard2_.id 
				    where
				        designers0_.designer_id=? 
			*/
			System.out.println(p);
		}
		for(Project p : rows) {
			System.out.println(p.getDesigners());
		}
		em.close();
		emf.close();		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}