package week2QuestionsPractice;

import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int count = 0;
         if (n == 0) {
             count = 1;
         } else {
            while (n > 0) {
                count++;
                n = n / 10;
            }
        }

        System.out.println(count);
    }

}
