import java.util.Scanner;
//Palindrome Number leet code 9
public class palindromnumber9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Not a Palindrome");
            return;
        }

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
