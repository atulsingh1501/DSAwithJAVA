package week3QuestionsPractice;

public class q11 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 10};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
//🔹 Problem
//
//Given an integer array, count how many even and odd numbers are present.
//
//Example
//Input:  [2, 5, 8, 7, 10]
//Output: Even = 3, Odd = 2
//
//🧠 Logic (simple)
//
//Loop through the array
//
//If number % 2 == 0 → even
//
//Else → odd