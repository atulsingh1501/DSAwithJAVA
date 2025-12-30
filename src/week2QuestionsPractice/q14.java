package week2QuestionsPractice;
import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i <= n; i++){

            for(int s = 1; s<=n-i; s++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//    *
//   **
//  ***
// ****
//*****