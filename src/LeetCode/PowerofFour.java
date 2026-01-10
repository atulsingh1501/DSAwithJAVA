package LeetCode;

import java.util.Scanner;

public class PowerofFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Power of four must be positive
        if (n <= 0) {
            System.out.println("Not a Power of Four");
            sc.close();
            return;
        }

        // Keep dividing by 4 while divisible
        while (n % 4 == 0) {
            n = n / 4;
        }

        // After complete division it should become 1
        if (n == 1) {
            System.out.println("Power of Four");
        } else {
            System.out.println("Not a Power of Four");
        }

        sc.close();
    }
}
