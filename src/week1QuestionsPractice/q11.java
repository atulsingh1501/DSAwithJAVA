package week1QuestionsPractice;

import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

//        if (year % 400 == 0 && year % 4 == 0) {
//            System.out.println("Leap");
//        }else if (year % 100 == 0) {
//            System.out.println("Not Leap");
//        }else {
//            System.out.println("Not Leap");
        if(year % 400 == 0){
            System.out.println("Leap");
        }else if(year % 100 == 0){
            System.out.println("Not Leap");
        }else if(year % 4 == 0){
            System.out.println("Leap");
        }else{
            System.out.println("Not Leap");
    }
}
}
