package entity.embed;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/*	
	 @Embeddable:
	 
		 Defines a class whose instances are stored as an intrinsic part of an owning entity 
		 and share the identity of the entity. 
		 
		 Each of the persistent properties or fields of the embedded object is mapped to the database table for the entity.
*/
@Embeddable 
// 大型開發專案，有許多 Entity 類別需定義開始、結束時間，可使用 Period class 並加上 @Embeddable 作為分離版的 Entity 類別
public class Period {
	
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Column(name = "END_DATE")
	private Date endDate;
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Period [startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	
	
	
	
}
