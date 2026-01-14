package week4QuestionsPractice;
import java.util.Arrays;
// Class name
public class q3 {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // 1D array input
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Stores the largest element found so far
        // Initialized to minimum possible int value to handle negative numbers
        int largest = Integer.MIN_VALUE;

        // Stores the second largest element
        int secondLargest = Integer.MIN_VALUE;

        // Loop through each element of the array
        for (int i = 0; i < arr.length; i++) {

            // If current element is greater than largest
            if (arr[i] > largest) {

                // Previous largest becomes second largest
                secondLargest = largest;

                // Update largest with current element
                largest = arr[i];
            }

            // If current element is smaller than largest
            // but greater than secondLargest
            // and not equal to largest (to avoid duplicates)
            else if (arr[i] > secondLargest && arr[i] != largest) {

                // Update second largest
                secondLargest = arr[i];
            }
        }

        // Print the second largest element
        System.out.println("Second Largest: " + secondLargest);
    }
}

//Question
//
//Given an integer array, find the second largest element in the array.
//
//Conditions:
//
//Array size ≥ 2
//
//Elements may be negative
//
//Do NOT sort the array
