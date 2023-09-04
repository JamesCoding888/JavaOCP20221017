package service.employee.cache;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.TypedQuery;
import entity.Employee;

public class FlushMode {
		
	public static void testFlushModeCOMMIT(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		em.setFlushMode(FlushModeType.COMMIT); // commit only
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Employee employee = new Employee("tiger11", "tiger11@gmail.com");
			em.persist(employee);
//			em.flush(); // is necessary only for FlushModeType.COMMIT
			showEmployee(em, employee.getId());
			transaction.commit();						
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}	
	}	
	
	// 不需要 flush() 就可查詢
	public static void testFlushModeAUTO(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		em.setFlushMode(FlushModeType.AUTO); // commit & query
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			Employee employee = new Employee("tiger12", "tiger12@gmail.com");
			em.persist(employee);
//			em.flush(); // is necessary only for FlushModeType.COMMIT
			showEmployee(em, employee.getId());
			transaction.commit();						
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}	
	}	
	
	public static void showEmployee(EntityManager em, int id) {
		TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e WHERE e.id = :id", Employee.class)
									   .setParameter("id", id); // "id" -> :id
		List<Employee> list = query.getResultList();
		if(list.size() == 0) {
			System.out.println("Employee NOT Found !");			
		} else {
			System.out.println("Employee Found:");
			list.forEach(System.out::println);
		}
	}
}
