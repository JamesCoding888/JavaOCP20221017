package entity.one2many.generationtype_table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "phones_t")
public class Phone_T {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE,
					generator = "MY_TABLE_GENERATOR")
	@TableGenerator(name = "MY_TABLE_GENERATOR", 
	 				table = "T_SEQUENCES", 
	 				pkColumnName = "SEQ_NAME", 
	 				valueColumnName = "SEQ_VALUE", 
	 				pkColumnValue = "PHONE")
					
			
			
	private Integer id;
	
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@ManyToOne(fetch = FetchType.EAGER) // default FetchType.EAGER
	@JoinColumn(name = "owner_id")
	private Owner_T owner;

	
	public Phone_T() {

	}

	
	public Phone_T(String number, String brandName, Owner_T owner) {
		super();
		this.number = number;
		this.brandName = brandName;
		this.owner = owner;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public Owner_T getOwner_T() {
		return owner;
	}


	public void setOwner_T(Owner_T owner) {
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "Phone [id=" + id + ", number=" + number + ", brandName=" + brandName + ", owner=" + owner + "]";
	}

	
	
	
	
}
