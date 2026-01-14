package multidimensionalArray;
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
import java.util.Arrays;
public class OneDarray {
        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            System.out.println("Second Largest: " + secondLargest);
        }
    }

