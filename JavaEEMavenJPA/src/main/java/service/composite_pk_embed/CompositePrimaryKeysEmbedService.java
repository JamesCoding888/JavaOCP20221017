package service.composite_pk_embed;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import entity.composite_pk_embed.Book;
import entity.composite_pk_embed.BookId;

public class CompositePrimaryKeysEmbedService {
	// Create
	/*
		Hibernate: 
		    
		    create table Composite_Embed_BOOK (
		       LANGUAGE varchar(255) not null,
		        TITLE varchar(255) not null,
		        description varchar(255),
		        primary key (LANGUAGE, TITLE)
		    ) engine=InnoDB	 
	*/
	
	
	// Insert
	/*
		Hibernate: 
		    insert 
		    into
		        Composite_Embed_BOOK
		        (description, LANGUAGE, TITLE) 
		    values
		        (?, ?, ?)
		Hibernate: 
		    insert 
		    into
		        Composite_Embed_BOOK
		        (description, LANGUAGE, TITLE) 
		    values
		        (?, ?, ?)	
	*/
	public static void persistByEmbeddableIdClass() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try{		
			transaction.begin();
			// 保存資料 1
			BookId bookId1 = new BookId("Oracle", "Java SE 8");
			Book book1 = new Book(bookId1, "Java Programming Language");
			em.persist(book1);
			// 保存資料 2
			BookId bookId2 = new BookId("Microsoft", ".Net Framework");
			Book book2 = new Book(bookId2, "Microsoft Programming Language");
			em.persist(book2);		
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
		        book0_.LANGUAGE as LANGUAGE1_1_0_,
		        book0_.TITLE as TITLE2_1_0_,
		        book0_.description as descript3_1_0_ 
		    from
		        Composite_Embed_BOOK book0_ 
		    where
		        book0_.LANGUAGE=? 
		        and book0_.TITLE=?	
	*/
	public static void queryByCompositeEmbeddableIdClass() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();		
		try{		
			transaction.begin();			
			// 查詢資料 - 使用 Composite Embeddable PK 
			BookId bookId1 = new BookId("Oracle", "Java SE 8");
			Book book = em.find(Book.class, bookId1);
			System.out.printf("|BookId: %s | Title: %s | Language: %s | Description: %s\n", 
					           book.getBookId(),
							   book.getBookId().getTitle(), 
					           book.getBookId().getLanguage(),
					           book.getDescription());
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
