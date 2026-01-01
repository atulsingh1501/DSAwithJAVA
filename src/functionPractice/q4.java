package functionPractice;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = countDigits(n);
        System.out.println(result);

        sc.close();
    }

    static int countDigits(int n) {
        int count = 0;

        if (n == 0) {
            return 1;
        }

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }
}
