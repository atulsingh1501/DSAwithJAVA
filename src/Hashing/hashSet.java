package Hashing;
import java.util.*;
public class hashSet {
        public static void main(String[] args) {

            // Create a HashSet of Integers
            HashSet<Integer> set = new HashSet<>();

            // Add elements
            set.add(10);
            set.add(20);
            set.add(30);

            // Duplicate value
            set.add(20); // ❌ Not added because 20 already exists

            // Print the HashSet
            System.out.println(set);
            // Output: [20, 10, 30]  (order is not guaranteed)

            // Check if an element exists
            System.out.println(set.contains(20)); // true
            System.out.println(set.contains(50)); // false

            // Remove an element
            set.remove(10);

            System.out.println(set);
            // Output: [20, 30]

            // Size of HashSet
            System.out.println(set.size());
            // Output: 2

            // Check if empty
            System.out.println(set.isEmpty());
            // Output: false

            // Loop through HashSet
            for (int num : set) {
                System.out.println(num);
            }
        }
}

