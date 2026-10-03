package Twopointer;

public class main {

    public static void main(String[] args) {

        // Array must be sorted for this approach
        int[] arr = {1, 2, 4, 6, 8, 9};

        // Target sum we are looking for
        int target = 10;

        // Two pointers
        int left = 0;
        int right = arr.length - 1;

        // Continue until the two pointers meet
        while (left < right) {

            // Calculate the sum of elements at both pointers
            int sum = arr[left] + arr[right];

            // If we found the target
            if (sum == target) {

                System.out.println(
                        "Pair found: " + arr[left] + " + " + arr[right]
                );

                break;
            }

            // If sum is too small,
            // move left pointer to increase the sum
            else if (sum < target) {
                left++;
            }

            // If sum is too large,
            // move right pointer to decrease the sum
            else {
                right--;
            }
        }
    }
}