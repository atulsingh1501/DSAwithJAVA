package week4QuestionsPractice;
import java.util.Scanner;
public class q8 {
//    Print multiplication table of a number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int table = 0;
//
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
