package entity.embed;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.JoinColumn;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "project_embedded")
public class ProjectEmbedded {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/*
	 	Embedded:	 		
	 		Specifies a persistent field or property of an entity whose value is an instance of an embeddable class. 
	 		The embeddable class must be annotated as Embeddable.
	*/
	@Embedded
	private Period projectPeriod;
	
	
 	// @Embeddedable 的類別，e.g., Period class，於 JPA 2.0 版本後，支援 1-To-Many 的關係，只要使用 
	// @ElementCollection 及 @CollectionTable 標註在型態為，e.g., List<Period> 的集合欄位 或 回傳該型態的方法
//	/*
	@ElementCollection
	@CollectionTable(
			name = "T_BILLING_PERIOD",
			joinColumns = @JoinColumn(name = "PROJECT_ID")
	)
	private List<Period> billingPeriods = new ArrayList<Period>();


	public List<Period> getBillingPeriods() {
		return billingPeriods;
	}

	
	public void setBillingPeriods(List<Period> billingPeriods) {
		this.billingPeriods = billingPeriods;
	}
//	*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Period getProjectPeriod() {
		return projectPeriod;
	}

	public void setProjectPeriod(Period projectPeriod) {
		this.projectPeriod = projectPeriod;
	}

	
	@Override
	public String toString() {
		return "ProjectEmbedded [id=" + id + ", projectPeriod=" + projectPeriod + ", billingPeriods=" + billingPeriods
				+ "]";
	}
	
	
}
