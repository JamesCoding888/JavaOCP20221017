package entity.many2many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Designer extends PersonMany {

	// Many2Many 的情況下，Designer 和 Project's class 是對等的關係，因此於 Designer class 使用的 @JoinTable 可移到 Project class，且產生的 Create SQL 語法相同
	/*
	@ManyToMany(mappedBy = "designers")
	*/
//	/*
	@ManyToMany
	@JoinTable(
		name = "person_project",
		joinColumns = {
				@JoinColumn(name = "project_id", referencedColumnName = "id")},
		inverseJoinColumns = {
				@JoinColumn(name = "designer_id", referencedColumnName = "id")
		})
//	*/
	private List<Project> projects = new ArrayList<Project>();

	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	

	
	
	
	
	
}
