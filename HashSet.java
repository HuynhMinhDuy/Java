package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Adding a duplicate element (ignored)

        // Print the HashSet
        System.out.println(set); // Output: [Orange, Apple, Banana]

        // Check if an element is present in the HashSet
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains Apple ? " + containsApple); // Output: true

        // Remove an element from the HashSet
        set.remove("Banana");

        // Iterate over the elements of the HashSet
        for (String element : set) {
            System.out.println(element);
        }
    }
}
