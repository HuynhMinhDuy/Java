package org.example;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // Create a new HashMap instance
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("John", 25);
        map.put("Emily", 30);
        map.put("Alex", 27);

        // Access values by key
        int johnsAge = map.get("John");
        System.out.println("John's age: " + johnsAge);

        //If the key does not exist, retun default value
        int peterAge = map.getOrDefault("Peter", 20);
        System.out.println("Peter's age : " + peterAge);

        // Update the value associated with a key
        map.put("John", 26);

        // Remove a key-value pair
        map.remove("Emily");

        // Check if a key exists in the HashMap
        boolean hasAlex = map.containsKey("Alex");
        System.out.println("Has Alex? " + hasAlex);

        // Iterate over the HashMap
        for (String name : map.keySet()) {
            int age = map.get(name);
            System.out.println(name + "'s age: " + age);
        }

        // Get the size of the HashMap
        int size = map.size();
        System.out.println("Size of the HashMap: " + size);

        // Clear all key-value pairs from the HashMap
        map.clear();

    }
}
