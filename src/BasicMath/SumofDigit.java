package BasicMath;

public class SumofDigit {
    public static void main(String[] args) {

        int n = 213124;
        int sum = 0;

        while(n > 0) {
            int digit = n % 10;
            sum = sum + digit;

            n = n / 10;
        }

        System.out.println("Sum = " + sum);
    }
}