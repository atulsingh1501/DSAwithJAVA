package week4QuestionsPractice;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }
}
