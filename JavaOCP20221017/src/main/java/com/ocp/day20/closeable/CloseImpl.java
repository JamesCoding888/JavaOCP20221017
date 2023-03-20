package com.ocp.day20.closeable;
import java.io.Closeable;
import java.io.IOException;
public class CloseImpl implements Closeable {
	public CloseImpl() {
		super();
		System.out.println("Start Connection");
	}
	
	public void printData() throws Exception {
		System.out.println("Acquire data");
		throw new Exception("exception");
	}
	
	@Override
	public void close() throws IOException {
		System.out.println("Close Connection");	
	}
}