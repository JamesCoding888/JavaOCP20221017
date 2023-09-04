package entity.composite_pk_embed;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Composite_Embed_BOOK")
public class Book {
	
	@EmbeddedId
	private BookId bookId;
	
	@Column(name = "description")
	private String description;
	
	public Book() {
		
	}	
	
	public Book(BookId bookId, String description) {		
		this.bookId = bookId;
		this.description = description;		
	}

	public BookId getBookId() {
		return bookId;
	}

	public void setBookId(BookId bookId) {
		this.bookId = bookId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
}
