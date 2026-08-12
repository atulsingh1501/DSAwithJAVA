package QuestionPractice.week4QuestionsPractice;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
//        Print even numbers from 1 to N.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//        for(int i = 1; i <= n; i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
