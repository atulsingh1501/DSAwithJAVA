package LeetCode;
import java.util.Scanner;
//LeetCode 263
public class uglynumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not an Ugly Number");
            return;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        if (n == 1) {
            System.out.println("Ugly Number");
        } else {
            System.out.println("Not an Ugly Number");
        }

        sc.close();
    }
}
