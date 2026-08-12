package QuestionPractice.week4QuestionsPractice;
import java.util.Scanner;

public class q19 {
//    question 5 – Void Function: Print Even Numbers from 1 to N
//📌 Task recap
//
//Write a void function
//
//It takes N as parameter
//
//It prints all even numbers from 1 to N
//
//It does not return anything
    // Void function because it only prints, does not return anything
//    static void printEven(int n) {
//    for (int i = 2; i <= n; i += 2) {
//        System.out.println(i);
//    }
//}or
    static void printEven(int n) {

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {

            // Check if number is even
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        int n = input.nextInt();

        // Call the void function
        printEven(n);

        input.close();
    }
}
//Why doesn’t evenNumber() have a return statement?
//Void functions are designed to perform an action (like printing or modifying something) rather than calculate and return a value.