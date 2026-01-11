package week3QuestionsPractice;

public class q12 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};

            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
//Question 2: Reverse an Array
//🔹 Problem
//
//Reverse the elements of an array without using another array.
//
//Example
//Input:  [1, 2, 3, 4]
//Output: [4, 3, 2, 1]
//🧠 Logic
//
//Use two pointers
//
//Swap first and last
//
//Move inward