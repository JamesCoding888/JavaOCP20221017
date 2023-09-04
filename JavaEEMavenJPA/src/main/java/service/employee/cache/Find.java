package service.employee.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import entity.Employee;

public class Find {

	public static void testFind(EntityManagerFactory emf) {
		int empId = setup(emf);
		EntityManager em = null;
		try {
			em = emf.createEntityManager();	
			System.out.println("Find from database (SQL is submitted):");				
			System.out.println(em.find(Employee.class, empId));			
			System.out.println("Find from persistence context (SQL is NOT submitted):");							
			System.out.println(em.find(Employee.class, empId));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	
	public static int setup(EntityManagerFactory emf) {
		EntityManager em = emf.createEntityManager();
		Employee employee = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			employee = new Employee();
			employee.setName("qqiq");
			employee.setEmail("qqiq@gmail.com");
			em.persist(employee);
			transaction.commit();
			return employee.getId();
		} catch(Exception e){
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
		finally{
			if(em != null) {
				em.close();
			}
		}
		return 0;
	}
}
