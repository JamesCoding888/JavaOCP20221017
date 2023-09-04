package entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
/*
	@Access: Used to specify an access type to be applied to an entity class,
	         mapped superclass, or embeddable class, or to a specific attribute of such a class.
	          
*/
//@Access(AccessType.FIELD)
@Access(AccessType.PROPERTY)
// 設定儲存型態的值
@DiscriminatorValue("200")
public class Developer extends Person {
	
//	@Column(name = "PROG_LANG") 
	private String programmingLanguage;

	@Column(name = "PROG_LANG")
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	
	
}