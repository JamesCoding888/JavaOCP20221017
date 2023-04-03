package com.ocp.day20.executor;

import java.util.concurrent.Executor;
 
// ExecutorTask implements the Executor interface 
public class ExecutorTask implements Executor {

	@Override
	public void execute(Runnable command) {
		new Thread(command).start();	
	}
}
