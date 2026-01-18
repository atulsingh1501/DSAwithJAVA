package week4QuestionsPractice;
import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        if ( (n % 400 == 0) || (n % 4 == 0 && n % 100 != 0) ) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");

        }
        input.close();
    }
}
