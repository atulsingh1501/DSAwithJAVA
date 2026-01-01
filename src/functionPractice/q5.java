package functionPractice;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = sumDigits(n);
        System.out.println(result);

        sc.close();
    }
    static int sumDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;   // get last digit
            sum = sum + digit;   // add digit to sum
            n = n / 10;          // remove last digit
        }

        return sum;
    }

}
