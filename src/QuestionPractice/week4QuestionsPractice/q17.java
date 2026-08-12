package QuestionPractice.week4QuestionsPractice;
import java.util.Scanner;
public class q17 {
//    Q3. Factorial
//
//Write a function that:
//
//Takes a number n
//
//Returns its factorial
    static int factFun(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int fact=factFun(n);
        System.out.println(fact);

        input.close();
    }
}
