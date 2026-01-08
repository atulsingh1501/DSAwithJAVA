package week3QuestionsPractice;
import java.util.Arrays;
public class q7 {
    public static void main(String[] args) {
        int[] arr = {};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            System.out.println(sum);
        }
        System.out.println( "total sum is " + sum);
    }
}
//Your turn (no skipping):
//
//Answer in words (no code):
//
//Why do we initialize sum = 0 and not 1?
//
//What will happen if the array is empty ([])?

//Ans 1:
//We initialize sum = 0 because sum represents no elements added yet.
//Starting from anything else would give a wrong result.
//
//        Ans 2:
//If the array is empty, the loop never runs, so sum stays 0 and 0 is printed.
//No error. Correct behavior.