package week3QuestionsPractice;

// This class is used to practice array + loop + function logic
public class q4 {

    // This function takes an integer array as input
    // Its job is to calculate the sum of all elements in the array
    // It does not return anything (void)
    static void Funcn(int[] arr) {

        // Initialize sum variable to 0
        // This will store the total of array elements
        int sum = 0;

        // Loop through the array starting from index 0
        // Loop continues while index is less than array length
        for (int i = 0; i < arr.length; i++) {

            // Add current element to sum
            // Example:
            // sum = 0 + arr[0]
            // sum = arr[0] + arr[1]
            sum = sum + arr[i];
        }

        // Print the final sum after loop ends
        System.out.println("Sum of array elements: " + sum);
    }

    // main method is the starting point of the program
    public static void main(String[] args) {

        // Create an integer array with some values
        int[] arr = {5, 10, 15};

        // Call the function and pass the array to it
        // The function will calculate and print the sum
        Funcn(arr);
    }
}
