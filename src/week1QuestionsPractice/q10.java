package week1QuestionsPractice;
import java.util.Scanner;
public class q10 {
//    Grade System Input: marks (0–100) Output: A → marks ≥ 90  B → marks ≥ 75  C → marks ≥ 60   Fail → otherwise
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }
    }
}
