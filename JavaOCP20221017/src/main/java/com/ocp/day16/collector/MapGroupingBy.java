package com.ocp.day16.collector;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class MapGroupingBy {
	
	public static void main(String[] args) {	
		List<PurchasedOrder> bookList = Arrays.asList(
			new PurchasedOrder("English", 3, 32.0),
			new PurchasedOrder("Math", 5, 35.0),
			new PurchasedOrder("Math", 5, 35.0),
			new PurchasedOrder("Math", 5, 35.0),
			new PurchasedOrder("Science", 2, 40.0),
			new PurchasedOrder("Math", 5, 35.0),
			new PurchasedOrder("History", 2, 40.0)
		);		
		
		System.out.println(bookList);
		
		// Collect the data of productName v.s. repeated quantity of book name
		Map<String, Long> collectedProductName4RepeatedQuantity = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.counting())
		);		
		System.out.println(collectedProductName4RepeatedQuantity);
		
		// Collect the data of productName v.s. quantity of book
		Map<String, Integer> collectedProductName4QuantityInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.summingInt(PurchasedOrder::getQuantity))
		);				
		System.out.println(collectedProductName4QuantityInGroupingBy);

		// Collect the data of productName v.s. price of book
		Map<String, Double> collectedProductName4PriceInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getProductName, Collectors.summingDouble(PurchasedOrder::getPrice))
		);				
		System.out.println(collectedProductName4PriceInGroupingBy);

		// Collect the data of price of book v.s. List<PurchasedOrder>
		Map<Double, List<PurchasedOrder>> collectedPrice4BookList = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getPrice)			
		);
		System.out.println(collectedPrice4BookList);
		
		// Collect the data of price of book v.s. Set<String>
		Map<Double, Set<String>> collectedPrice4ProductNameInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getPrice, Collectors.mapping(PurchasedOrder::getProductName, Collectors.toSet()))				
		);
		System.out.println(collectedPrice4ProductNameInGroupingBy);				
		
	}
}

/*
	Console:
			[PurchasedOrder [productName=English, quantity=3, price=32.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Science, quantity=2, price=40.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=History, quantity=2, price=40.0]]
			{English=1, Science=1, History=1, Math=4}
			{English=3, Science=2, History=2, Math=20}
			{English=32.0, Science=40.0, History=40.0, Math=140.0}
			{32.0=[PurchasedOrder [productName=English, quantity=3, price=32.0]], 35.0=[PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0], PurchasedOrder [productName=Math, quantity=5, price=35.0]], 40.0=[PurchasedOrder [productName=Science, quantity=2, price=40.0], PurchasedOrder [productName=History, quantity=2, price=40.0]]}
			{32.0=[English], 35.0=[Math], 40.0=[Science, History]}
*/