package entity.one2many.generationtype_identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phones")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "brand_name")
	private String brandName;
	
	@ManyToOne(fetch = FetchType.EAGER) // default FetchType.EAGER
	@JoinColumn(name = "owner_id")
	private Owner owner;

	
	public Phone() {

	}

	
	public Phone(String number, String brandName, Owner owner) {
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


	public Owner getOwner() {
		return owner;
	}


	public void setOwner(Owner owner) {
		this.owner = owner;
	}


	@Override
	public String toString() {
		return "Phone [id=" + id + ", number=" + number + ", brandName=" + brandName + ", owner=" + owner + "]";
	}

	
	
	
	
}
