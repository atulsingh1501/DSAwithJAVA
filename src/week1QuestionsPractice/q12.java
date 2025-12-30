package week1QuestionsPractice;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("Eligible");
        }else  {
            System.out.println("Not eligible");
        }
    }
}
