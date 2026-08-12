package Sorting;
import java.util.*;

public class O1_bubble_short {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of array: ");
        int n = sc.nextInt();

        System.out.print("Create Array: ");
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] =sc.nextInt();
        }
       // Bubble Sort is a comparison-based sorting algorithm.
        // It compares adjacent elements and swaps them if they are in the wrong order.
        // After every pass, the greatest element moves to the last unsorted position of the array.
        for(int i = 0; i< n; i++){
            for(int j = 1; j<n ; j++){
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println( "Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }
}