package entity.pk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "pk_sequence")
public class PKSequence {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
					generator = "PK_SEQ_GENERATOR")
	@SequenceGenerator(name = "PK_SEQ_GENERATOR", 
					sequenceName = "PK_S",
					allocationSize = 100)
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

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