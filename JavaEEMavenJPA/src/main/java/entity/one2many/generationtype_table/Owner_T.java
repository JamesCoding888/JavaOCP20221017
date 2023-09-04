package entity.one2many.generationtype_table;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "owner_t")
public class Owner_T {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	/*
		@ManyToOne
		private Owner_T owner; // Person 實體類別使用 @OneToMany 標註欄位代表 1-To-many 關係，屬性 (attribute) mappedBy 的
		欄位/方法，必須對應到 Phone_T 實體類別標註 @ManyToOne 的欄位/方法
		
		E.g., Phone_T class 中的 'private Owner_T owner;' 被標註 @ManyToOne，則 mappedBy 需寫 'owner'
	*/
	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY) // 由 phone Table 儲存關聯
	private List<Phone_T> phones = new ArrayList<Phone_T>();
	
	public Owner_T() {

	}

	public Owner_T(String name, List<Phone_T> phones) {
		super();
		this.name = name;
		this.phones = phones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
		因 'private List<Phone_T> phones = new ArrayList<Phone_T>(); 
		已被標註 '@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)'
		方法可不用再標註
	*/
//	@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY) // 由 phone Table 儲存關聯
	public List<Phone_T> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone_T> phones) {
		this.phones = phones;
	}

}
