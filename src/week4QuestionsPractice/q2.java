package week4QuestionsPractice;
import java.util.Arrays;
import java.util.Scanner;

//Write a function that takes a number and prints:
//
//"Positive" if number > 0
//
//"Negative" if number < 0
//
//"Zero" if number == 0
//
//👉 Focus: if / else if / else
public class q2 {
    static void checkNumber(int number){
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();

        checkNumber(n);

    }
}
