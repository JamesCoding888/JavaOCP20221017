package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "person")
/*
	@Inheritance: 
	Defines the inheritance strategy to be used for an entity class hierarchy. 
	It is specified on the entity class that is the root of the entity class hierarchy. 
*/
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // A single table per class hierarchy

/*
 	@Inheritance(strategy = InheritanceType.JOINED):
	A strategy in which fields that are specific to a subclass are mapped to 
	a separate table than the fields that are common to the parent class, 
	and a join is performed to instantiate the subclass. 
*/
//@Inheritance(strategy = InheritanceType.JOINED)
/*
 	@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS):
	A table per concrete entity class. 
	
	Note:
	stackoverflow 有提到 'Cannot use identity column key generation with <union-subclass> ( TABLE_PER_CLASS )' 的問題	
	https://stackoverflow.com/questions/21047167/error-cannot-use-identity-column-key-generation-with-union-subclass-table
	
*/
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

// 修改預設的 'DTYPE' 欄位的名稱 及 儲存型態
//@DiscriminatorColumn(name = "PERSON_TYPE", discriminatorType = DiscriminatorType.INTEGER)
// 設定儲存型態的值
//@DiscriminatorValue("100")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	
	public Person() {

	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



}