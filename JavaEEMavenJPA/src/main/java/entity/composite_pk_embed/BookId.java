package entity.composite_pk_embed;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/*
Composite Primary key:

	1) 類別必須 public 且 實作 Serilization
	2) 必須有不帶參數建構子
	3) 須移除 setter() 以確保物件生成後，無法更改 (immutable)，已滿足 PK 欄位的特性
	4) Priamry Key 欄位值於 DB 不可重複，需 Override equals() and hashCode()

*/
@Embeddable
public class BookId implements Serializable {

	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "LANGUAGE")
	private String language;
	
	public BookId() {
		
	}
	
	public BookId(String title, String language) {
		this.language = language;
		this.title = title;		
	}

	public String getTitle() {
		return title;
	}

	public String getLanguage() {
		return language;
	}

	// No setters to guarantee immutable
	/*
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setLanguage(String language) {
			this.language = language;
		}
	*/
	
	
	// Primary key is unable to duplicate, therefore, we shall override equals() and hashCode() methods
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookId other = (BookId) obj;
		return Objects.equals(language, other.language) && Objects.equals(title, other.title);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(language, title);
	}
	
	
}
