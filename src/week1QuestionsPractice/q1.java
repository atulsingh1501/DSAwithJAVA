package week1QuestionsPractice;

import java.util.Scanner;
public class q1 {
//    1️⃣ Take two integers and print: sum, difference,   product , quotient
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();

    System.out.println(a+b);
    System.out.println(a*b);
    System.out.println(a-b);
//    System.out.println((double) a / b);
    if (b != 0) {
        System.out.println((double) a / b);
    } else {
        System.out.println("Division not possible");
    }


}
}
