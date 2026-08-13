package Sorting;
import java.util.*;

public class O2_selectionSortFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements:");
        // 1. Fill the array completely first
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. Call Selection Sort and print AFTER reading all inputs
        Selection(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        sc.close();
    }

    static void Selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 3. Swap the minimum element with the element at position i
            swap(arr, minIndex, i);
        }
    }

    // 4. Pass indices as parameters so swap knows which elements to exchange
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}