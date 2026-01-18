package week4QuestionsPractice;
import java.util.Scanner;

public class q18 {

    // This function checks whether a number is prime or not
    static boolean isPrime(int n) {

        // Step 1: Numbers less than or equal to 1 are NOT prime
        if (n <= 1) {
            return false;
        }

        // Step 2: Check divisibility from 2 to n-1
        for (int i = 2; i <= n - 1; i++) {

            // If n is divisible by any number other than 1 and itself
            // then it is NOT a prime number
            if (n % i == 0) {
                return false;   // exit function immediately
            }
        }

        // Step 3: If no divisor was found, the number is prime
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number input from user
        int n = input.nextInt();

        // Call isPrime function and store result
        boolean result = isPrime(n);

        // Print true if prime, false otherwise
        System.out.println(result);
        input.close();
    }
}

//🔑 ONE-LINE LOGIC (remember this)
//A number is prime if it is greater than 1 and not divisible by any number except 1 and itself.