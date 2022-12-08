package com.ocp.day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Supplier;
public class SupplierDemo {
	public static void main(String[] args) {
		/*
		 	@FunctionalInterface
			public interface Supplier<T> {
	    
	     		// Gets a result.
	     
	     		// @return a result
	     
	    		T get();
			}
		*/
		Supplier<String> supplier = new Supplier<>() {
			@Override
			public String get() {
				return "Lambda Expression - Supplier";
			}
		};
		
		System.out.println(supplier.get());
		
		Supplier<String> supplierInSimpleDate = () -> {
			// a          -> AM or PM
			// hh:mm:ss   -> hour:min:sec
			// E          -> Day
			// yyyy-MM-dd -> year-month-date
			// Notice here: 
			// 1) Don't relocate the 'a' or 'E" to different position
			//    E.g., E yyyy-MM-dd  or  a yyyy-MM-dd
			// 2) Case-sensitive - following is wrong
			//    E.g., YYYY-MM-DD    or  hh:MM:ss
			SimpleDateFormat simpleDateFormat01 = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat simpleDateFormat02 = new SimpleDateFormat("hh:mm:ss");			
			SimpleDateFormat simpleDateFormat03 = new SimpleDateFormat("hh:mm:ss E");
			SimpleDateFormat simpleDateFormat04 = new SimpleDateFormat("yyyy-MM-dd a");
			SimpleDateFormat simpleDateFormat05 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
				
			return 	simpleDateFormat01.format(new Date()) + " | " 
				  + simpleDateFormat02.format(new Date()) + " | "
				  + simpleDateFormat03.format(new Date()) + " | "
				  + simpleDateFormat04.format(new Date()) + " | "
				  + simpleDateFormat05.format(new Date());
		};
		
		System.out.println(supplierInSimpleDate.get());
		
	}
}
