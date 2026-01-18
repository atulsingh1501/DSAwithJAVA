package week4QuestionsPractice;
import java.util.Scanner;

public class q9 {
//    Count the number of digits in a given number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println(count);
    }
}
