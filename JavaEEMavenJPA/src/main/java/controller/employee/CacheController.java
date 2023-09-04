package controller.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import service.employee.cache.DetachedFlush;
import service.employee.cache.Find;
import service.employee.cache.FlushMode;
import service.employee.cache.FlushedClearService;

public class CacheController {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
		EntityManager em = emf.createEntityManager();
		
		// 3. Cache
		// clearBeforeFlush
		FlushedClearService.clearBeforeFlush(em, 1);

		// flushBeforeClear
		FlushedClearService.flushBeforeClear(em, 1);

		// find()
		Find.testFind(emf);

		// detached & merge
		DetachedFlush.detachedAndMerge(emf, 1, "sssss");

		DetachedFlush.detachedAndMerge2(emf, 1, "fff");

		FlushMode.testFlushModeAUTO(emf);

		FlushMode.testFlushModeCOMMIT(emf);
	}
}
