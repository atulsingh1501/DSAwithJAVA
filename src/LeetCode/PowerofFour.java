import java.util.Scanner;
//342. Power of Four leetcode
public class PowerofFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Power of Four");
            return;
        }

        while (n % 4 == 0) {
            n = n / 4;
        }

        if (n == 1) {
            System.out.println("Power of Four");
        } else {
            System.out.println("Not a Power of Four");
        }

        sc.close();
    }
}
