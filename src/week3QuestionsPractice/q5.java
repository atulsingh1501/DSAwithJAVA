package week3QuestionsPractice;

public class q5 {

    // This function takes an array as input
    // It calculates the sum of elements
    // It RETURNS the sum (does not print)
    static int Funcn(int[] arr) {

        // Initialize sum to 0
        int sum = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {

            // Add each element to sum
            sum = sum + arr[i];
        }

        // Return the final sum to the caller
        return sum;
    }

    public static void main(String[] args) {

        // Create an array
        int[] arr = {5, 10, 15};

        // Call the function and store returned value
        int result = Funcn(arr);

        // Print the sum in main
        System.out.println("The sum is " + result);
    }
}
