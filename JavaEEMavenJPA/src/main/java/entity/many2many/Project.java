package entity.many2many;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "project")
public class Project {
	
	@Id	
	// 序號產生策略 (strategy = GenerationType.IDENTITY)
//	/*
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	*/
	
	// 序號產生策略 (strategy = GenerationType.SEQUENCE) 
	/*
	@GeneratedValue(strategy = GenerationType.SEQUENCE, 
	                generator = "MY_SEQ_GENERATOR") // 序號產生機制，由資料庫提供，JPA 將參照此 generator 的機制去取得序號
	@SequenceGenerator(name = "MY_SEQ_GENERATOR", // 屬性 name 與 generator 的序號產生器的值相同，則使用該序號產生器
	  				   sequenceName = "S_PROJECT", // 指定資料庫物件名稱
	  				   allocationSize = 10) // 資料庫序號產生器可能面臨多個用戶，同時做存取，因而導致鎖定與等待;減少此發生，通常預先取用一定數量放在記憶體中，JPA 使用 allocationSize 定義預先配置的數量
	*/
	private Integer id;
	
	@Column(name = "end_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate; 
	
	@Column(name = "start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	/*
	@Column(name = "project_type")
	private String projectType;
	*/
	
	// 使用 Enum 型態的欄位
//	/*
	@Enumerated(EnumType.STRING)
	private ProjectType projectType;
//	*/
	
	@Column(name = "title")
	private String title;

	// Many2Many 的情況下，Designer 和 Project's class 是對等的關係，因此於 Project class 使用的 @JoinTable 可移到 Designer class，且產生的 Create SQL 語法相同
	/*
	@ManyToMany
	@JoinTable(
		name = "person_project",
		joinColumns = {
				@JoinColumn(name = "project_id", referencedColumnName = "id")},
		inverseJoinColumns = {
				@JoinColumn(name = "position_id", referencedColumnName = "id")
		})
	 */
//	/*
	@ManyToMany(mappedBy = "projects")
//	*/
	private List<Designer> designers = new ArrayList<Designer>();

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/*
	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	*/

	// 使用 Enum 型態的欄位
	/*
		當 Project class 的 private ProjectType projectType; Annotation 如下 
		 
		 1) @Enumerated(EnumType.STRING)
		 	寫入該列舉項目的 name() 方法回傳字串值 (type: String)
		 	E.g., 
		 		SHORT -> "SHORT"
		 		LONG  -> "LONG"
		 	
		 2) @Enumerated(EnumType.ORDINL)
		 	寫入該列舉項目的 ordinal() 方法回傳數值 (type: int) 
		 	E.g., 
		 		SHORT -> 0
		 		LONG  -> 1
		 	
	*/
//	/*
	public enum ProjectType {
		SHORT, 
		LONG;  		
	}


	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}
//	*/
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Designer> getDesigners() {
		return designers;
	}

	public void setDesigners(List<Designer> designers) {
		this.designers = designers;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", endDate=" + endDate + ", startDate=" + startDate + ", projectType="
				+ projectType + ", title=" + title + ", designers=" + designers + "]";
	}

	
	
	
	
}
