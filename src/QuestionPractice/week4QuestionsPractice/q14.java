package QuestionPractice.week4QuestionsPractice;
import java.util.Scanner;
public class q14 {
//    Task:
//
//Take marks (0–100) as input
//
//Print:
//
//A if marks ≥ 90
//
//B if marks ≥ 75
//
//C if marks ≥ 50
//
//Fail otherwise
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=75){
            System.out.println("B");
        }else if(marks>=50){
            System.out.println("C");

        }else{
            System.out.println("Fail");
        }
    }
}
