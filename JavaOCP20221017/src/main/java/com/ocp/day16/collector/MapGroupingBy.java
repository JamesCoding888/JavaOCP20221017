package com.ocp.day16.collector;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class MapGroupingBy {
	public static void main(String[] args) {
		List<PurchasedOrder> bookList = Arrays.asList(
			new PurchasedOrder("Alan_Beaulieu-Learning_SQL-EN", 3, 32.0),
			new PurchasedOrder("Effective.Java.3rd.Edition", 5, 35.0),
			new PurchasedOrder("Effective.Java.3rd.Edition", 5, 35.0),
			new PurchasedOrder("[O`Reilly. Head First]", 5, 35.0),
			new PurchasedOrder("O'Reilly.High.Performance.MySQL", 2, 40.0),
			new PurchasedOrder("[O`Reilly. Head First]", 5, 35.0),
			new PurchasedOrder("O'Reilly.High.Performance.MySQL", 2, 40.0)
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

		// Collect the data of price of book v.s. price of book
		Map<Double, List<PurchasedOrder>> collectedPrice4BookList = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getPrice)			
		);
		System.out.println(collectedPrice4BookList);
		
		Map<Double, Set<String>> collectedPrice4ProductNameInGroupingBy = bookList.stream().collect(
				Collectors.groupingBy(PurchasedOrder::getPrice, Collectors.mapping(PurchasedOrder::getProductName, Collectors.toSet()))				
		);
		System.out.println(collectedPrice4ProductNameInGroupingBy);				
		
	}
}

/*
	Console:
			[PurchasedOrder [productName=Alan_Beaulieu-Learning_SQL-EN, quantity=3, price=32.0], PurchasedOrder [productName=Effective.Java.3rd.Edition, quantity=5, price=35.0], PurchasedOrder [productName=Effective.Java.3rd.Edition, quantity=5, price=35.0], PurchasedOrder [productName=[O`Reilly. Head First], quantity=5, price=35.0], PurchasedOrder [productName=O'Reilly.High.Performance.MySQL, quantity=2, price=40.0], PurchasedOrder [productName=[O`Reilly. Head First], quantity=5, price=35.0], PurchasedOrder [productName=O'Reilly.High.Performance.MySQL, quantity=2, price=40.0]]
			{Effective.Java.3rd.Edition=2, Alan_Beaulieu-Learning_SQL-EN=1, O'Reilly.High.Performance.MySQL=2, [O`Reilly. Head First]=2}
			{Effective.Java.3rd.Edition=10, Alan_Beaulieu-Learning_SQL-EN=3, O'Reilly.High.Performance.MySQL=4, [O`Reilly. Head First]=10}
			{Effective.Java.3rd.Edition=70.0, Alan_Beaulieu-Learning_SQL-EN=32.0, O'Reilly.High.Performance.MySQL=80.0, [O`Reilly. Head First]=70.0}
			{32.0=[PurchasedOrder [productName=Alan_Beaulieu-Learning_SQL-EN, quantity=3, price=32.0]], 35.0=[PurchasedOrder [productName=Effective.Java.3rd.Edition, quantity=5, price=35.0], PurchasedOrder [productName=Effective.Java.3rd.Edition, quantity=5, price=35.0], PurchasedOrder [productName=[O`Reilly. Head First], quantity=5, price=35.0], PurchasedOrder [productName=[O`Reilly. Head First], quantity=5, price=35.0]], 40.0=[PurchasedOrder [productName=O'Reilly.High.Performance.MySQL, quantity=2, price=40.0], PurchasedOrder [productName=O'Reilly.High.Performance.MySQL, quantity=2, price=40.0]]}
			{32.0=[Alan_Beaulieu-Learning_SQL-EN], 35.0=[Effective.Java.3rd.Edition, [O`Reilly. Head First]], 40.0=[O'Reilly.High.Performance.MySQL]}
 
*/