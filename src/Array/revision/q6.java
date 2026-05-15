package Array.revision;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = arr.length - 1;

        // Reverse logic
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}