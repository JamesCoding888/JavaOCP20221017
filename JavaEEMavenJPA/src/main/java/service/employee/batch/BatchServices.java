package service.employee.batch;
import java.util.Date; 
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entity.Employee;

/*
	執行 flush() method，JPA 將檢視 persistence context 是否有未同步至資料庫內的資料異動
	執行 clear() method，若不在同步異動資料至資料庫，則清除 cache。
	
	為了有效執行，並節省記憶體的使用，建議在一段時間或一定批量的交易後，就同時呼叫 flush() 和 clear() 方法，
	否則一直累積 Entity 物件實例將造成 OutOfMemoryError。
	
	但是，交易進行多少次，需調用一次 flush() and clear()，建議使用企業級的 DB 來調整最適合的呼叫頻率
	
	
*/
public class BatchServices {
	
	public static void batch(EntityManager em) {
		Employee employee = null;
		String batch_time = null;
		EntityTransaction transaction = em.getTransaction();		
		try {
			long start = new Date().getTime();
			transaction.begin();
			for(int n = 0; n< 500_000; n++) {
				batch_time= "batch_" + n;
				employee = new Employee(batch_time);
				em.persist(employee);
				// 清 cache per 10_000
				if(n % 10_000 == 0) {
					em.flush();
					em.clear();		
				}				
			}
			transaction.commit();
			long end = new Date().getTime();
			System.out.println("Elapsed time: " + (end - start));
		} catch(Exception e) {
			e.printStackTrace();
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
}
