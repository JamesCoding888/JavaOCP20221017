package com.ocp.day20.executor.describe;


/* 	
	
 	Description of the structure for the Executor and its main subclasses:
 	

 	interface:
 		
 		1) Executor
 			
 		   		i. The Executor interface is at the top of the executor hierarchy.
 		   		
 		   		ii. The Executor interface defines a single method, execute(Runnable), for executing tasks in a separate thread or thread pool.
 		
 		2) ExecutorService extends Executor
 		
 				i. The ExecutorService interface extends Executor and adds methods for managing the lifecycle of the executor, such as starting and stopping it.
 				
 		3) ScheduledExecutorService extends ExecutorService
 		
 				i. The ScheduledExecutorService interface extends ExecutorService and adds methods for scheduling tasks to be executed at a specific time or with a specific delay.
 				
 	abstract:
 		
 		1) AbstractExecutorService implements ExecutorService
 		
 				i. The AbstractExecutorService class provides a skeletal implementation of the ExecutorService interface, making it easier to implement custom executor services.
 				
 	class:
 	
 		1) ThreadPoolExecutor implements ExecutorService
 			
 				i. The ThreadPoolExecutor class is a concrete implementation of the ExecutorService interface that manages a pool of worker threads. 
 				
 				ii. It provides methods for setting the core and maximum pool size, as well as other properties of the thread pool.
 				
 				
 		2) ScheduledThreadPoolExecutor implements ScheduledExecutorService
 		
 				i. The ScheduledThreadPoolExecutor class is a concrete implementation of ScheduledExecutorService that manages a thread pool and can schedule tasks to be executed at a specific time or with a specific delay.
 				
 		
 		3) ForkJoinPool implements ExecutorService
 				
 				i. The ForkJoinPool class is a specialized implementation of ExecutorService that is designed for parallel processing of tasks that can be divided into smaller subtasks.
 				
 		4) SingleThreadExecutor implements ExecutorService
 				
 				i. The SingleThreadExecutor class is an implementation of ExecutorService that executes tasks using a single thread.
 				
 		5) WorkStealingPool implements ExecutorService
 				
 				i. The WorkStealingPool class is an implementation of ExecutorService that manages a pool of worker threads that can steal tasks from each other to improve load balancing.
 				
 		6) ManagedBlocker implements ExecutorService
 		
 				i. The ManagedBlocker class is an implementation of ExecutorService that provides support for thread blocking and unblocking.
 		
*/

