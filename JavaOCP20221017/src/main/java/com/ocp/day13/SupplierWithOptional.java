package com.ocp.day13;
import java.util.Optional;
import java.util.function.Supplier;
/*
 * Real-World Applications:
 * 		Configuration and Defaults: Use Supplier to supply default configuration values when a user doesn't provide them.
 * 		Caching: Generate and store values only when needed to save resources.
 * 		Deferred Computation: Encapsulate complex logic that should only be executed when its result is required.
 */
public class SupplierWithOptional {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {return "Default Value";};
        Optional<String> optional = Optional.ofNullable(null);
        Optional<String> optional2 = Optional.ofNullable("happy");
        System.out.println(optional.orElseGet(supplier)); // Output: Default Value
        System.out.println(optional2.orElseGet(supplier)); 
	}
}
