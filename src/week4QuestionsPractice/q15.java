package week4QuestionsPractice;
import java.util.Scanner;
public class q15 {
//    Q1: Write a function that returns the square of a number
    static int square(int x){
        return x*x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       int result = square(a);
       System.out.println(result);


       sc.close();
    }
}
