package service.employee.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import entity.Employee;

public class DetachedFlush {
	public static void detachedAndMerge(EntityManagerFactory emf, int empId, String name) {
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, empId);
		em.close();		
		employee.setName(name); // status -> detached due to EntityManager Closed (Entity 物件實力與 EntityManager 失去聯繫)
		
		EntityManager em2 = emf.createEntityManager();
		em2.merge(employee); // status -> managed, and necessary! (保存物件狀態至 persistence context 內)
		
		EntityTransaction transaction = em2.getTransaction();
		try {
			transaction.begin();
			transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}		
	}
	
	public static void detachedAndMerge2(EntityManagerFactory emf, int empId, String name) {
		EntityManager em = emf.createEntityManager();
		Employee employee = em.find(Employee.class, empId);
		employee.setName(name);
		// em.merge(employee); // Entity 物件實例與 EntityManager 仍保持聯繫，不需呼叫 'merge()'
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			transaction.commit();
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}		
	}
}
