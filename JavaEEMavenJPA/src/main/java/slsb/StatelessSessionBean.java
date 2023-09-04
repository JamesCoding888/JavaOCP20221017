package slsb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.junit.Test;
import entity.Employee;

@Stateless
public class StatelessSessionBean implements Account {
   	
	private String name;
	
	private String email;
	
	@PersistenceContext // container-managed 生命週期和所處的物件實例一致，都由容器主動管理
	EntityManager em; 
	
	@Override
    public void accountLogin(String name, String email) {
        this.name = name;
        this.email = email;
    }

    
    @Test
    public void main() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
    	em = emf.createEntityManager();    	
    	EntityTransaction transaction = em.getTransaction();
    	try {
    		transaction.begin();
    		Employee employee = new Employee("Ted", "ted@gmail.com");    		
    		em.persist(employee);
    		employee = em.find(Employee.class, employee.getId());
    		accountLogin(employee.getName(), employee.getEmail());
    		System.out.printf("Login Account -> name: %s | email: %s\n", name, email);
    		em.flush();
    		transaction.commit();    		
    	} catch(Exception e) {
    		e.printStackTrace();
    		if(transaction.isActive()) {
    			transaction.rollback();
    		}    		
    	}
    	em.close();
    	emf.close();
    }
}
