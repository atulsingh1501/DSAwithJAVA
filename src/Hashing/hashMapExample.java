package Hashing;

import java.util.HashMap;

public class hashMapExample {

    public static void main(String[] args) {

        // Create a HashMap
        // Key = String
        // Value = Integer
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Atul", 90);
        map.put("Rahul", 80);
        map.put("Raj", 70);

        // Print the entire HashMap
        System.out.println(map);

        // Get value using key
        System.out.println(map.get("Atul"));

        // Check if a key exists
        System.out.println(map.containsKey("Atul"));

        // Check if a value exists
        System.out.println(map.containsValue(80));

        // Update value
        map.put("Atul", 95);

        System.out.println(map.get("Atul"));

        // Remove using key
        map.remove("Raj");

        // Get current frequency of ch (0 if not present), then increase it by 1
        map.put("Atul", map.getOrDefault("Atul", 0) + 1);

        System.out.println(map);

        // Loop through HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}