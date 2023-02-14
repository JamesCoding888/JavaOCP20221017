package com.ocp.day16.collector;
/*
  	 	
	Collections.sort
		-   
	
	Collectors.groupingBy
		- 
	
	SQL Syntax of groupingBy
    	- 
 
 	<Map<String, Long>, Object> Map<String, Long> java.util.stream.Stream.collect(Collector<? super PurchasedOrder, Object, Map<String, Long>> collector)
 	
 	
*/




import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class MapGroupingBy {
	public static void main(String[] args) {	

		// Arrays.asList fixed size of list 
		List<PurchasedOrder> bookList = Arrays.asList(
			new PurchasedOrder("English", 3, 32.0),
			new PurchasedOrder("Math"   , 5, 35.0),
			new PurchasedOrder("Math"   , 5, 35.0),
			new PurchasedOrder("Math"   , 5, 35.0),
			new PurchasedOrder("Science", 2, 40.0),
			new PurchasedOrder("Math"   , 5, 35.0),
			new PurchasedOrder("History", 2, 40.0)
		);		
		
		System.out.println(bookList);
		
		// Collect the data of productName v.s. repeated quantity of book name
		Map<String, Long> collectedProductName4RepeatedQuantity = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.counting())
		);		
		System.out.println("collectedProductName4RepeatedQuantity: " + collectedProductName4RepeatedQuantity);
		
		// Collect the data of productName v.s. quantity of book
		Map<String, Integer> collectedProductName4QuantityInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.summingInt(PurchasedOrder::getQuantity))
		);				
		System.out.println("collectedProductName4QuantityInGroupingBy: " + collectedProductName4QuantityInGroupingBy);

		// Collect the data of productName v.s. price of book
		Map<String, Double> collectedProductName4PriceInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.summingDouble(PurchasedOrder::getPrice))
		);				
		System.out.println("collectedProductName4PriceInGroupingBy: " + collectedProductName4PriceInGroupingBy);

		// Collect the data of price of book v.s. List<PurchasedOrder>
		Map<Double, List<PurchasedOrder>> collectedPrice4BookList = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getPrice)			
		);
		System.out.println("collectedPrice4BookList: " + collectedPrice4BookList);
		
		// Collect the data of price of book v.s. Set<String>
		Map<Double, Set<String>> collectedPrice4ProductNameInGroupingBy = bookList.stream().collect(
				/*
				 	If developer expected to reduce typing too many characters for invoking the API of Collectors.
					The following syntaxes of mapping and toSet() for your reference. 
					To be noticed, developer shall import the path of JRE System Library and also must give a "static" in front of path.
					
					import static java.util.stream.Collectors.mapping;
					import static java.util.stream.Collectors.toSet;
				*/ 				
				Collectors.groupingBy(PurchasedOrder::getPrice, mapping(PurchasedOrder::getProductName, toSet()))				
		);
		
		System.out.println("collectedPrice4ProductNameInGroupingBy: " + collectedPrice4ProductNameInGroupingBy);				
	
	}
}

/*
	Console:
			[PurchasedOrder [productName=English, quantity=3, price=32.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Science, quantity=2, price=40.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=History, quantity=2, price=40.0]]
			collectedProductName4RepeatedQuantity: {English=1, Science=1, History=1, Math=4}
			collectedProductName4QuantityInGroupingBy: {English=3, Science=2, History=2, Math=20}
			collectedProductName4PriceInGroupingBy: {English=32.0, Science=40.0, History=40.0, Math=140.0}
			collectedPrice4BookList: {32.0=[PurchasedOrder [productName=English, quantity=3, price=32.0]], 35.0=[PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0]], 40.0=[PurchasedOrder [productName=Science, quantity=2, price=40.0], PurchasedOrder [productName=History, quantity=2, price=40.0]]}
			collectedPrice4ProductNameInGroupingBy: {32.0=[English], 35.0=[Math], 40.0=[Science, History]}

*/