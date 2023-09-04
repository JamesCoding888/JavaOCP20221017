package service.employee.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entity.Employee;

public class FlushedClearService {

	public static void clearBeforeFlush(EntityManager em, int id) {
		Employee employee = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			employee = em.find(Employee.class, id);
			// 先 clear() 在 flush()
			em.clear();
			System.out.println("If entity existed: " + em.contains(employee));	// If entity existed: false		
			em.flush();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
	
	public static void flushBeforeClear(EntityManager em, int id) {
		Employee employee = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			employee = em.find(Employee.class, id);
			// 先 flush() 在 clear()
			em.flush();
			System.out.println("If entity existed: " + em.contains(employee));	// If entity existed: true		
			em.clear();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
}
