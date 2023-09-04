package service.employee.crud;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import entity.Employee;

public class CRUDServices {
    // Create
	public static void create(String persistence_unit_name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence_unit_name);
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
	
	// Insert
	public static Employee insert(EntityManager em, String name, String email) {
		EntityTransaction transaction = em.getTransaction();
		Employee newEmployee = new Employee();
		newEmployee.setName(name);
		newEmployee.setEmail(email);

		try {
			transaction.begin();
			em.persist(newEmployee); // Persist the new employee
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (transaction.isActive()) {
				transaction.rollback();
			}
		}
		return newEmployee;
	}
	
	// Query
	// 1. 由 Hiberate Generated SQL
	public static void query(EntityManager em, int id) {
		System.out.println("====== Hiberate Generated SQL ======");
		Employee employee = em.find(Employee.class, id);		
		System.out.println("Entity object of employee:" + employee);
		System.out.printf("ID: %d | name: %s | email: %s \n", employee.getId(), employee.getName(), employee.getEmail());
	}

	// 2. 自行寫 SQL syntax
	public static void queryByNative(EntityManager em, int id) {
		System.out.println("====== 自行寫 SQL syntax ======");
		Query query = em.createNativeQuery("SELECT * FROM employee WHERE id = :id", Employee.class);
		query.setParameter("id", id); // Set the :id parameter value
		@SuppressWarnings("unchecked")
		List<Employee> employeeList = query.getResultList();
		em.close();
		for (Employee e : employeeList) {
			System.out.printf("ID: %d | name: %s | email: %s%n", e.getId(), e.getName(), e.getEmail());
		}
	}

	// 1. Update
	public static Employee update(EntityManager em, int id) {
		Employee employee = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			employee = em.find(Employee.class, id);
			employee.setName("update()");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	// 2. Update - merge()
	public static Employee merge(EntityManager em, int id) {
		Employee employee = null;
		EntityTransaction transaction = em.getTransaction();
		try {
			transaction.begin();
			employee = em.find(Employee.class, id);
			employee.setName("update()");
			em.merge(employee);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	// Delete
	public static void delete(EntityManager em, int id) {
	    EntityTransaction transaction = em.getTransaction();
	    try {
	        transaction.begin();
	        Employee employee = em.find(Employee.class, id);
	        if (employee != null) {
	            em.remove(employee); // Delete the employee
	        }
	        transaction.commit();
	    } catch (Exception e) {
	        e.printStackTrace();
	        if (transaction.isActive()) {
	            transaction.rollback();
	        }
	    }
	}	
}
