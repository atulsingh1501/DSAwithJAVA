package week3QuestionsPractice;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
//        Given an integer n, reverse the number and print it.
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int reverse = 0;

                while (n > 0) {
                    int lastDigit = n % 10;
                    reverse = reverse * 10 + lastDigit;
                    n = n / 10;
                }

                System.out.println(reverse);
                sc.close();
            }


    }

