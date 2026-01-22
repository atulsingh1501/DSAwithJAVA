package week5QuestionsPractice;

import java.util.Arrays;

public class q1_Swap {
    static void swap(int[]arr, int index1, int index2 ) {
        /*
        Theory here:
int[] arr → reference to the original array
Java passes reference value, not a copy
So any change here → reflects in main()
         */
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;/*
        Why temp is mandatory?
Because without it, data is LOST.*/
    }
    public static void main(String[] args) {
        int[] arr = {0,2,4,5,7,8,9};
        swap(arr,0,5);/*Means:
        Swap value at index 0 → 0
        With value at index 5 → 8*/
        System.out.println(Arrays.toString(arr));

    }
}
/*

🔹 1. Arrays are passed by reference (technically reference value)

Methods can modify original array

No need to return array

🔹 2. Swapping requires a temporary variable

Prevents data overwrite

Fundamental algorithm concept

🔹 3. Why swap is important?

Because swap is used in:

Sorting algorithms (Bubble, Selection, Quick)

Reversing arrays

Two-pointer problems

Cyclic sort (very important for LeetCode)
 */