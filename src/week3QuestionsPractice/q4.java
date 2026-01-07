package week3QuestionsPractice;
import java.util.Arrays;
public class q4 {

    static void sumArray(int[]arr){
        int sum=0;
        for(int i = 0;i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements: " + sum);

    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        sumArray(arr);
    }
}
