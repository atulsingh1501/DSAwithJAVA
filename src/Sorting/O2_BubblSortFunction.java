package Sorting;

import java.util.*;

public class O2_BubblSortFunction {

    // Bubble Sort function
    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the function
        bubbleSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}