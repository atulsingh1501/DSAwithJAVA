package week3QuestionsPractice;
import java.util.Arrays;
public class q9 {
//    Count even numbers in an array

    public static void main(String[] args) {
        int [] arr = {2, 5, 8, 11, 10};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}
