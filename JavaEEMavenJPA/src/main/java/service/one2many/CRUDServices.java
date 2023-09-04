package service.one2many;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.one2many.generationtype_identity.Owner;
import entity.one2many.generationtype_identity.Phone;

public class CRUDServices {

	// Create
	/*
		Hibernate: 
		    
		    create table owner (
		       id integer not null auto_increment,
		        name varchar(255),
		        primary key (id)
		    ) engine=InnoDB

		Hibernate: 
		    
		    create table phones (
		       id integer not null auto_increment,
		        brand_name varchar(255),
		        number varchar(255),
		        owner_id integer,
		        primary key (id)
		    ) engine=InnoDB
		
		Hibernate: 
		    
		    alter table phones 
		       add constraint FKfo09c30243b5yhjm04wcda8t4 
		       foreign key (owner_id) 
		       references owner (id)	 
	*/
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}

	// insert
	public static void insertOwnerOne2Many() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		// 新增 1 筆 owner 資料至 owner Table
		Owner owner = new Owner();
		owner.setName("james");
		// 新增 2 筆 phone 資料至 phone Table
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		phone1.setNumber("0920890890");
		phone1.setBrandName("iPhone14");
		phone1.setOwner(owner);
		phone2.setNumber("0936987987");
		phone2.setBrandName("Samsung Galaxy");
		phone2.setOwner(owner);
		try {
			transaction.begin();
			// 執行保存 (Owner 先保存，在執行 Phone 保存)
			/*
				Hibernate: 
				    insert 
				    into
				        owner
				        (name) 
				    values
				        (?)
				Hibernate: 
				    insert 
				    into
				        phones
				        (brand_name, number, owner_id) 
				    values
				        (?, ?, ?)
				Hibernate: 
				    insert 
				    into
				        phones
				        (brand_name, number, owner_id) 
				    values
				        (?, ?, ?)			
			*/
			em.persist(owner);
			em.persist(phone1);
			em.persist(phone2);
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
	
	// query
	// load owner
	public static void loadOwnerOne2ManyByLazy() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Owner> query = em.createQuery("from Owner", Owner.class);
		/*
			Hibernate: 
			    select
			        owner0_.id as id1_2_,
			        owner0_.name as name2_2_ 
			    from
			        owner owner0_		 
		*/
		List<Owner> resultList = query.getResultList();
		for(Owner o : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(o.toString());
			List<Phone> phones = o.getPhones();
			
			// @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
			// 需要時，才會至資料庫載入 phone 資料
			/*
				Hibernate: 
				    select
				        phones0_.owner_id as owner_id4_4_0_,
				        phones0_.id as id1_4_0_,
				        phones0_.id as id1_4_1_,
				        phones0_.brand_name as brand_na2_4_1_,
				        phones0_.number as number3_4_1_,
				        phones0_.owner_id as owner_id4_4_1_ 
				    from
				        phones phones0_ 
				    where
				        phones0_.owner_id=?			
			*/
			for(Phone p : phones) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}
	
	public static void loadOwnerOne2ManyByEager() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Owner> query = em.createQuery("from Owner", Owner.class);
		// @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
		/*
			Hibernate: 
			    select
			        owner0_.id as id1_2_,
			        owner0_.name as name2_2_ 
			    from
			        owner owner0_
			Hibernate: 
			    select
			        phones0_.owner_id as owner_id4_4_0_,
			        phones0_.id as id1_4_0_,
			        phones0_.id as id1_4_1_,
			        phones0_.brand_name as brand_na2_4_1_,
			        phones0_.number as number3_4_1_,
			        phones0_.owner_id as owner_id4_4_1_ 
			    from
			        phones phones0_ 
			    where
			        phones0_.owner_id=?	 
		*/
		List<Owner> resultList = query.getResultList();
		for(Owner o : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(o.toString());
			List<Phone> phones = o.getPhones();		
			// @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
			// 載入 Owner 資料時 (i.e., 'List<Owner> resultList = query.getResultList();')，一併自動載入 Phone 資料，因此執行底下程式碼，不會再執行一次 Phone 查詢 SQL 語法
			for(Phone p : phones) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}
	
	// 減少 SQL 執行次數，使用 JPQL 'LEFT JOIN FETCH' 
	public static void loadOwnerOne2ManyByLeftJoin(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();		
		
		TypedQuery<Owner> query = em.createQuery("from Owner o LEFT JOIN FETCH o.phones", Owner.class);		
		// @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER) or @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
		// 使用 LEFT JOIN，不論 FetchType.EAGER or FetchType.LAZY，皆產生相同的 SQL 語法
		/*
		    EAGER
			Hibernate: 
			    select
			        owner0_.id as id1_2_0_,
			        phones1_.id as id1_4_1_,
			        owner0_.name as name2_2_0_,
			        phones1_.brand_name as brand_na2_4_1_,
			        phones1_.number as number3_4_1_,
			        phones1_.owner_id as owner_id4_4_1_,
			        phones1_.owner_id as owner_id4_4_0__,
			        phones1_.id as id1_4_0__ 
			    from
			        owner owner0_ 
			    left outer join
			        phones phones1_ 
			            on owner0_.id=phones1_.owner_id					            					          
		*/
		List<Owner> resultList = query.getResultList();
		for(Owner o : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(o.toString());
			List<Phone> phones = o.getPhones();		
			for(Phone p : phones) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}	
	}
	
	// load phone
	public static void loadPhoneOne2ManyByEager() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Phone> query = em.createQuery("from Phone", Phone.class);
		// @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
		// @ManyToOne(fetch = FetchType.EAGER)
		/*
			Hibernate: 
			    select
			        phone0_.id as id1_5_,
			        phone0_.brand_name as brand_na2_5_,
			        phone0_.number as number3_5_,
			        phone0_.owner_id as owner_id4_5_ 
			    from
			        phones phone0_
			        
			Hibernate: 
			    select
			        owner0_.id as id1_2_0_,
			        owner0_.name as name2_2_0_,
			        phones1_.owner_id as owner_id4_5_1_,
			        phones1_.id as id1_5_1_,
			        phones1_.id as id1_5_2_,
			        phones1_.brand_name as brand_na2_5_2_,
			        phones1_.number as number3_5_2_,
			        phones1_.owner_id as owner_id4_5_2_ 
			    from
			        owner owner0_ 
			    left outer join
			        phones phones1_ 
			            on owner0_.id=phones1_.owner_id 
			    where
			        owner0_.id=?	 
		*/
		List<Phone> resultList = query.getResultList();
		for(Phone p : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(p.toString());
			Owner owner = p.getOwner();			
			if(owner != null) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}	
	
	
	public static void loadPhoneOne2ManyByLazy() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Phone> query = em.createQuery("from Phone", Phone.class);
		// @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
		// @ManyToOne(fetch = FetchType.EAGER)
		/*
			Hibernate: 
			    select
			        phone0_.id as id1_5_,
			        phone0_.brand_name as brand_na2_5_,
			        phone0_.number as number3_5_,
			        phone0_.owner_id as owner_id4_5_ 
			    from
			        phones phone0_
			Hibernate: 
			    select
			        owner0_.id as id1_2_0_,
			        owner0_.name as name2_2_0_ 
			    from
			        owner owner0_ 
			    where
			        owner0_.id=?						 
		*/
		List<Phone> resultList = query.getResultList();
		for(Phone p : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(p.toString());
			Owner owner = p.getOwner();
			if(owner != null) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}			
	
	public static void loadPhoneMany2OneByLazy() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Phone> query = em.createQuery("from Phone", Phone.class);
		// @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
		// @ManyToOne(fetch = FetchType.LAZY)
		/*
			Hibernate: 
			    select
			        phone0_.id as id1_5_,
			        phone0_.brand_name as brand_na2_5_,
			        phone0_.number as number3_5_,
			        phone0_.owner_id as owner_id4_5_ 
			    from
			        phones phone0_			 
		*/
		List<Phone> resultList = query.getResultList();
		for(Phone p : resultList) {
			StringBuilder sb = new StringBuilder();
			/*
				Hibernate: 
				    select
				        owner0_.id as id1_2_0_,
				        owner0_.name as name2_2_0_ 
				    from
				        owner owner0_ 
				    where
				        owner0_.id=?							
			*/
			sb.append(p.toString());
			Owner owner = p.getOwner();			
			if(owner != null) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}		
	
	public static void loadPhoneMany2OneByEager() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Phone> query = em.createQuery("from Phone", Phone.class);
		// @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
		// @ManyToOne(fetch = FetchType.EAGER)
		/*
			Hibernate: 
			    select
			        phone0_.id as id1_5_,
			        phone0_.brand_name as brand_na2_5_,
			        phone0_.number as number3_5_,
			        phone0_.owner_id as owner_id4_5_ 
			    from
			        phones phone0_
			Hibernate: 
			    select
			        owner0_.id as id1_2_0_,
			        owner0_.name as name2_2_0_ 
			    from
			        owner owner0_ 
			    where
			        owner0_.id=?		 
		*/
		List<Phone> resultList = query.getResultList();
		for(Phone p : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(p.toString());
			Owner owner = p.getOwner();			
			if(owner != null) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}		
	}	
	
	public static void loadPhoneMany2OneByInnerJoin() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Phone> query = em.createQuery("from Phone p INNER JOIN FETCH p.owner", Phone.class);
		// @ManyToOne(fetch = FetchType.EAGER) or @ManyToOne(fetch = FetchType.LAZY)
		// 使用 INNER JOIN FETCH，不論 FetchType.EAGER or FetchType.LAZY，皆產生相同的 SQL 語法
		// @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
		/*
			Hibernate: 
			    select
			        phone0_.id as id1_5_0_,
			        owner1_.id as id1_2_1_,
			        phone0_.brand_name as brand_na2_5_0_,
			        phone0_.number as number3_5_0_,
			        phone0_.owner_id as owner_id4_5_0_,
			        owner1_.name as name2_2_1_ 
			    from
			        phones phone0_ 
			    inner join
			        owner owner1_ 
			            on phone0_.owner_id=owner1_.id										 
		*/
		List<Phone> resultList = query.getResultList();
		for(Phone p : resultList) {
			StringBuilder sb = new StringBuilder();
			sb.append(p.toString());
			Owner owner = p.getOwner();
			if(owner != null) {
				sb.append(", ").append(p.toString());
			}
			System.out.println(sb);
		}	
	}
	
	
	
}
