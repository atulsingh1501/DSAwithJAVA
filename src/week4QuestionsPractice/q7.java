package week4QuestionsPractice;
import java.util.Scanner;
public class q7 {
//    Find the sum of first N natural numbers using a loop.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
