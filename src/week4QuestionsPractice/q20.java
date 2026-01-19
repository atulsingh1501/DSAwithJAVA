package week4QuestionsPractice;
import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();      // size of array
        int[] arr = new int[n];       // array declaration

        // taking array input
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        // printing array elements
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        input.close();
    }
}
