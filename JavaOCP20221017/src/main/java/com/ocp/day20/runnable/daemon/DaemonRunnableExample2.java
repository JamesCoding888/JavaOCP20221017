package com.ocp.day20.runnable.daemon;

/*
 	Continue of DaemonThreadExample2.java, we updated the inheritance of Log.java from "extends to Thread" to "implements Runnable"
 	Because only one super class could be extended to, what if we need to extend to many super classes, respectively? We will implement Runnable interface! 
*/
public class DaemonRunnableExample2 {

	public static void main(String[] args) {
		LogImpl2 log1 = new LogImpl2("CPU1");
		LogImpl2 log2 = new LogImpl2("CPU2");

		/*  Notice here, of the Runnable interface, doesn't have method of .setName(). 
		 *  What we can do it's going to instantiate the field of threadName by Constructor itself.
		   
		    log1.setName("CPU1");
			log2.setName("CPU2");
		*/
		
		/*
	     * Marks this thread as either a {@linkplain #isDaemon daemon} thread
	     * or a user thread. The Java Virtual Machine exits when the only
	     * threads running are all daemon threads.
	     *
	     * <p> This method must be invoked before the thread is started.
	     *
	     * @param  on
	     *         if {@code true}, marks this thread as a daemon thread
	     *
	     * @throws  IllegalThreadStateException
	     *          if this thread is {@linkplain #isAlive alive}
	     *
	     * @throws  SecurityException
	     *          if {@link #checkAccess} determines that the current
	     *          thread cannot modify this thread
	     
		    public final void setDaemon(boolean on) {
		        checkAccess();
		        if (isAlive()) {
		            throw new IllegalThreadStateException();
		        }
		        daemon = on;
		    }
		*/
		Thread thread1 = new Thread(log1);
		Thread thread2 = new Thread(log2);
		thread1.start();
		thread1.setDaemon(true);
		thread2.setDaemon(false);		
		thread2.start();
		System.out.printf("Thread Active Count: %d\n", Thread.activeCount());
	}
}

/*

	JVM exits when the only threads running are all daemon threads:	
	
	Exception in thread "main" java.lang.IllegalThreadStateException
	User thread of CPU1 operating 	at java.base/java.lang.Thread.setDaemon(Thread.java:1400)
		at com.ocp.day20.runnable.daemon.DaemonRunnableExample2.main(DaemonRunnableExample2.java:61)
	1
	User thread of CPU1 operating 2
	User thread of CPU1 operating 3
	User thread of CPU1 operating 4
	User thread of CPU1 operating 5
	User thread of CPU1 operating 6
	User thread of CPU1 operating 7
	User thread of CPU1 operating 8
	User thread of CPU1 operating 9
	User thread of CPU1 operating 10
	User thread of CPU1 operating 11
	User thread of CPU1 operating 12
	User thread of CPU1 operating 13
	User thread of CPU1 operating 14
	User thread of CPU1 operating 15
	User thread of CPU1 operating 16
	User thread of CPU1 operating 17
	User thread of CPU1 operating 18
	User thread of CPU1 operating 19
	User thread of CPU1 operating 20
	User thread of CPU1 operating 21
	User thread of CPU1 operating 22
	User thread of CPU1 operating 23
	User thread of CPU1 operating 24
	User thread of CPU1 operating 25
	User thread of CPU1 operating 26
	User thread of CPU1 operating 27
	User thread of CPU1 operating 28
	User thread of CPU1 operating 29
	User thread of CPU1 operating 30
	User thread of CPU1 operating 31
	User thread of CPU1 operating 32
	User thread of CPU1 operating 33
	User thread of CPU1 operating 34
	User thread of CPU1 operating 35
	User thread of CPU1 operating 36
	User thread of CPU1 operating 37
	User thread of CPU1 operating 38
	User thread of CPU1 operating 39
	User thread of CPU1 operating 40
	User thread of CPU1 operating 41
	User thread of CPU1 operating 42
	User thread of CPU1 operating 43
	User thread of CPU1 operating 44
	User thread of CPU1 operating 45
	User thread of CPU1 operating 46
	User thread of CPU1 operating 47
	User thread of CPU1 operating 48
	User thread of CPU1 operating 49
	User thread of CPU1 operating 50
	User thread of CPU1 operating 51
	User thread of CPU1 operating 52
	User thread of CPU1 operating 53
	User thread of CPU1 operating 54
	User thread of CPU1 operating 55
	User thread of CPU1 operating 56
	User thread of CPU1 operating 57
	User thread of CPU1 operating 58
	User thread of CPU1 operating 59
	User thread of CPU1 operating 60
	User thread of CPU1 operating 61
	User thread of CPU1 operating 62
	User thread of CPU1 operating 63
	User thread of CPU1 operating 64
	User thread of CPU1 operating 65
	User thread of CPU1 operating 66
	User thread of CPU1 operating 67
	User thread of CPU1 operating 68
	User thread of CPU1 operating 69
	User thread of CPU1 operating 70
	User thread of CPU1 operating 71
	User thread of CPU1 operating 72
	User thread of CPU1 operating 73
	User thread of CPU1 operating 74
	User thread of CPU1 operating 75
	User thread of CPU1 operating 76
	User thread of CPU1 operating 77
	User thread of CPU1 operating 78
	User thread of CPU1 operating 79
	User thread of CPU1 operating 80
	User thread of CPU1 operating 81
	User thread of CPU1 operating 82
	User thread of CPU1 operating 83
	User thread of CPU1 operating 84
	User thread of CPU1 operating 85
	User thread of CPU1 operating 86
	User thread of CPU1 operating 87
	User thread of CPU1 operating 88
	User thread of CPU1 operating 89
	User thread of CPU1 operating 90
	User thread of CPU1 operating 91
	User thread of CPU1 operating 92
	User thread of CPU1 operating 93
	User thread of CPU1 operating 94
	User thread of CPU1 operating 95
	User thread of CPU1 operating 96
	User thread of CPU1 operating 97
	User thread of CPU1 operating 98
	User thread of CPU1 operating 99
	User thread of CPU1 operating 100
	
*/