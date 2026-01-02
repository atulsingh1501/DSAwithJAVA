package week2QuestionsPractice;
import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;

        }
        System.out.println(rev);
    }
}
