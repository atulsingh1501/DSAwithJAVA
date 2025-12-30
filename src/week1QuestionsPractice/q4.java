package week1QuestionsPractice;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        F = (C × 9 / 5) + 32
        // take input
        // apply formula
        // print result
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("your temperater in fahrenheit: " + fahrenheit);

    }
}
