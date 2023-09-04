package service.one2many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.one2many.generationtype_table.Owner_T;
import entity.one2many.generationtype_table.Phone_T;

public class CRUDServices_T {

	// Create
	/*
		Hibernate: 
		    
		    create table owner_t (
		       id integer not null auto_increment,
		        name varchar(255),
		        primary key (id)
		    ) engine=InnoDB
		Hibernate: 
		    
		    create table phones_t (
		       id integer not null,
		        brand_name varchar(255),
		        number varchar(255),
		        owner_id integer,
		        primary key (id)
		    ) engine=InnoDB
		Hibernate: 
		    
		    create table T_SEQUENCES (
		       SEQ_NAME varchar(255) not null,
		        SEQ_VALUE bigint,
		        primary key (SEQ_NAME)
		    ) engine=InnoDB
		Hibernate: 
		    
		    alter table phones_t 
		       add constraint FK11chyxj97du8dbg7jnin1ljqt 
		       foreign key (owner_id) 
		       references owner_t (id)		 
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
		// 新增 1 筆 owner 資料至 owner_t Table
		Owner_T owner = new Owner_T();
		owner.setName("james");
		// 新增 2 筆 phone 資料至 phone_t Table
		Phone_T phone1 = new Phone_T();
		Phone_T phone2 = new Phone_T();
		phone1.setNumber("0920890890");
		phone1.setBrandName("iPhone14");
		phone1.setOwner_T(owner);
		phone2.setNumber("0936987987");
		phone2.setBrandName("Samsung Galaxy");
		phone2.setOwner_T(owner);
		try {
			transaction.begin();
			// 執行保存 (Owner_T 先保存，在執行 Phone_T 保存)
			/*
				Hibernate: 
				    insert 
				    into
				        owner_t
				        (name) 
				    values
				        (?)
				Hibernate: 
				    select
				        tbl.SEQ_VALUE 
				    from
				        T_SEQUENCES tbl 
				    where
				        tbl.SEQ_NAME=? for update
				            
				Hibernate: 
				    insert 
				    into
				        T_SEQUENCES
				        (SEQ_NAME, SEQ_VALUE)  
				    values
				        (?,?)
				Hibernate: 
				    update
				        T_SEQUENCES 
				    set
				        SEQ_VALUE=?  
				    where
				        SEQ_VALUE=? 
				        and SEQ_NAME=?
				Hibernate: 
				    select
				        tbl.SEQ_VALUE 
				    from
				        T_SEQUENCES tbl 
				    where
				        tbl.SEQ_NAME=? for update
				            
				Hibernate: 
				    update
				        T_SEQUENCES 
				    set
				        SEQ_VALUE=?  
				    where
				        SEQ_VALUE=? 
				        and SEQ_NAME=?
				Hibernate: 
				    insert 
				    into
				        phones_t
				        (brand_name, number, owner_id, id) 
				    values
				        (?, ?, ?, ?)
				Hibernate: 
				    insert 
				    into
				        phones_t
				        (brand_name, number, owner_id, id) 
				    values
				        (?, ?, ?, ?)						 
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
	
	
	
	
	
}
