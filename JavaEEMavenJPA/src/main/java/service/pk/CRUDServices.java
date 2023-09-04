package service.pk;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.pk.PKAuto;
import entity.pk.PKIdentity;
import entity.pk.PKSequence;
import entity.pk.PKTable;

public class CRUDServices {

	// Create
	/*
		Hibernate: 
		    
		    create table pk_identity (
		       id integer not null auto_increment,
		        first_name varchar(255),
		        last_name varchar(255),
		        primary key (id)
		    ) engine=InnoDB	 
	*/
	
	/*
		Hibernate: 
		    
		    create table pk_table (
		       id integer not null,
		        first_name varchar(255),
		        last_name varchar(255),
		        primary key (id)
		    ) engine=InnoDB
		Hibernate: 
		    
		    create table PK_TABLE_SEQUENCES (
		       SEQ_NAME varchar(255) not null,
		        next_val bigint,
		        primary key (SEQ_NAME)
		    ) engine=InnoDB	 
	*/
	
	/*
		Hibernate: 
		    
		    create table PK_S (
		       next_val bigint
		    ) engine=InnoDB
		Hibernate: 
		    
		    insert into PK_S values ( 1 )
		Hibernate: 
		    
		    create table pk_sequence (
		       id integer not null,
		        first_name varchar(255),
		        last_name varchar(255),
		        primary key (id)
		    ) engine=InnoDB	 
	*/
	
	/*
		Hibernate: 
		    
		    create table hibernate_sequence (
		       next_val bigint
		    ) engine=InnoDB
		Hibernate: 
		    
		    insert into hibernate_sequence values ( 1 )
	*/
	
	/*
		Hibernate: 
		    
		    create table pk_auto (
		       id integer not null,
		        first_name varchar(255),
		        last_name varchar(255),
		        primary key (id)
		    ) engine=InnoDB		    
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
		        pk_identity
		        (first_name, last_name) 
		    values
		        (?, ?)	
	*/
	public static void insertIdentity() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		PKIdentity pkT = new PKIdentity();
		pkT.setFirstName("James");
		pkT.setLastName("Liao");
		try{
			transaction.begin();			
			em.persist(pkT);
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
	
	/*
	 	新增第一筆資料的 SQL 語法
		Hibernate: 
		    select
		        tbl.next_val 
		    from
		        PK_TABLE_SEQUENCES tbl 
		    where
		        tbl.SEQ_NAME=? for update
		            
		Hibernate: 
		    insert 
		    into
		        PK_TABLE_SEQUENCES
		        (SEQ_NAME, next_val)  
		    values
		        (?,?)
		Hibernate: 
		    update
		        PK_TABLE_SEQUENCES 
		    set
		        next_val=?  
		    where
		        next_val=? 
		        and SEQ_NAME=?
		Hibernate: 
		    select
		        tbl.next_val 
		    from
		        PK_TABLE_SEQUENCES tbl 
		    where
		        tbl.SEQ_NAME=? for update
		            
		Hibernate: 
		    update
		        PK_TABLE_SEQUENCES 
		    set
		        next_val=?  
		    where
		        next_val=? 
		        and SEQ_NAME=?
		Hibernate: 
		    insert 
		    into
		        pk_table
		        (first_name, last_name, id) 
		    values
		        (?, ?, ?)		 

		======================================================
		
		新增第二筆資料的 SQL 語法
		Hibernate: 
		    select
		        tbl.next_val 
		    from
		        PK_TABLE_SEQUENCES tbl 
		    where
		        tbl.SEQ_NAME=? for update
		            
		Hibernate: 
		    update
		        PK_TABLE_SEQUENCES 
		    set
		        next_val=?  
		    where
		        next_val=? 
		        and SEQ_NAME=?
		Hibernate: 
		    insert 
		    into
		        pk_table
		        (first_name, last_name, id) 
		    values
		        (?, ?, ?)		
	*/
	public static void insertTable() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		PKTable pkT = new PKTable();
		pkT.setFirstName("James");
		pkT.setLastName("Liao");
		try{
			transaction.begin();			
			em.persist(pkT);
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
	
	/*
		Hibernate: 
		    select
		        next_val as id_val 
		    from
		        PK_S for update
		            
		Hibernate: 
		    update
		        PK_S 
		    set
		        next_val= ? 
		    where
		        next_val=?
		Hibernate: 
		    select
		        next_val as id_val 
		    from
		        PK_S for update
		            
		Hibernate: 
		    update
		        PK_S 
		    set
		        next_val= ? 
		    where
		        next_val=?
		Hibernate: 
		    insert 
		    into
		        pk_sequence
		        (first_name, last_name, id) 
		    values
		        (?, ?, ?)	
	*/
	public static void insertSequence() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		PKSequence pkT = new PKSequence();
		pkT.setFirstName("James");
		pkT.setLastName("Liao");
		try{
			transaction.begin();			
			em.persist(pkT);
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
	
	/*
		Hibernate: 
		    select
		        next_val as id_val 
		    from
		        hibernate_sequence for update
		            
		Hibernate: 
		    update
		        hibernate_sequence 
		    set
		        next_val= ? 
		    where
		        next_val=?
		Hibernate: 
		    insert 
		    into
		        pk_auto
		        (first_name, last_name, id) 
		    values
		        (?, ?, ?)	 
	*/
	public static void insertAuto() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		PKAuto pkT = new PKAuto();
		pkT.setFirstName("James");
		pkT.setLastName("Liao");
		try{
			transaction.begin();			
			em.persist(pkT);
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