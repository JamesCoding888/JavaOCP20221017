package com.ocp.day16.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import com.google.common.collect.ImmutableList;
public class CollectionSortingAndImmutabilityDemo {
    public static void main(String[] args) {
        // Initialize the list
        List<Double> list = new ArrayList<>();
        list.add(20.2);
        list.add(10.5);
        list.add(5.5);
        list.add(9.5);

        // =============== Comparator & Collections.sort ===============
        // # 1 - Using traditional anonymous class for Comparator
        /*
        Comparator<Double> comparator = new Comparator<>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        };
        list.sort(comparator);
        System.out.println("After sorting: " + list);
        */

        // # 2 - Using Comparator with Collections.sort and anonymous class
        /*
        Collections.sort(list, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        });
        System.out.println(list);
        */

        // # 3 - Using Lambda Expression for Comparator
        /*
        Comparator<Double> comparator = (Double o1, Double o2) -> {
            return Double.compare(o1, o2);  // Ascending Order
        };
        Collections.sort(list, comparator);
        System.out.println(list);
        */

        // ======== BiConsumer with Lambda Expression ========
        /*
        Comparator<Double> comparator = (Double o1, Double o2) -> {
            return Double.compare(o1, o2);  // Ascending Order
        };
        BiConsumer<List<Double>, Comparator<Double>> biConsumer = (l, c) -> Collections.sort(l, c);
        
        biConsumer.accept(list, comparator);
        System.out.println(list);
        */
        
        // =============== Unmodifiable List Examples ===============
        
        // # 4 - Using Collections.unmodifiableList (Read-only view of the list)
        /*
        List<Double> listView = Collections.unmodifiableList(list);
        System.out.println(listView);
        try {
            listView.add(2.2);  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification attempt failed: " + e);
        }
        // Modifying the original list
        list.add(25.0); 
        System.out.println("Unmodifiable List after original list modification: " + listView);
        */

        // # 5 - Creating a completely immutable copy with unmodifiableList
        /*
        List<Double> listView = Collections.unmodifiableList(new ArrayList<>(list));
        System.out.println(listView);
        try {
            listView.add(2.2);  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification attempt failed: " + e);
        }
        // Modifying the original list
        list.add(25.0); 
        System.out.println("Unmodifiable List after original list modification: " + listView);
        */

        // # 6 - Using List.copyOf (Java 10+)
        /*
        List<Double> listView = List.copyOf(list);
        System.out.println(listView);
        try {
            listView.add(2.2);  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification attempt failed: " + e);
        }
        // Modifying the original list
        list.add(25.0); 
        System.out.println("Unmodifiable List after original list modification: " + listView);
        */

        // # 7 - Using Guava's ImmutableList (Requires Guava library)
        /**
         * This class requires the following Maven dependency:
         * <dependency>
         *     <groupId>com.google.guava</groupId>
         *     <artifactId>guava</artifactId>
         *     <version>32.1.2-jre</version>
         * </dependency>
         */
        ImmutableList<Double> immutableList = ImmutableList.copyOf(list);
        System.out.println(immutableList);
        try {
            immutableList.add(2.2);  // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Modification attempt failed: " + e);
        }
        // Modifying the original list
        list.add(25.0); 
        System.out.println("Immutable List after original list modification: " + immutableList);
    }
}